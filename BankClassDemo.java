package classandobjects;

class BankClass {
	int AccountNo = 1111;
	String Name;
	int Age;
	static String BankName;
	
	int getAccNo() {
		return AccountNo;
	}
}

public class BankClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankClass bankObject = new BankClass();
        System.out.println(bankObject.getAccNo());
	}

}
