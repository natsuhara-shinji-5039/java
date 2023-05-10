package jbasic;

public class UserCar {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car c1;
		c1 = new Car();
		// 車オブジェクトの初期化
		c1.maker = "HONDA";
		c1.displacement = 2000;
		c1.color = "青";
		
		// 車を使う
		c1.start();
		c1.curve();
		c1.stop();
		// 車の情報を保存する
		System.out.println("c1のメーカーは" + c1.maker + "です");
		System.out.println("c1の色は" + c1.color + "です");
	}

}
