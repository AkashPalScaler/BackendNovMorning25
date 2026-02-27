package Exceptions2;

import java.io.IOException;
import java.sql.SQLException;

public class Calculator {
    static Integer division(Integer x, Integer y) throws SQLException, IOException, MyCustomException {
        Integer answer =  x/y;

        if(y==10){
            throw new ArithmeticException();
        }
        if(y <= 0){
            throw new RuntimeException("Negative divisor");
//            System.out.println("Negative divisor not allowed");
        }

        if(y == 2){
            throw new SQLException();
        }
        if(y == 3){
            throw  new IOException();
        }
        if(y == 9){
            throw  new MyCustomException("My custom exception");
        }
        if(y == 11){
            throw new MyCustomRuntimeException("My custom runtime exception!");
        }
        return answer;
    }
}
