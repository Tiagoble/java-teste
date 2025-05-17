public class Account {
    private String name;
    private int accountNumber;
    private double balance = 0;
    final double WITHDRAWAL_LIMIT = 500;
    
    public Account(String name, int accountNumber, double balance){
        this.name=name;
        this.accountNumber=accountNumber;
        this.balance=balance;

    }

    public Account(int accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public void printAccountInfo(){
        System.out.println("User: "+name);
        System.out.println("Account number: "+accountNumber);
        System.out.println("Balance: "+balance);
        System.out.println("Withdrawal limit: "+WITHDRAWAL_LIMIT);
    }

    public void deposit(double value){
        if (value >= 1) {
            balance += value;
        }else{
            System.out.println("Invalid deposit value");
        }
    }

    public void withdraw(double value){
        if (value <= balance) {
            balance -= value;
        } else {
            System.out.println("Your withdrawal limit is: "+ WITHDRAWAL_LIMIT);
        }
    }
    
}
