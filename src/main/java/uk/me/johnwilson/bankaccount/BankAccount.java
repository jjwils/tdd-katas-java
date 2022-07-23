package uk.me.johnwilson.bankaccount;

public class BankAccount {

    private int balance = 0;
    private int lastTransaction = 0;


    public void deposit(int amount) {
        lastTransaction = amount;
        balance+= lastTransaction;
    }

    public void withdraw(int amount) {
        lastTransaction = amount;
        balance-=lastTransaction;

    }

    public int getLastTransaction() {
        return lastTransaction;
    }

    public String printStatement() {
        String header = "Amount || Balance";
        String result =  header + "\n" + lastTransaction + " || " + balance;
        System.out.println(result);
        return result;
    }

    public int getBalance() {

        return balance;
    }

}
