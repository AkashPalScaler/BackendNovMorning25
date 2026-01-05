package DesignPatterns.Adapter.SolutionVersion;

import DesignPatterns.Adapter.Version1.ICICIBankAPI;

public class ICICIBankAdapterAPI implements BankAdapterAPI{
    ICICIBankAPI iciciBankAPI = new ICICIBankAPI();
    @Override
    public Integer balanceInfo(PhonePeAccount account) {
        //request Tranformation
        //actual API call
        // response Transformation
        return 0;
    }

    @Override
    public TransferResponse transfer(Integer amount, PhonePeAccount accountFrom, PhonePeAccount accountTo) {
        return null;
    }
}
// Homework: Finish the 2 adapter functions