package jbasic;

public class lesson9_1 {

	public static void main(String[] args) {
		double a = divide(34.2, 8.23);
		double b = divide(6.58, 3.9);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	static double divide(double a, double b) {
		double result = a / b;
		return result;
	}

}
