package Exceptions3;

import java.io.IOException;
import java.sql.SQLException;

public class Client {
    public static void main(String[] args){
        try{
            Calculator.division(2,0);
        } catch (RuntimeException e){
            System.out.println("Exception e : " + e.getMessage() );
        }
        catch (SQLException e){
            //Retry Logic
//            System.out.println("Exception e : " + e.getMessage());
//            throw e;
        }catch (IOException e ){
//            System.out.println("Exception e : " + e.getMessage());
//            throw e;
        }
        catch (Exception e){
            // Catch all exceptions-if by mistake anything is missed
            // return http.response("Invalid server error")
        }

    }
}

// Checked Exceptions - Java wants you to declare that function throws the exception
// Unchecked Exceptions - Java does not require you to declare

// MVC : Model-View-Controller
// controller- Waiter (input/output format) -> service - Kitchen(Processes your request) -> model - Pantry/Refrigerator ( Repository/Database)

// Most of your catch blocks where you need to handle the error
// and send proper response to customer should be in controller

// Cases where you can have catch blocks in service layer
// You want to just log the issue and rethrow err
// Retry logic