package com.demo.struts.followyourstar.actions;

import java.sql.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.conversion.annotations.Conversion;
import com.opensymphony.xwork2.conversion.annotations.TypeConversion;

@Conversion()
public class IndexAction extends ActionSupport {
	private Date now = new Date(System.currentTimeMillis());

	@TypeConversion(converter = "com.demo.struts.followyourstar.converters")
	public Date getDateNow() {
		return now;
	}

	public String execute() throws Exception {
		now = new Date(System.currentTimeMillis());
		return SUCCESS;
	}
}
