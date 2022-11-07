package myPack;

public abstract class Account {
    public String accountType;
    private double balance;
    public Customer customer;

    public Account(String accountType, Customer customer) {
        this.accountType = accountType;
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        System.out.println("Depositing... " + amount);
        double currentBalance = this.getBalance();
        double depositAmount = currentBalance + amount;
        this.setBalance(depositAmount);
        System.out.println("SUCCESSFUL TRANSACTION");
    }

    public abstract void withdraw(double amount) throws Exception;

    public void display(){
            System.out.println("Customer Account Name:" + this.customer.getFirstName());
            System.out.println(this.accountType + " Account Balance:" + this.getBalance());
    }


}
