package jbasic;

import java.util.Scanner;

public class Lesson9_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("年を入力してください : ");
		int year = scan.nextInt();
		boolean flag = uru(year);
		if (flag) {
			System.out.println(year + "はうるう年です");
		} else {
			System.out.print(year + "は普通の年です");
		}
		scan.close();
	}

	static boolean uru(int year) {
		//		if (year % 400 == 0) {
		//			return true;
		//		} else if (year % 100 == 0) {
		//			return false;
		//		} else if (year % 4 == 0) {
		//			return true;
		//		} else {
		//			return false;
		//		}
		return year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);

	}
}
