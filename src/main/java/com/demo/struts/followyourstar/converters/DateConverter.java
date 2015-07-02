package com.demo.struts.followyourstar.converters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;
import org.springframework.stereotype.Repository;

@Repository
public class DateConverter extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		if (arg1 != null && arg1.length > 0 && arg1[0] != null
				&& arg1[0].length() > 0) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			try {
				return sdf.parse(arg1[0]);
			} catch (ParseException e) {
				//throw new TypeConversionException(e);
			}
		}
		return null;
	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		if (arg1 instanceof Date) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			return sdf.format((Date) arg1);
		}
		return "";
	}
}
