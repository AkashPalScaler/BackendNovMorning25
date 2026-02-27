package Exceptions2;

import java.io.IOException;
import java.sql.SQLException;

public class Client {
    public static void main(String[] args) {
       try{
           Calculator.division(5,-2);
       }catch (ArithmeticException e){

       }catch (RuntimeException e){

       }catch (SQLException e){

       }catch (Exception e){

       }

    }
}
