package uk.me.johnwilson.bankaccount;

public interface BankAccount {
    void deposit(int amount);

    int getLastDeposit();

    void withdraw(int i);

    int getLastWithdrawal();
    //void withdraw(int amount);
    String printStatement();

    int getBalance();
}
