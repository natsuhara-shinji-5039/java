package jbasic;

public class UserSample {

	public static void main(String[] args) {
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		s1.a = 10;
		s1.b = 20;
		s2.a = -30;
		s2.b = 100;
		System.out.println("インスタンスのs1のaは" + s1.a);
		System.out.println("インスタンスのs1のbは" + s1.b);
		System.out.println("インスタンスs1のaとbの合計は" + s1.sum());
		
		System.out.println("インスタンスのs2のaは" + s2.a);
		System.out.println("インスタンスのs2のbは" + s2.b);
		System.out.println("インスタンスs2のaとbの合計は" + s2.sum());

	}

}
