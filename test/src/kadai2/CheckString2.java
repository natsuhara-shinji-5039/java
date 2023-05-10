package kadai2;

import java.util.Scanner;

public class CheckString2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("1つ目の文字列を入力してください : ");
		String str1 = scan.next();
		System.out.print("2つ目の文字列を入力してください : ");
		String str2 = scan.next();

		if (str1.equals(str2)) {
			System.out.println("2つの文字列は同じです");
		} else {
			System.out.println("2つの文字列は異なります");
		}

		scan.close();

	}

}
