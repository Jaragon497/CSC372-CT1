public class BankAccount {
    private String firstName;
    private String lastName;
    private int accountID;
    double balance;

    public BankAccount(){
        balance = 0;
    }

    // DEPOSIT AND WITHDRAWAL METHODS
    public void deposit(double amount){
        balance += amount;
    }
    public void withdrawal(double amount){
        balance -= amount;
    }
    // GETTERS AND SETTERS
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setAccountID(int accountID){
        this.accountID = accountID;
    }
    public int getAccountID(){
        return accountID;
    }

    // Get Balance
    public double getBalance(){
        return balance;
    }

    public void accountSummary(){
        System.out.println("Account ID: " + accountID);
        System.out.println("Account holder: " + lastName + ", " + firstName);
        System.out.println("Balance: $" + balance);
    }
}
