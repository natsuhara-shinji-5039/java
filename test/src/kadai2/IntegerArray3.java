package kadai2;

public class IntegerArray3 {

	public static void main(String[] args) {
		int[] ary = { 1, 7, 2, 7, 3 };
		int count = 0;

		for (int i = 0; i < ary.length; i++) {
			if (ary[i] == 7) {
				count++;
			}
		}

		System.out.println(count + "個ありました");

	}

}
