package DesignPatterns.Adapter.SolutionVersion;

import DesignPatterns.Adapter.Version1.PhonePe;
import DesignPatterns.Adapter.Version1.YesBankAPI;

// Fastag Cards -> Put in cars for toll deduction
public class FastCard {
    PhonePeAccount fastCardAccount = new PhonePeAccount("723537");

    public FastCard(String accountNo) {
        this.fastCardAccount = new PhonePeAccount(accountNo);
    }

    void recharge(Integer amount, BankAdapterAPI bankAdapterAPI, PhonePeAccount userAccount){
        if(bankAdapterAPI.balanceInfo(userAccount) < amount){
            throw new RuntimeException("Insufficient Balance");
        }
        TransferResponse response = bankAdapterAPI.transfer(amount, userAccount, fastCardAccount);
        if(response.status){
            System.out.println("Recharge was successfull " + response.message);
        }else{
            System.out.println("Recharge failed with error : " + response.message);
        }
    }
}
