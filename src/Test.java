public class Test {
    public static void main(String[] args){
        BankAccount account1 = new BankAccount();
        account1.setFirstName("Joe");
        account1.setLastName("Josephson");
        account1.setAccountID(82348281);
        account1.accountSummary();
        account1.deposit(10000);
        System.out.println();
        account1.withdrawal(2499.99);
        account1.accountSummary();
        System.out.println("The balance of account #" + account1.getAccountID() + " is $" + account1.getBalance());

        System.out.println("\n===== Checking Account Testing =====\n");
        // Checking Account Testing
        CheckingAccount account2 = new CheckingAccount();
        account2.setFirstName("Polly");
        account2.setLastName("Darton");
        account2.setAccountID(24994470);
        account2.setInterestRate(4.32);
        account2.displayAccount();
        System.out.println();

        account2.deposit(200);
        // Test withdrawal without overdraft
        account2.processWithdrawal(30);
        System.out.println("Account balance is: " + account2.getBalance());

        // Test overdraft
        System.out.println();
        account2.processWithdrawal(300);

        System.out.println();
        account2.displayAccount();
    }
}
