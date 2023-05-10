package kadai2;

public class IntegerArray2 {

	public static void main(String[] args) {
		int[] ary = { 1, 7, 2, 7, 3 };
		int sum = 0;

		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}

		System.out.println("合計:" + sum);
	}

}
