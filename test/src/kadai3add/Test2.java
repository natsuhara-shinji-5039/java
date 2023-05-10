package kadai3add;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String confirmNum;
		int count = 0;
		String num = randNum();
		System.out.println(num);

		do {
			System.out.print("3桁の数字を入力してください : ");
			confirmNum = scan.next();
			count++;
			System.out.println(num);
		} while (checkNum(num, confirmNum));

		System.out.println(count + "回で当たりました！");

		scan.close();
	}

	static String randNum() {
		String num;
		ArrayList<Long> list = new ArrayList<Long>();

		// listに値を入れる。この段階では昇順
		for (int i = 0; i <= 9; i++) {
			list.add((long) i);
		}

		// シャッフルして、順番を変える
		Collections.shuffle(list);

		num = String.valueOf(list.get(0)) + String.valueOf(list.get(1)) + String.valueOf(list.get(2));

		return num;

	}

	static boolean checkNum(String num, String confirmNum) {
		int match = 0;
		int brow = 0;
		for (int i = 0; i < 3; i++) {
			if (confirmNum.charAt(i) == num.charAt(i)) {
				match++;
			} else {
				System.out.println(String.valueOf(confirmNum.charAt(i)));
				if (num.contains(String.valueOf(confirmNum.charAt(i)))) {
					brow++;
				}
			}

		}
		System.out.println(match + "ヒット・" + brow + "ブロー");
		if (match == 3) {
			return false;
		}
		return true;
	}

}
