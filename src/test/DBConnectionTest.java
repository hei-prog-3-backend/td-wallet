package test;

import db.DBConnection;
import exception.DatabaseConnectionException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DBConnectionTest {
    @Test
    void connection_ok() {
        assertNotNull(DBConnection.getConnection());
    }

    @Test
    void connection_ko() {
        Assertions.assertThrows(DatabaseConnectionException.class, () -> DBConnection.getConnection(null, null, null));
    }
}
