package Exceptions;

public class MyCheckedChildException extends MyCheckedException{
    public MyCheckedChildException(String message) {
        super(message);
    }
}
// Exception -> MyCheckedExc -> MyCheckedChildExc
