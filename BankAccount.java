public class BankAccount 
{
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance)
    {
        if(accountNumber==null || accountNumber.isEmpty())
        {
            System.err.println("Account Number should be non null and non empty");
            return;
        }
        if(balance<0){
            System.out.println("Error: Balance cannot be negative");
            return;
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}
