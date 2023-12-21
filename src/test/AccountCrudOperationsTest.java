package test;

import entity.Account;
import operation.AccountCrudOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountCrudOperationsTest {
    AccountCrudOperations subject = new AccountCrudOperations();

    @Test
    void read_accounts_ok() {
        Account account1 = new Account("1", "Account 1");
        Account account2 = new Account("2", "Account 2");

        List<Account> actual = subject.findAll();

        assertEquals(2, actual.size());
        assertTrue(actual.containsAll(List.of(account1, account2)));
    }

    @Test
    void read_account_by_id_ok() {
        String input = "1";
        Account account1 = new Account("1", "Account 1");

        Account actual = subject.findById(input);

        Assertions.assertEquals(account1, actual);
    }
}
