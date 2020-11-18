package CalendarClass;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class mainClass {
	public static void main(String[] args) {
		/*
		 	Calendar  year month day
		 	Date					 time
		 */
		
//		Calendar cal = new GregorianCalendar();
		
		Calendar cal = Calendar.getInstance();
		
		// 날짜
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;	// 0 ~ 11
		int day = cal.get(Calendar.DATE);
		System.out.println(year + "년 " + month + "월 " + day + "일");
		
		// 날짜를 설정
		cal.set(Calendar.YEAR, 2021);
		cal.set(Calendar.MONTH, 4 - 1);			// 4월
		cal.set(Calendar.DATE, 13);
		
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;	// 0 ~ 11
		day = cal.get(Calendar.DATE);
		System.out.println(year + "년 " + month + "월 " + day + "일");
		
		// 요일
		int weekday = cal.get(Calendar.DAY_OF_WEEK);	// 1 ~ 7 일 ~ 토
		System.out.println(weekday);
		
		switch (weekday) {
		case 1:
			System.out.println("일요일");
			break;
		case 2:
			System.out.println("월요일");
			break;
		case 3:
			System.out.println("화요일");
			break;
		case 4:
			System.out.println("수요일");
			break;
		case 5:
			System.out.println("목요일");
			break;
		case 6:
			System.out.println("금요일");
			break;
		case 7:
			System.out.println("토요일");
			break;
		}
		
		cal.set(Calendar.YEAR, 2020);
//		cal.set(Calendar.MONTH, 12 - 1);
//		cal.set(Calendar.MONTH, 2 - 1);
		cal.set(Calendar.MONTH, 11 - 1);
		// 지정한 달의 마지막 날짜 31 인지 30인지 29 인지 28인지
		int lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("lastday = " + lastday);
		
		// 달력출력
		cal.set(Calendar.DATE, 1); // 1일
		
		// 위쪽의 빈칸
		weekday = cal.get(Calendar.DAY_OF_WEEK);
		int upspace = (weekday - 1) % 7;
		System.out.println("윗쪽빈칸수: " + upspace);
		
		// 아래 빈칸 -> 그 달의 마지막 날짜
		lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("lastday: " + lastday);
		
		// 밑의 빈칸
		cal.set(Calendar.DATE, lastday);
		weekday = cal.get(Calendar.DAY_OF_WEEK);
		
		int downspace = 7 - weekday;
		System.out.println("밑쪽 빈칸수: " + downspace);
		
		// 달력 출력
		year = 2021;	//년도
		month = 1;		// 달
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month - 1);	//???????????????????????????????
		cal.set(Calendar.DATE, 1);
		int startDay = cal.get(Calendar.DAY_OF_WEEK);
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int date = 1;
		
		System.out.println(year + "년 " + month + "월 ");
		System.out.println("--------------------------------------------------------------------");
		
		String week_day = "일월화수목금토";
		
		for (int i = 0; i < week_day.length(); i++) {
			char c = week_day.charAt(i);
			System.out.print(c + "\t");
		}
		System.out.println();
		System.out.println("---------------------------------------------------------------------");
		
		// 위쪽 빈칸
		for (int i = 1; i < startDay; i++) {
			System.out.print("*" + "\t");
		}
		
		for (int i = 0; i < lastDay; i++) {
			System.out.print(date + "\t");
			// 개행
			if((date + startDay - 1) % 7 == 0) {
				System.out.println();
			}
			date++;
		}
		// 밑쪽의 빈칸
		for (int i = 0; i < (7 - (startDay + lastDay -1) % 7); i++) {
			System.out.print("*" + "\t");
		}
		System.out.println();
		System.out.println("-----------------------------------------------");
	}
}
