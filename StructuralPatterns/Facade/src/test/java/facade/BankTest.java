package facade;

import org.junit.Test;
import subsystem.Account;
import subsystem.Transaction;

import java.util.List;

import static org.junit.Assert.*;

public class BankTest {

    @Test
    public void testDeposit() throws Exception {
        Bank bank = new Bank();
        List<Transaction> transactions = bank.deposit(new Account("123"), 10);
        assertEquals(1, transactions.size());
    }
}