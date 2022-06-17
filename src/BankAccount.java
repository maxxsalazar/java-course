public class BankAccount 
{
    // Fields
    private int id;
    private String name;
    private double balance;
    
    // Constructor
    public BankAccount(){
        this.id = 0;
        this.name = null;
        this.balance = 0;
    }
    public BankAccount(int id, String name, double balance)
    {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public static BankAccount transfer(BankAccount origin, BankAccount destination) {
		
		double account1 = origin.getBalance();
		double account2 = destination.getBalance();
		double accumulator;
		
		accumulator = account1 + account2;
		
		origin.setBalance(0);
		destination.setBalance(accumulator);
		
		return null;
		
	}
    //Setters
    public void setId(int id)
    {
        this.id = id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    // Getters
    public int getId()
    {
        return this.id;
    }
     public String getName()
    {
        return this.name;
    }
    public double getBalance()
    {
        return this.balance;
    }

    // Withdraw money from a BankAccount
    public void withdraw(double amount)
    {
        this.balance -= amount;
    }

    // Deposit money into your BankAccount
    public void deposit(double amount)
    {
        this.balance += amount;
    }

    /***************
    toString() method allows us to print the
    BankAccount objects directly
    *****************/
     public String toString()    
    {        
        return String.format("Account #: %d\nOwner: %s\nBalance: $%,.2f\n\n",
                this.id, this.name, this.balance);   
    }
/***********************
 This method prints an array of BankAccount objects
 ************************/
  public static void printArray(BankAccount[] array)
  {
    for(int i =0; i<array.length; i++)
    {
      System.out.print(array[i]);
    }
  }

}
