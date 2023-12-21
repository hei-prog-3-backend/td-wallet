import entity.Account;
import operation.AccountCrudOperations;

public class Main {
    public static void main(String[] args) {
        AccountCrudOperations accountCrudOperations = new AccountCrudOperations();

        // Check if accountCrudOperations.findById(1) returns Account(id=1,name=Account 1)
        String input = "1";
        Account result = accountCrudOperations.findById(input);
        System.out.println(result);

        // Check if accountCrudOperations.findAll() returns [Account(id=1,name=Account 1),Account(id=1,name=Account 1)]
        System.out.println(accountCrudOperations.findAll());
    }
}