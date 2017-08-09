
package com.tm.ebank.web.bind.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.tm.ebank.user.Constants;

/**
 * 
 * date: 2017年2月22日 下午4:49:05
 *
 * @author tony.tan
 * @version
 * 
 */
@Target({ ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CurrentUser {
	/**
	 * 当前用户在request中的名字
	 *
	 * @return
	 */
	String value() default Constants.CURRENT_USER;
}
