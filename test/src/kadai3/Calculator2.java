package kadai3;

public class Calculator2 {

	public static void main(String[] args) {
		int a = add(3, 7);
		System.out.println(a);

		int b = sub(3, 7);
		System.out.println(b);

		int c = add(3, 7, 10);
		System.out.println(c);
	}

	// 足し算
	static int add(int num1, int num2) {
		return num1 + num2;
	}

	// 足し算+
	static int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

	// 引き算
	static int sub(int num1, int num2) {
		return num1 - num2;
	}

}
