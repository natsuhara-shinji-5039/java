package kadai3add;

import java.util.Random;
import java.util.Scanner;

public class Game1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = randNum();
		int scanNum = 0;
		int count = 0;

		do {
			System.out.print("数字を入力してください : ");
			scanNum = scan.nextInt();
			count++;
		} while (!judge(num, scanNum));

		System.out.println(count + "回で当たりました!");

		scan.close();
	}

	static int randNum() {
		Random rand = new Random();
		return rand.nextInt(100);
	}

	static boolean judge(int randNum, int scanNum) {
		if (randNum == scanNum) {
			System.out.println("**当たりです**");
			return true;
		} else if (randNum > scanNum) {
			System.out.println("**小さすぎます**");
		} else if (randNum < scanNum) {
			System.out.println("**大きすぎます**");
		}
		return false;
	}

}
