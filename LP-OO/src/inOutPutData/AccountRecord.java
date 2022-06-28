package inOutPutData;
public class AccountRecord {
	private int account;
	private String firstName;
	private String lastName;
	private double balance;	
	public AccountRecord() {
		this(0,"","",0.0);
	}
	public AccountRecord(int acct, String first,String last,double bal) {
		setAccount(acct);
		setfirstName(first);
		setlastName(last);
		setbalance(bal);
	}
	public void setAccount(int acct) {
		account = acct;
	}
	public int getAccount() {
		return account;
	}
	public void setfirstName(String first) {
		firstName = first;
	}
	public String getfirstName() {
		return firstName;
	}
	public void setlastName(String last) {
		lastName = last;
	}
	public String getlastName() {
		return lastName;
	}
	public void setbalance(double bal) {
		balance = bal;
	}
	public double getbalance() {
		return balance;
	}	
}
