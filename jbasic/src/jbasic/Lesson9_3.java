package jbasic;

import java.util.Scanner;

public class Lesson9_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("点数を入力してください : ");
		int num = scan.nextInt();
		String result = judge(num);
		System.out.println(num + "は" + result + "です");

		scan.close();
	}

	static String judge(int num) {
		if (num >= 70) {
			return "合格";
		} else {
			return "不合格";
		}
	}

}
