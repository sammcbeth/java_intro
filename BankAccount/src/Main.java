public class Main {

    public static void main(String[] args) {
		BankAccount account = new BankAccount("123412",1200,"Sam McBeth","sammcbeth@berkeley.edu","707-479-5818");
		BankAccount account1 = new BankAccount();
		account1.deposit(1000);
		account1.deposit(1300);
		account1.withdraw(10000);
		account1.withdraw(1000);

		System.out.println("----------------");
		VipCustomer cust = new VipCustomer();
		System.out.println(cust.getCredit_limit());
		System.out.println(cust.getEmail());
		System.out.println(cust.getName());
    }
}
