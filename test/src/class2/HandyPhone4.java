package class2;

public class HandyPhone4 {
	private String mailAddress;

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public void mail(String to) {
		System.out.println(mailAddress + "から" + to + "へメールしました");
	}

	public void info() {

	}
}
