package com.appspot.choncheol.comm;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	/**
	 * 주어진 날짜를 yyyyMMddHHmmss 형식으로 돌려준다 
	 * @param date	Date Object
	 * @return yyyyMMddHHmmss 형식의 14자리 날짜
	 */
	public static String getDate (Date date) {
		
		if ( date == null) { return null; }
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		return sdf.format(date);
	}

	/**
	 * 주어진 날짜를 yyyyMMdd 형식으로 돌려줌 
	 * @param date
	 * @return
	 */
	public static String getShortDate(Date date) {
		if ( date == null) { return null; }

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		return sdf.format(date);		
	}
	
}
