package uk.me.johnwilson.bankaccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount b1;

    @Test
    public void testDeposit(){
        BankAccount andrei = new BasicBankAccount();
        andrei.deposit(100);
        assertEquals(andrei.getLastDeposit(),100);
        andrei.deposit(56);
        assertEquals(andrei.getLastDeposit(),56);
    }

    @Test
    public void testWithdraw() {
        BankAccount ba = new BasicBankAccount();
        ba.withdraw(50);
        assertEquals(50, ba.getLastWithdrawal() );
        ba.withdraw(5);
        assertEquals(5, ba.getLastWithdrawal() );
    }

    @Test
    public void calculateBalance(){
        BankAccount ba = new BasicBankAccount();
        ba.deposit(1000);
        assertEquals(1000,ba.getBalance());
        ba.withdraw(999);
        assertEquals(1,ba.getBalance());
    }


    @Test
    public void shouldPrintEmptyAccountInfo(){
        BankAccount ba = new BasicBankAccount();
        String s = ba.printStatement();
        assertTrue(s.contains("Amount || Balance"));

    }

}
