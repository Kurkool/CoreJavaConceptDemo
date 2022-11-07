package myPack;

public class Checking extends Account{
    public Checking(String accountType, Customer customer) {
        super(accountType, customer);
    }

    @Override
    public void withdraw(double amount) throws Exception {
        System.out.println("Please wait while withdrawing amount:"+amount);
        double currentBalance = this.getBalance();
//        if(currentBalance < amount){
//            throw new Exception("TRANSACTION DENIED. Insufficient funds");
//        }else{
//            double withdrawAmount = currentBalance - amount;
//            this.setBalance(withdrawAmount);
//            System.out.println("SUCCESSFUL TRANSACTION");
//        }

        if(currentBalance < amount){
            System.out.println("TRANSACTION DENIED. Insufficient funds");
        }else{
            double withdrawAmount = currentBalance - amount;
            this.setBalance(withdrawAmount);
            System.out.println("SUCCESSFUL TRANSACTION");
        }
    }
}
