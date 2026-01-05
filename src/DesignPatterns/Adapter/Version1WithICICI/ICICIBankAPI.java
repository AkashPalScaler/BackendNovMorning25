package DesignPatterns.Adapter.Version1WithICICI;

public class ICICIBankAPI {
    Integer fetchBalance(Integer account){
        return 0;
    }

    Boolean makeTransfer(Integer accountFrom, Integer accountTo, Integer amount){
        return true;
    }
}
