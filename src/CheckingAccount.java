public class CheckingAccount extends BankAccount {
    
    public CheckingAccount(int id, String name, double balance){
        setId(id);
        setName(name);
        setBalance(balance);
    }
    public CheckingAccount(){
        setId(2);
        setName(null);
        setBalance(2);
    }

    public String toString(){
        return "Cheking Account \n-----------------\n" + super.toString();
    }
}
