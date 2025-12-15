package Exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class Client {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();
        try {
            calculator.add(3,2);
        } catch (MyCheckedException e) {
            throw new RuntimeException(e);
        }
    }
}

// Any exception that is directly extended from Exception is a checked exception(except for RuntimeException)
// Any exception directly extended from Runtime is unchecked exception