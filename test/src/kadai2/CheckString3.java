package kadai2;

import java.util.Scanner;

public class CheckString3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("繰り返す回数を入力してください : ");
		int count = scan.nextInt();
		String scanStr;
		String str = "";

		for (int i = 1; i <= count; i++) {
			System.out.print(i + "つ目の文字列を入力してください : ");
			scanStr = scan.next();
			str += scanStr;
			System.out.println(str);
		}

		scan.close();

	}

}
