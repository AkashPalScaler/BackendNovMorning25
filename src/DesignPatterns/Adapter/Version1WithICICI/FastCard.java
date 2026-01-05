package DesignPatterns.Adapter.Version1WithICICI;


// Fastag Cards -> Put in cars for toll deduction
public class FastCard {
    String accountNo;

    public FastCard(String accountNo) {
        this.accountNo = accountNo;
    }

    void recharge(Integer amount, ICICIBankAPI iciciBankAPI, String userAccount){
        if(iciciBankAPI.fetchBalance(Integer.parseInt(accountNo)) < amount){
            throw new RuntimeException("Insufficient Balance");
        }
        iciciBankAPI.makeTransfer(amount, Integer.parseInt(userAccount), Integer.parseInt(accountNo));
    }
}
