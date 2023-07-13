package kyeonwoo.calendar;

import java.util.Scanner;

public class practice {
	private static int[] DaysOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) {
		System.out.println("반복횟수를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		int[] month = new int[times];
		
		for(int i = 0;i<times;i++) {
			month[i] = scanner.nextInt();
		}
		for(int i = 0;i<times;i++) {
			System.out.printf("%d월은 %d일까지 있습니다\n", month[i], DaysOfMonth[month[i]-1] );
			
		}
		
	}

}
