package uk.me.johnwilson.bankaccount;

import java.util.LinkedList;

public class BankAccount {

    private int balance;
    private LinkedList<Integer> transactions = new LinkedList<Integer>();

    public void deposit(int amount) {
        transactions.add(amount);
    }

    public void withdraw(int amount) {
        transactions.add(-amount);
    }

    public int getLastTransaction() {
        return (int) transactions.getLast();
    }

    public String printStatement() {

        String header = "Amount || Balance";
        String statement = header;
        balance = 0;

        for (int i = 0; i < transactions.size(); i++) {
            statement += "\n" + transactions.get(i) + " || " + (balance += transactions.get(i));

        }

        System.out.println(statement);
        return statement;
    }
}




