package entity;

import java.util.Objects;

public class Account {
    private String id;
    private String name;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "entity.Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(id, account.id) && Objects.equals(name, account.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
