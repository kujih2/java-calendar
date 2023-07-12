package kyeonwoo.calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
//		System.out.println(
//				"일 월 화 수 목 금 토 일\n"
//				+"--------------------\n"
//				+ " 1  2  3  4  5  6  7\n"
//				+ " 8  9 10 11 12 13 14\n"
//				+ "15 16 17 18 19 20 21\n"
//				+ "22 23 24 25 26 27 28");
		
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
	Scanner scanner = new Scanner(System.in);
	String month_String = scanner.next();
	int month = Integer.parseInt(month_String);
	System.out.println(month);
	
	if(month == 2) {
		System.out.println(month +"월은 28일까지 있습니다.");
	}else if(month ==4 || month==6 ||month==9||month==11){
		System.out.println(month +"월은 30일까지 있습니다.");
	}else if(month ==1 || month==3|| month==5|| month==7|| month==9|| month==11) {
		System.out.println(month +"월은 31일까지 있습니다.");
	}else {
		System.out.println("1~12 사이의 값을 입력해야 합니다.");
		
	}
	//1,3,5,7,8,10,12:31
	//4,6,9,11:
	//2:28
	}

}
