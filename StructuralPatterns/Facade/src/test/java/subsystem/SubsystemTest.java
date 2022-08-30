package subsystem;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SubsystemTest {
    @Test
    public void test() {
        Account account = new Account("123");
        Report report = new Report();
        Transaction transaction = new Transaction(10, "deposit");
        report.register(account, transaction);
        List<Transaction> transactions = report.audit(account);
        assertEquals(1, transactions.size());
    }
}