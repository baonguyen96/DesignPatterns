package subsystem;

import java.util.*;

public class Report {
    private final Map<Account, List<Transaction>> accountTransactions;

    public Report() {
        this(new HashMap<>());
    }

    public Report(Map<Account, List<Transaction>> accountTransactions) {
        this.accountTransactions = accountTransactions;
    }

    public int register(Account account, Transaction transaction) {
        int transactionCount = 0;

        if (accountTransactions.containsKey(account)) {
            List<Transaction> transactions = accountTransactions.get(account);
            transactions.add(transaction);
            accountTransactions.put(account, transactions);
            transactionCount = transactions.size();
        }
        else {
            accountTransactions.put(account, Collections.singletonList(transaction));
            transactionCount = 1;
        }

        return transactionCount;
    }

    public List<Transaction> audit(Account account) {
        return this.accountTransactions.get(account);
    }
}
