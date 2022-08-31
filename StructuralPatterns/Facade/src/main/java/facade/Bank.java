package facade;

import subsystem.Account;
import subsystem.Report;
import subsystem.Transaction;

import java.util.List;

public class Bank {
    private Report report;

    public Bank() {
        this(new Report());
    }

    public Bank(Report report) {
        this.report = report;
    }

    public List<Transaction> deposit(Account account, double amount) throws Exception {
        if (!account.isAccountInGoodStandingStatus()) {
            throw new Exception("Account does not have good standing status, hence cannot proceed!");
        }

        Transaction transaction = new Transaction(amount, "deposit");
        this.report.register(account, transaction);
        return report.audit(account);
    }

}
