package myPack;

public class Privileged extends Account{
    private double overDraftLimit;

    public Privileged(String accountType, Customer customer,double overDraftLimit) {
        super(accountType, customer);
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void withdraw(double amount) throws Exception{
        System.out.println("Please wait while withdrawing amount:"+amount);
        double remBalance = this.getBalance();
//        System.out.println("rem:"+remBalance);
//        System.out.println("over before decrease:"+this.overDraftLimit);
        if(remBalance < amount ){
            System.out.println("Amount requested is beyond limit... checking overdraft limit");
            if(this.overDraftLimit < amount){
                //throw new Exception("TRANSACTION DENIED. Overdraft limit exceeded.");
                System.out.println("TRANSACTION DENIED. Overdraft limit exceeded.");
            }else{
                double withdrawAmount = remBalance - amount;
                this.setBalance(withdrawAmount);
                this.overDraftLimit = (this.overDraftLimit+remBalance) - amount;
//              System.out.println("over after decrease:"+this.overDraftLimit);
                System.out.println("SUCCESSFUL TRANSACTION");
            }
        }else{
            double withdrawAmount = remBalance - amount;
            this.setBalance(withdrawAmount);
            System.out.println("SUCCESSFUL TRANSACTION");
        }
    }

    @Override
    public void display(){
        System.out.println("Customer Account Name:" + this.customer.getFirstName() + " " + this.customer.getLastName());
        System.out.println(this.accountType + " Account Balance:" + this.getBalance());
        System.out.println("Overdraft Available Limit:" + this.overDraftLimit);
    }

}
