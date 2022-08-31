import facade.Bank;
import subsystem.Account;
import subsystem.Report;
import subsystem.Transaction;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            runWithoutFacade();
            runWithFacade();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    /***
     * Interact with subsystem directly
     * Need to know all steps required by it and trigger 1 by 1 in a particular order the subsystem expects
     * Everywhere in our code base if we want to interact with the subsystem then need to replicate below steps
     */
    public static void runWithoutFacade() throws Exception {
        System.out.println("Running without Facade");

        Account account = new Account("123");
        Report report = new Report();

        if (!account.isAccountInGoodStandingStatus()) {
            throw new Exception("Account does not have good standing status, hence cannot proceed!");
        }

        Transaction transaction = new Transaction(10, "deposit");
        report.register(account, transaction);
        List<Transaction> transactions = report.audit(account);
        System.out.println(transactions);
    }

    /***
     * Now having a Bank as facade to the subsystem
     * Hence have a single interface for our internal code to interact with the entire subsystem in a much simpler manner
     */
    public static void runWithFacade() throws Exception {
        System.out.println("Running with Facade");

        Bank bank = new Bank();
        List<Transaction> transactions = bank.deposit(new Account("123"), 10);
        System.out.println(transactions);
    }
}
