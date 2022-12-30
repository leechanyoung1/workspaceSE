package util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCalenderMain {

	public static void main(String[] args) throws Exception {
		/*
		 * system.currentTimeMillis
		 * 
		 */
		long currentTime =System.currentTimeMillis();
		System.out.println(currentTime);
		long stratTime = System.currentTimeMillis();
		Thread.sleep(12);
		long endTime = System.currentTimeMillis();
		long duration = endTime-stratTime;
		System.out.println("duration:"+duration);
		/*
		 * java.util.date
		 * 
		 */
		Date now = new Date();
		String nowString= now.toString();
		System.out.println(nowString);
		
		long currentTimeMillis1= now.getTime();
		System.out.println("Date.getTime()-->"+currentTimeMillis1);
		
		System.out.println("-----------simpledateformat[Date-->String]-------");
		/*
		 * SimpleDateFormat:Date객체의 시간을 문자열로 변경해주는 클래스
		 */
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년MM월dd일");
		String formatStr1 = sdf1.format(now);		
		System.out.println(formatStr1);
		
		sdf1.applyPattern("yyyy/MM/dd HH:mm:ss:SSSS");
		String formatStr2 = sdf1.format(now);
		System.out.println(formatStr2);
		
		sdf1.applyPattern("yyyy");
		String yearStr = sdf1.format(now);
		System.out.println(yearStr);
		int year =Integer.parseInt(yearStr);
		System.out.println(year);
		System.out.println("--------------SimpleDateFormat[String-->Date]------------");
		SimpleDateFormat sdf2 = new SimpleDateFormat();
		sdf2.applyPattern("yyyy-MM-dd");
		Date myBirthDay = sdf2.parse("2000-06-03");
		System.out.println(myBirthDay.toString());
		System.out.println(myBirthDay.toLocaleString());
		System.out.println(myBirthDay.getTime());
		
		sdf2.applyPattern("yyyy/MM/DD HH:mm:ss");
		Date yourBirthDay = sdf2.parse("1998/10/12 17:45:13");
		System.out.println(yourBirthDay.toString());
		System.out.println(yourBirthDay.toLocaleString());
		System.out.println(yourBirthDay.getTime());
		/*******************java.util.calendar******************/
		Calendar cal1=Calendar.getInstance();
		System.out.println(cal1);
		System.out.println(cal1.getCalendarType());
		
		long currentTimeMillis3 =cal1.getTimeInMillis();
		System.out.println(currentTimeMillis3);
		int y =cal1.get(Calendar.YEAR);
		int month = cal1.get(Calendar.MONTH)+1;
		int day = cal1.get(Calendar.DAY_OF_MONTH);
		int hour = cal1.get(Calendar.HOUR);
		int min = cal1.get(Calendar.MINUTE);
		int second = cal1.get(Calendar.SECOND);
		int msecond = cal1.get(Calendar.MILLISECOND);
		System.out.println(y+"\t"+month+"\t"+day+"\t"+hour+"\t"+min+"\t"+second+"\t"+msecond);
		System.out.println("-------------calendar-->date------------------");
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2021, Calendar.JANUARY, 10, 13, 59, 59);
		System.out.println(cal2);
		Date date2 = cal2.getTime();
		System.out.println(date2);
		
		System.out.println("------------------Date--->Calendar------------------");
		Date date3 = new Date();
		Calendar cal3 = Calendar.getInstance();
		cal3.setTimeInMillis(date3.getTime());
		System.out.println(date3.toLocaleString());
		System.out.println(cal1);
		
		System.out.println("-----------date객체메쏘드-----------");
		Date date4 = new SimpleDateFormat("yyyy-MM-dd").parse("2022-01-10");
		Date date5 = new SimpleDateFormat("yyyy-MM-dd").parse("2022-01-10");
		Date date6 = new SimpleDateFormat("yyyy-MM-dd").parse("2022-01-15");
		
		System.out.println("equals:"+date4.equals(date5));
		System.out.println("equals:"+date4.equals(date6));
		System.out.println("compareto:"+date4.compareTo(date5));
		System.out.println("compareto:"+date4.compareTo(date6));
		System.out.println("compareto:"+date6.compareTo(date4));
		long gapMilliSec=date6.getTime()-date4.getTime();
		System.out.println(gapMilliSec);
		System.out.println(gapMilliSec/1000/60);
		System.out.println(gapMilliSec/1000/60/60);
		System.out.println(gapMilliSec/1000/60/60/24);
		
		System.out.println("java.util.date-->java.sql.date");
		
		java.util.Date utilDate1 = new java.util.Date();
		java.util.Date utilDate2 = new java.util.Date(System.currentTimeMillis());
		
		java.sql.Date sqlDate1 = new java.sql.Date(utilDate1.getTime());
		java.sql.Date sqlDate2 = new java.sql.Date(utilDate2.getTime());
		
		System.out.println(sqlDate1);
		System.out.println(sqlDate2);
		
		System.out.println("java.sql.date-->java.util.date");
		java.sql.Date sqlDate3= new java.sql.Date(System.currentTimeMillis());
		java.sql.Date sqlDate4= java.sql.Date.valueOf("2022-12-31");
		
		java.util.Date utilDate3 = sqlDate3;
		java.util.Date utilDate4 = sqlDate4;
		System.out.println(utilDate3);
		System.out.println(utilDate4);
		
	}

}
