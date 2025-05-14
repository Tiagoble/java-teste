public class Account {
    String name;
    int accountNumber;
    double balance = 0;
    final double WITHDRAWAL_LIMIT = 500;
    
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
