package kyeonwoo.calendar;

import java.util.Scanner;

public class Calendar {
	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

//	public void printSampleCalendar() {
//		System.out.println("일 월 화 수 목 금 토 일");
//		System.out.println("-------------------");
//		System.out.println(" 1  2  3  4  5  6  7");
//		System.out.println(" 8  9 10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21 ");
//		System.out.println("22 23 24 25 26 27 28 ");
//	}

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		System.out.println("반복횟수를 입력하세요.");
		int times = scanner.nextInt();
		System.out.println("월을 입력하세요.");
		

		System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getMaxDaysOfMonth(month));
		//cal.printSampleCalendar();
		scanner.close();

//	if(month == 2) {
//		System.out.println(month +"월은 28일까지 있습니다.");
//	}else if(month ==4 || month==6 ||month==9||month==11){
//		System.out.println(month +"월은 30일까지 있습니다.");
//	}else if(month ==1 || month==3|| month==5|| month==7|| month==9|| month==11) {
//		System.out.println(month +"월은 31일까지 있습니다.");
//	}else {
//		System.out.println("1~12 사이의 값을 입력해야 합니다.");	
//	}

		// 1,3,5,7,8,10,12:31
		// 4,6,9,11:
		// 2:28
	}

}
