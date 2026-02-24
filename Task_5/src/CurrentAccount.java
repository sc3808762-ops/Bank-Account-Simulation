public class CurrentAccount extends BankAccount{
    
    private double overDraftLimit;

    public CurrentAccount(String accountNumber, String accountHolderName,double balance,double overDraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void withdrawMoney(double withdraw) {
         
        if(withdraw <= 0){
            System.out.println("Insufficient Amount....!");
        }

        double avilableBalance = getBalance() + overDraftLimit;

        if(withdraw > avilableBalance){
            System.out.println("OverDraft Limit Exceeded...");
            return;
        }

        setBalance(getBalance() - withdraw);

    System.out.println("Withdraw Successful.");
    System.out.println("Current Balance: " + getBalance());
    }

    

    

}
