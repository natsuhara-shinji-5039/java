package kadai3;

import java.util.Scanner;

public class CalcPoints2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("購入金額 : ");
		int price = scan.nextInt();
		System.out.println("1:プレミアム会員, 2:無料会員");
		System.out.print("会員ランク : ");
		int rank = scan.nextInt();
		getPoints(price, rank);
		scan.close();
	}

	static void getPoints(int price, int rank) {
		int point;
		String type;
		if (rank == 1) {
			point = (int) (price * 0.2);
			type = "プレミアム";
		} else {
			point = (int) (price * 0.1);
			type = "無料";
		}
		System.out.println(type + "会員には" + point + "ポイント付与されます");
	}

}
