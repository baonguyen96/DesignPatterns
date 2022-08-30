package subsystem;

import java.util.Objects;

public class Account {
    private final String accountNumber;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean isAccountInGoodStandingStatus() {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountNumber, account.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }
}
