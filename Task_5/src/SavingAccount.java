public class SavingAccount extends BankAccount {

    public static final double minimumBalance = 1000;
    public SavingAccount(String accountNumber,String accountHolderName,double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void withdrawMoney(double withdraw){

        if(withdraw <= 0){
            System.out.println("Invalied Withdraw Amount....!");
            return;
        }

        double remainingBalance = getBalance() - withdraw;
        if(remainingBalance < minimumBalance){
            System.out.println("Can Not withdraw.. Minimum Balance is "+minimumBalance+" Must be");
        }else{
            super.withdrawMoney(withdraw);
        }
    }
    

    
}
