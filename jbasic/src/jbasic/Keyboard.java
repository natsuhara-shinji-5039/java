package jbasic;

import java.util.Scanner;

public class Keyboard {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("苗字を入力してください:");
		String lastName = scan.next();
		System.out.print("名前を入力してください:");
		String firstName = scan.next();

		System.out.println("あなたのフルネームは" + lastName + firstName + "ですね");

		scan.close();
	}

}
