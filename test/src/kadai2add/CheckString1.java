package kadai2add;

import java.util.Scanner;

public class CheckString1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("文字列を入力してください : ");
		String str = scan.next();

		System.out.println("文字列の長さは" + str.length() + "です");

		scan.close();
	}

}
