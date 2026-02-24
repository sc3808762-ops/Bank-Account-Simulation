
public class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }

    public String getName(){
        return accountHolderName;
    }

    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public double getBalance(){
        return balance;
    }



    public void depositMoney(double deposit){

        if(deposit > 0){
            balance += deposit;
            System.out.println("Money Deposit successfully in This Account. Balance :- "+balance);
        }else{
        System.out.println("=================================");
        System.out.println("|        Insufficient balance    |");
        System.out.println("=================================");
            System.out.println("");
        }
    }

    public void withdrawMoney(double withdraw){

        if(balance >= withdraw && withdraw > 0){
            balance -= withdraw;
            System.out.println("Money Withdraw successfully in This Account . Balance :- "+balance);
        }else{
        System.out.println("=================================");
        System.out.println("|  Invalid withdrawal amount     |");
        System.out.println("=================================");    
            System.out.println();
 
        }
    }

    public void checkBalance(){
        System.out.println("Total Balance :- "+balance);
    }

   


    

   
}
