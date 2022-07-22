package uk.me.johnwilson.bankaccount;

public class BasicBankAccount implements BankAccount {

    private int balance = 0;
    private int lastDeposit = 0;
    private int lastWithdrawal = 0;


    @Override
    public void deposit(int amount) {
        lastDeposit = amount;
        balance+=lastDeposit;
    }

    @Override
    public void withdraw(int amount) {
        lastWithdrawal = amount;
        balance-=lastWithdrawal;

    }

    @Override
    public int getLastWithdrawal() {
        return lastWithdrawal;
    }

    @Override
    public String printStatement() {
        String header = "Amount || Balance";
        String result =  header + "\n" + lastDeposit + " || " + balance;
        System.out.println(result);
        return result;
    }

    @Override
    public int getBalance() {

        return balance;
    }

    @Override
    public int getLastDeposit() {
        return lastDeposit;
    }
}
