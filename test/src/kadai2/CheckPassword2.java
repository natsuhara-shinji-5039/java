package kadai2;

import java.util.Scanner;

public class CheckPassword2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		System.out.print("パスワードを入力してください:");
		String pass = scan.next();

		while (!pass.equals("himitu")) {
			System.out.print("再入力して下さい:");
			pass = scan.next();
		}

		System.out.println("ログインできました");

		scan.close();
	}

}
