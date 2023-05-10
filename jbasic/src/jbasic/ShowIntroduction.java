package jbasic;

import java.util.Scanner;

public class ShowIntroduction {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("名前を入力してください : ");
		String name = scan.next();
		introduction(name);
		System.out.print("もう一人、名前を入力してください");
		name = scan.next();
		introduction(name);
		scan.close();
	}

	static void introduction(String name) {
		System.out.println("初めまして。");
		System.out.println("私の名前は" + name + "と申します。");
		System.out.println("よろしくお願いします。");
	}

}
