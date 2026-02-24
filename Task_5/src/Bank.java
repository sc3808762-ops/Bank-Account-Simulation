import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> accounts = new ArrayList<>();

   
    public void createAccount(BankAccount account){
        accounts.add(account);
        System.out.println("=================================");
        System.out.println("|Account Created Successfully....|");
        System.out.println("=================================") ;       
        System.out.println("");
    }

    public BankAccount findAccount(String accountNumber){

        for(int i=0;i<accounts.size();i++){
            BankAccount acc = accounts.get(i);
            if(acc.getAccountNumber().equals(accountNumber)){
                return acc;
            }
        }
        return null;
    }


    public void depositAmount(String accountNumber, double deposit){

        BankAccount acc = findAccount(accountNumber);

        if(acc != null){
            acc.depositMoney(deposit);
        }else{
        System.out.println("=================================");
        System.out.println("|        Account not found...   |");
        System.out.println("=================================");            
            System.out.println("");
        }
    }

    public void withdrawAmount(String accountNumber, double withdraw){

        BankAccount acc = findAccount(accountNumber);

        if(acc != null){
            acc.withdrawMoney(withdraw);
        }else{
        System.out.println("=================================");
        System.out.println("|        Account Not Found...!  |");
        System.out.println("=================================");            

        }
    }

    public void transferMoney(String fromAccount, String toAccount, double amount){

        BankAccount sender = findAccount(fromAccount);
        BankAccount reciver = findAccount(toAccount);

        if(sender == null || reciver == null){
        System.out.println("=================================");
        System.out.println("One or both account not find..");
        System.out.println("=================================");            
            return;
        }

        if(amount <= 0){
        System.out.println("=================================");
        System.out.println("|       Insufficient Balance    |");
        System.out.println("=================================");            
            return;
        }

        if(sender.getBalance() > amount){
           
            sender.withdrawMoney(amount);
            reciver.depositMoney(amount);
            System.out.println("Money Transfer Successfully....");
        }else{
        System.out.println("=================================");
        System.out.println("|Insufficinet Balance or transfer|");
        System.out.println("=================================");            

        }
    }

    public void displayInfo(){

        for(int i=0;i<accounts.size();i++){

        System.out.println("Account No :- "+i+1);
        BankAccount acc = accounts.get(i);
        System.out.println("|=====================================|");      
        System.out.println("Account Number :- "+acc.getAccountNumber());
        System.out.println("Account Holder Name :- "+acc.getName());
        System.out.println("Balance :- "+acc.getBalance());
        System.out.println("|=====================================|");            
        }
    }


}
