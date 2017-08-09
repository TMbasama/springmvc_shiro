
package com.tm.ebank.user.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.tm.ebank.user.entity.User;
import com.tm.ebank.user.service.UserService;

/**
 * Function: TODO ADD FUNCTION.
 * date: 2017年2月22日 下午2:43:08 
 *
 * @author tony.tan
 * @version 
 * 
 */
public class UserRealm extends AuthorizingRealm{
	@Autowired
    private UserService userService;
	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * @see org.apache.shiro.realm.AuthorizingRealm#doGetAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection)
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		System.out.println("授权...");
		String username=(String) principals.getPrimaryPrincipal();
		SimpleAuthorizationInfo authorizationInfo=new SimpleAuthorizationInfo();
		//authorizationInfo.setRoles(userService.findRoles(username));
		//authorizationInfo.setStringPermissions(userService.findPermissions(username));
		return authorizationInfo;
	}

	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * @see org.apache.shiro.realm.AuthenticatingRealm#doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken)
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		System.out.println("验证...");
		String username=(String) token.getPrincipal();
		System.out.println("username:"+username);
		User user=null;
		try {
			user = userService.queryByName(username);
		} catch (Exception e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		System.out.println("find:"+user);
		if (user==null) {
			throw new UnknownAccountException();//没找到账号
		}
		if (Boolean.TRUE.equals(user.getLocked())) {
			throw new LockedAccountException();//账号锁定
		}
		SimpleAuthenticationInfo authenticationInfo=new SimpleAuthenticationInfo(
				user.getUsername(),
				user.getPassword(),
				ByteSource.Util.bytes(user.getCredentialsSalt()),
				this.getName());
		return authenticationInfo;
	}
	/**
	 * 
	 * @see org.apache.shiro.realm.AuthorizingRealm#clearCachedAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection)
	 */
	@Override
	protected void clearCachedAuthorizationInfo(PrincipalCollection principals) {
		
		
		super.clearCachedAuthorizationInfo(principals);
	}
	@Override
	protected void clearCachedAuthenticationInfo(PrincipalCollection principals) {
		
		
		super.clearCachedAuthenticationInfo(principals);
	}
	/**
	 * 
	 * @see org.apache.shiro.realm.CachingRealm#clearCache(org.apache.shiro.subject.PrincipalCollection)
	 */
	@Override
	protected void clearCache(PrincipalCollection principals) {
		
		
		super.clearCache(principals);
	}
	public void clearAllCachedAuthroizationInfo(){
		this.getAuthorizationCache().clear();
	}
	public void clearAllCachedAuthenticationInfo(){
		this.getAuthenticationCache().clear();
	}
	public void clearAllCache(){
		clearAllCachedAuthenticationInfo();
		clearAllCachedAuthroizationInfo();
	}

}

