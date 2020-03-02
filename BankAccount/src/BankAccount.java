public class BankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("56789",2.50,"Default Name","Default Address","Default Phone");
        System.out.println("Empty Constructor called");
    }

    public BankAccount(String number, double balance, String customerName) {
        this(number,balance,customerName,"Default Address","Default Phone");

    }

    public BankAccount(String number, double balance, String customerName, String email, String phoneNumber){
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
        System.out.println("constructor called with parameters.");
    }

    public void deposit(double deposit){
        this.balance += deposit;
        System.out.println("Deposit of amount " + deposit + " leaving account with value " + this.balance);
    }

    public void withdraw(double withdrawal){
        if(this.balance < withdrawal){
            System.out.println("Withdrawal amount exceeds account amount.");
        }else{
        this.balance -= withdrawal;
        System.out.println("Withdrawal of " + withdrawal + " leaving acount with amount " + this.balance);
        }
    }


}
