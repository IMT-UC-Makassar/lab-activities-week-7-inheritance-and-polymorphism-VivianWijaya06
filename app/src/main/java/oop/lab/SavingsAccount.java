package oop.lab;

public class SavingsAccount extends BankAccount implements OnlineService {
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public void calculateInterest() {
        balance += balance * 0.05 / 12; 
    }

    @Override
    public void transferFunds(double amount, String targetAccount) {
        withdraw(amount);
    }

    @Override
    public void payBills(double amount) {
        withdraw(amount);
    }
}