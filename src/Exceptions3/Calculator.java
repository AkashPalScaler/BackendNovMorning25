package Exceptions3;

import java.io.IOException;
import java.sql.SQLException;

public class Calculator {
    static Integer division(Integer a, Integer b) throws SQLException, IOException, MyCustomException{
        int c;
//        try{
            if(b<=0){
                throw new ArithmeticException("Division by negative not allowed");
//            System.out.println("Wrong input,please try again");
            }
            if(a == 3){
                throw new SQLException("DB CONN ERR");
            }
            if(b == null){

                throw new NullPointerException();
            }
            if(b == 10){
                throw new IOException();
            }
            if(b == 20){
                throw new MyCustomException();
            }
            if(b == 30){
                throw new MyCustomRuntimeException();
            }
             c = a/b;
//        }

//        catch (RuntimeException e){
//            System.out.println("Exception e : " + e.getMessage());
//        }
//        catch (SQLException e){
//            //Retry Logic
//            System.out.println("Exception e : " + e.getMessage());
//            throw e;
//        }catch (IOException e ){
        //    logger.debug()
//            System.out.println("Exception e : " + e.getMessage());
//            throw e;
//        }
//        catch (Exception e){
//            // Catch all exceptions-if by mistake anything is missed
//            // return http.response("Invalid server error")
//        }

        return c;
    }
}
