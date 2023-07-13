package kyeonwoo.calendar;

import java.util.Scanner;

public class Calender2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		System.out.printf("%d월은 %d일까지 있습니다.",month,maxDays[month-1]);
	}

}
