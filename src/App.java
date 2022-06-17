import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        int id;
        String name = null;
        double balance = 0.0;

        File inputFile = new File("accounts.txt");
        Scanner scan = new Scanner(inputFile);

        // create the arrays of the 3 types of accounts
    BankAccount[] accounts = new BankAccount[1000];
    SavingsAccount[] savingsAccounts = new SavingsAccount[1000];
    CheckingAccount[] checkingAccounts = new CheckingAccount[1000];

    
    // Use a loop to call the constructors
    for(int i=0 ; i<accounts.length; i++)
    {
       id = scan.nextInt();
       name = scan.next()+ " " + scan.next();
       balance = scan.nextDouble();
      accounts[i]= new BankAccount(id, name, balance);

     // The balance is splitten evenly between checking and savings
     checkingAccounts[i] = new CheckingAccount(id, name, balance/2.0);
     savingsAccounts[i]= new SavingsAccount(id, name, balance/2.0);
    }
    // Transfer from savings to checking
    


    // Ask user for id#
    System.out.print("Please enter the account ID: ");
    Scanner kbd =new Scanner(System.in);
    id = kbd.nextInt();
    int location = -1;
    for(int i=0 ; i<accounts.length; i++)
    {
      if(accounts[i].getId() == id)
      {
        location =i;
        BankAccount.transfer(savingsAccounts[location],checkingAccounts[location]);
      }
    }

    if(location >0)
    {
      System.out.println("The account was located in record "+ location);
      System.out.println(accounts[location]);
      System.out.println("Checking after transfer:\n " + checkingAccounts[location]);
      System.out.println("Savings after transfer:\n "+ savingsAccounts[location]);   
    }
    else
    {
      System.out.println("No account with id " +id + " was located");
    }
    }
}
