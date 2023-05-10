package kadai3;

public class CalcPoints1 {

	public static void main(String[] args) {
		int price = 1000;
		// プレミアム会員のポイント計算
		int p1 = getPoints(price, true);
		System.out.println("プレミアム会員には" + p1 + "ポイント付与されます");

		// 無料会員のポイント計算
		int p2 = getPoints(price, false);
		System.out.println("無料会員には" + p2 + "ポイント付与されます");
	}

	static int getPoints(int price, boolean flag) {
		if (flag) {
			return (int) (price * 0.2);
		} else {
			return (int) (price * 0.1);
		}
	}

}
