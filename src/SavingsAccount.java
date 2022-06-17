/**
 * SavingsAccount
 */
public class SavingsAccount extends BankAccount {

    public SavingsAccount(int id, String name, double balance){
        setId(id);
        setName(name);
        setBalance(balance);
    }
    public SavingsAccount(){
        setId(2);
        setName(null);
        setBalance(2);
    }

    public String toString(){
        return "Savings Account \n-----------------\n" + super.toString();
    }
    
}