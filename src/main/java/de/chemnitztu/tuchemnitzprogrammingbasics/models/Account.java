package de.chemnitztu.tuchemnitzprogrammingbasics.models;

public class Account {
    private int accountNumber;
    private int pin;
    private double balance;

    public Account(int accountNumber, int pin) {
        this.accountNumber = accountNumber;
        this.pin = checksum(pin);
        this.balance = 0.0;
    }

    private int checksum(int pin) {
        int sum = 0;
        do {
            sum += (pin % 10);
            pin /= 10;
        } while (pin != 0);
        return sum;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void credit(double amount) {
        setBalance(getBalance() + amount);
    }

    public boolean debit(double amount, int pin) {
        int checksumOfProvidedPin = checksum(pin);
        if (getPin() == checksumOfProvidedPin) {
            double balance = getBalance();
            if (balance >= amount) {
                setBalance(balance - amount);
                return true;
            } else return false;
        } else {
            return false;
        }
    }

    public boolean transferTo(Account recipient, double amount, int pin) {
        boolean foundState = debit(amount, pin);
        if (foundState) {
            recipient.credit(amount);
            return true;
        } else {
            return false;
        }
    }
}
