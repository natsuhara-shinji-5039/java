package jbasic;

public class BreakSample {

	public static void main(String[] args) {
		int[] a = { 10, -3, 5, 7, 9, 100, 30, -3 };
		for (int i = 0; a.length > i; i++) {
			if (a[i] == 7) {
				System.out.println("ラッキー7が見つかりました。");
				break;
			}
		}
	}

}
