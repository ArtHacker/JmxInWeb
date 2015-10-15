package com.senatry.jmxInWeb.exception;

import freemarker.template.TemplateException;

/**
 * <pre>
 * 调用freemarker的过程发送了错误
 * </pre>
 * 
 * @author 梁韦江 2015年10月15日
 */
public class FreeMarkerException extends BaseLogicException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final TemplateException ex;

	public FreeMarkerException(TemplateException ex) {
		super();
		this.ex = ex;
	}

	public TemplateException getEx() {
		return ex;
	}

}
