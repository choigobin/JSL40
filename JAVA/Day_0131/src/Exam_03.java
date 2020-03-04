import java.util.*;
/*	자바의 정석 p.529 예제 10-1
 */

public class Exam_03 {
	public static void main(String[] args) {
		//기본적으로 시스템OS의 현재의 날짜와 시간
		Calendar today = Calendar.getInstance();
		System.out.println("이 해의 년도 : " +today.get(Calendar.YEAR));
		System.out.println("월(0~11, 0:1월): "+today.get(Calendar.MONTH));
		System.out.println("이 해의 몇 째주 : " +today.get(Calendar.WEEK_OF_YEAR));
		
		//DATE와 DAY_OF_MONTH는 같다.
		System.out.println("몇 일 : "+today.get(Calendar.DATE));
		System.out.println("이 달의 몇 일 : "+today.get(Calendar.DAY_OF_MONTH));
		System.out.println("이 해의 몇 일 : "+today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일(1~7, 1:일요일): "+today.get(Calendar.DAY_OF_WEEK));
		System.out.println("이 달의 몇째 요일: "+today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("오전_오후(0:오전, 1:오후): "+today.get(Calendar.AM_PM));
		System.out.println("시간 (0~11): "+today.get(Calendar.HOUR));
		System.out.println("시간 (0~23): "+today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분 (0~59): "+today.get(Calendar.MINUTE));
		System.out.println("초 (0~59): "+today.get(Calendar.SECOND));
		System.out.println("1000분의 1초 (0~999): "+today.get(Calendar.MILLISECOND));
		System.out.println("TimeZone(-12~+12): "+(today.get(Calendar.ZONE_OFFSET)/(60*60*1000)));//1000분의 1초를 시간으로 나타내기 위해 /(60*60*1000)을 해줌
		System.out.println("이 달의 마지막 날: "+today.getActualMaximum(Calendar.DATE));
		
	}
}