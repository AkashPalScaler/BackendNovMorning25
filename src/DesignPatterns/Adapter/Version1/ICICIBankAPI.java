package DesignPatterns.Adapter.Version1;

public class ICICIBankAPI {
    Integer fetchBalance(Integer account){
        return 0;
    }

    Boolean makeTransfer(Integer accountFrom, Integer accountTo, Integer amount){
        return true;
    }
}
