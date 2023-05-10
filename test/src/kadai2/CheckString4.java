package kadai2;

import java.util.Scanner;

public class CheckString4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("繰り返す回数を入力してください : ");
		int count = scan.nextInt();
		String scanStr;
		String longStr = "";
		int max = 0;

		for (int i = 1; i <= count; i++) {
			System.out.print(i + "つ目の文字列を入力してください : ");
			scanStr = scan.next();

			if (max < scanStr.length()) {
				max = scanStr.length();
				longStr = scanStr;
			}
		}

		System.out.println("最も長い文字列は「" + longStr + "」です");

		scan.close();
	}
}
