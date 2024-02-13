public class CheckingAccount extends BankAccount {
    private double interestRate;

    // Getters and setters for interestRate
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void processWithdrawal(double amount) {
        double overdraftFee = 30.0;

        // If withdrawal will result in a negative balance
        //  Apply and notify user of overdraft fee
        if ((super.getBalance() - amount) < 0) {
            super.withdrawal(amount + overdraftFee);
            System.out.println("Account overdraft! A $30 fee has been accessed.");
            System.out.println("Current balance: " + super.getBalance());
        } else {
            super.withdrawal(amount);
        }
    }

    public void displayAccount() {
        super.accountSummary();
        System.out.println("Interest rate: " + interestRate + "%");
    }
}
