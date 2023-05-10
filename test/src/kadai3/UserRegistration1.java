package kadai3;

import java.util.Scanner;

public class UserRegistration1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("名前を入力してください : ");
		String name = scan.next();

		if (!nameCheck(name)) {
			scan.close();
			return;
		}

		System.out.print("年齢を入力してください : ");
		int age = scan.nextInt();

		if (!ageCheck(age)) {
			scan.close();
			return;
		}

		System.out.println("名前 : " + name + "、年齢 : " + age + "で登録しました");

		scan.close();

	}

	static boolean nameCheck(String name) {
		if (name.length() > 20) {
			System.out.println("名前は20文字以内で入力してください");
			return false;
		}

		if (name.equals("admin")) {
			System.out.println("利用できない名前です");
			return false;
		}

		if (name.contains("㌔")) {
			System.out.println("名前に禁止文字が含まれています");
			return false;
		}

		return true;

	}

	static boolean ageCheck(int age) {
		if (age < 0 || age > 130) {
			System.out.println("年齢は0以上130以下で入力してください");
			return false;
		}

		return true;
	}

}
