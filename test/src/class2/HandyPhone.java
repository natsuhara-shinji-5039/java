package class2;

public class HandyPhone extends Phone {
	String mailAddress;

	void mail(String to) {
		System.out.println(mailAddress + "から" + to + "へメールしました。");
	}

	void info() {
		System.out.println("電話番号=" + no + ", メールアドレス=" + mailAddress);
	}
}
