
package com.tm.ebank.user.service;

import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.tm.ebank.account.entity.AccountInfo;
import com.tm.ebank.user.entity.User;

/**
 * Function: TODO ADD FUNCTION. date: 2017年2月22日 下午2:52:28
 *
 * @author tony.tan
 * @version
 * 
 */
@Service
public class PasswordHelper {

    private RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();

    @Value("${password.algorithmName}")
    private String algorithmName = "md5";
    @Value("${password.hashIterations}")
    private int hashIterations = 2;

    public void setRandomNumberGenerator(RandomNumberGenerator randomNumberGenerator) {
        this.randomNumberGenerator = randomNumberGenerator;
    }

    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    public void setHashIterations(int hashIterations) {
        this.hashIterations = hashIterations;
    }
    /**
     * 
     * @param a1 前台传入的账户信息
     * @param a2 数据库里面的账户信息
     * @return
     *
     */
    public boolean DecryptPassword(AccountInfo info,AccountInfo dbInfo){
    	String newPassword = new SimpleHash(
                algorithmName,
                info.getAcct_pwd(),
                ByteSource.Util.bytes(dbInfo.getPwd_salt()),
                hashIterations).toHex();
    	if(newPassword.equals(dbInfo.getAcct_pwd())){
    		return true;
    	}
    	return false;
    }
    public void encryptPassword(AccountInfo accountInfo) {

    	accountInfo.setPwd_salt(randomNumberGenerator.nextBytes().toHex());

        String newPassword = new SimpleHash(
                algorithmName,
                accountInfo.getAcct_pwd(),
                ByteSource.Util.bytes(accountInfo.getPwd_salt()),
                hashIterations).toHex();

        accountInfo.setAcct_pwd(newPassword);
    }
    public void encryptPassword(User user) {

        user.setSalt(randomNumberGenerator.nextBytes().toHex());

        String newPassword = new SimpleHash(
                algorithmName,
                user.getPassword(),
                ByteSource.Util.bytes(user.getCredentialsSalt()),
                hashIterations).toHex();

        user.setPassword(newPassword);
    }
}
