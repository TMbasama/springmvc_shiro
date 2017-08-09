
package com.tm.ebank.web.exception;

import org.apache.shiro.authz.UnauthenticatedException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * date: 2017年2月24日 下午1:47:27 
 *
 * @author tony.tan
 * @version 
 * 
 */
@ControllerAdvice
public class DefaultExceptionHandler {
	/**后续根据不同的需求定制即可
	 * 没有权限 异常
	 * @param    
	 * @return
	 */
@ExceptionHandler({UnauthenticatedException.class})
@ResponseStatus(HttpStatus.UNAUTHORIZED)
public ModelAndView processUnauthenticatedException(NativeWebRequest request,UnauthenticatedException e){
	ModelAndView mv=new ModelAndView();
	mv.addObject("exception", e);
	mv.setViewName("unauthorized");
	return mv;
}
}

