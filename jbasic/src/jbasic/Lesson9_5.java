package jbasic;

public class Lesson9_5 {

	public static void main(String[] args) {
		int[] ary = { 10, 15, 12, 8 };
		int result = sum(ary);
		System.out.println("合計は" + result + "です。");
	}

	static int sum(int[] ary) {
		int sum = 0;
		for (int data : ary) {
			sum += data;
		}
		return sum;
	}

}
