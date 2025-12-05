package Exceptions;

import java.io.IOException;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;

public class Calculator {
    public Integer add(Integer a, Integer b) throws Exception {
       try{
           if(b==0){
               throw new SQLException(); // Checked
           }
           if(a == 0){
               throw new IOException(); // Checked
           }
           else if(a==1){
               throw new ArithmeticException(); // Unchecked
           }
           else if(a == 2){
               throw new MyCheckedException("This is my custom checked exception");
           }else if(a==3){
               throw  new MyUncheckedException("This is unchecked");
           }
           return a/b;
       }
        catch(MyCheckedChildException e){
            System.out.println(e.getMessage());
            throw e;
        }
       catch (MyCheckedException e){ // This can catch both itself and it's child
           System.out.println(e.getMessage());
           throw e;
       }
       catch(MyUncheckedException e){
           System.out.println();
           throw e;
       }
       catch (RuntimeException e){
           System.out.println();
           throw e;
       }
       catch(Exception e){ // Accepts all checked exceptions
           System.out.println(e.getMessage());
           throw e;
       }

       finally {
           // Close connection
           // Clear up memory
           // Started some process that needs to be killed
           System.out.println("Function is over");
       }
    }
}
// Exceptions:
// Checked , Unchecked exception, Exception inheritance and hierarchy
// Throw vs Throws
// Try, Catch and Finally
