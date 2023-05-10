package kadai2;

import java.util.Scanner;

public class Introduce2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] ary = new String[3];

		System.out.println("情報を登録します");

		System.out.print("名前 :");
		String name = scan.next();

		for (int i = 0; i < 3; i++) {
			System.out.print("趣味 :");
			ary[i] = scan.next();
		}

		System.out.println("こんにちは" + name);
		for (int i = 0; i < ary.length; i++) {
			System.out.println("・" + ary[i]);
		}

		System.out.println("です");

		scan.close();
	}

}
