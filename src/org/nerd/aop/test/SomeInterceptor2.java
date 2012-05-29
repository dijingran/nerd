/**
 * LogInterceptor.java 11:11:32 AM May 29, 2012
 *
 * Copyright(c) 2000-2012 HC360.COM, All Rights Reserved.
 */
package org.nerd.aop.test;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.nerd.aop.AbstractInterceptor;


/**
 * <p></p>
 * 
 * @author dixingxing	
 * @date May 29, 2012
 */
public class SomeInterceptor2 extends AbstractInterceptor{
	private static final Logger LOG = Logger.getLogger(SomeInterceptor2.class);
	@Override
	protected Object after(long beginTime, Object result, Object target,
			Method m, Object[] args) {
		LOG.debug("SomeInterceptor2.after!");
		return super.after(beginTime, result, target, m, args);
	}

	@Override
	protected boolean before(Object target, Method m, Object[] args) {
		LOG.debug("SomeInterceptor2.before!");
		return super.before(target, m, args);
	}

	@Override
	protected boolean error(Throwable t, Object target, Method m, Object[] args) {
		LOG.debug("SomeInterceptor2.error!");
		return super.error(t, target, m, args);
	}

}
