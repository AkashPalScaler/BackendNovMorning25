package DesignPatterns.Adapter.Version1;

// Fastag Cards -> Put in cars for toll deduction
public class FastCard {
    String accountNo;

    public FastCard(String accountNo) {
        this.accountNo = accountNo;
    }

    void recharge(Integer amount, YesBankAPI yesBankAPI, String userAccount){
        if(yesBankAPI.getBalance(accountNo) < amount){
            throw new RuntimeException("Insufficient Balance");
        }
        yesBankAPI.transferAmount(amount, userAccount, accountNo);
    }
}
