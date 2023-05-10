package kadai3;

public class Calculator {

	public static void main(String[] args) {
		int a = add(3, 7);
		System.out.println(a);

		int b = sub(3, 7);
		System.out.println(b);
	}

	// 足し算
	static int add(int num1, int num2) {
		return num1 + num2;
	}

	// 引き算
	static int sub(int num1, int num2) {
		return num1 - num2;
	}
}
