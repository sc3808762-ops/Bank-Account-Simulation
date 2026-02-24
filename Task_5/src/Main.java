import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Bank bank = new Bank();

       while (true) { 
           
        System.out.println("*-*-*-*-* Welcome In SAVI BANK *-*-*-*-*");
        System.out.println("1: Create Saving Account.");
        System.out.println("2: Create Curent Account.");
        System.out.println("3: Deposit Money.");
        System.out.println("4: Withdraw Money.");
        System.out.println("5: Transfer Money.");
        System.out.println("6: View Account Details.");

        System.out.print("Enter The Choice Here :- ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:{
                System.out.print("Enter The Account Number :- ");
                String accNo = sc.next();
                sc.nextLine();
                System.out.print("Enter The Full Name :- ");
                String name = sc.nextLine();
                System.out.print("Enter The Initioal Balance :- ");
                double balance = sc.nextDouble();
                SavingAccount s1 = new SavingAccount(accNo, name, balance);
                bank.createAccount(s1);
                break;
            }
            
            case 2:{
                System.out.print("Enter The Account Number :- ");
                String accNo = sc.next();
                sc.nextLine();
                System.out.print("Enter The Full Name :- ");
                String name = sc.nextLine();
                System.out.print("Enter The Initioal Balance :- ");
                double balance = sc.nextDouble();
                System.out.print("Enter The OverDraftLimit :- ");
                double overDraftLimit = sc.nextDouble();
                CurrentAccount c1 = new CurrentAccount(accNo, name, balance,overDraftLimit);
                bank.createAccount(c1);
                break;
            }
            case 3:{
                System.out.print("Enter The Account Number :- ");
                String accNo = sc.next();

                System.out.print("Enter The Deposit Money :- ");
                double deposit = sc.nextDouble();

                bank.depositAmount(accNo, deposit);
                break;
            }

            case 4:{
                System.out.print("Enter The Account Number :- ");
                String accNo = sc.next();

                System.out.print("Enter The Withdraw Money :- ");
                double deposit = sc.nextDouble();

                bank.withdrawAmount(accNo, deposit);
                break;                
            }

            case 5:{
                System.out.print("Enter The Sender Account Number :- ");
                String accNoS = sc.next();
                System.out.print("Enter The Reciver Account Number :- ");
                String accNoR = sc.next();
                System.out.print("Enter The Transfer Money Money :- ");
                double transfer = sc.nextDouble();

                bank.transferMoney(accNoS, accNoR, transfer);
                break;
                

            }
            case 6:{
                bank.displayInfo();
            }
            
            default:
                throw new AssertionError();
        }
       }

    }
}
