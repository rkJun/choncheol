package com.appspot.choncheol.comm;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	/**
	 * �־��� ��¥�� yyyyMMddHHmmss �������� �����ش� 
	 * @param date	Date Object
	 * @return yyyyMMddHHmmss ������ 14�ڸ� ��¥
	 */
	public static String getDate (Date date) {
		
		if ( date == null) { return null; }
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		return sdf.format(date);
	}

	/**
	 * �־��� ��¥�� yyyyMMdd �������� ������ 
	 * @param date
	 * @return
	 */
	public static String getShortDate(Date date) {
		if ( date == null) { return null; }

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		return sdf.format(date);		
	}
	
}
