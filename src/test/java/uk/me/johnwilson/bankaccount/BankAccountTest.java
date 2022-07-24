package uk.me.johnwilson.bankaccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount b1;

    @Test
    public void testDeposit(){
        BankAccount andrei = new BankAccount();
        andrei.deposit(100);
        assertEquals(andrei.getLastTransaction(),100);
        andrei.deposit(56);
        assertEquals(andrei.getLastTransaction(),56);
    }

    @Test
    public void testWithdraw() {
        BankAccount ba = new BankAccount();
        ba.withdraw(50);
        assertEquals(-50, ba.getLastTransaction() );
        ba.withdraw(5);
        assertEquals(-5, ba.getLastTransaction() );
    }



    @Test
    public void shouldPrintEmptyAccountInfo(){
        BankAccount ba = new BankAccount();
        String s = ba.printStatement();
        assertTrue(s.contains("Amount || Balance"));

    }

    @Test
    public void shouldPrintDespositAndBalance(){
        BankAccount ba = new BankAccount();
        ba.deposit(100);
        String s = ba.printStatement();
        assertEquals("Amount || Balance\n100 || 100", s);

    }

    @Test
    public void shouldPrintWithdrawalAndBalance(){
        BankAccount ba = new BankAccount();
        ba.withdraw(200);
        String s = ba.printStatement();
        assertEquals("Amount || Balance\n-200 || -200", s);

    }

    @Test
    public void shouldPrintCorrectBalanceMultipleTransactions(){
        BankAccount ba = new BankAccount();
        ba.deposit(1000);
        ba.withdraw(200);
        ba.withdraw(500);
        ba.deposit(20);
        String s = ba.printStatement();
        assertEquals("Amount || Balance" +
            "\n1000 || 1000" +
            "\n-200 || 800" +
            "\n-500 || 300" +
            "\n20 || 320", s);

    }

}
