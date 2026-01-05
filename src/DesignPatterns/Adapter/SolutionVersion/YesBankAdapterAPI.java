package DesignPatterns.Adapter.SolutionVersion;

import DesignPatterns.Adapter.Version1.YesBankAPI;

public class YesBankAdapterAPI implements BankAdapterAPI{
    YesBankAPI yesBankAPI = new YesBankAPI();
    @Override
    public Integer balanceInfo(PhonePeAccount account) {
        // All the logic of tranforming request will come
        String accountNo = account.getNumber();
        return yesBankAPI.getBalance(accountNo);
        //All tranformation response logic goes here
    }

    @Override
    public TransferResponse transfer(Integer amount, PhonePeAccount accountFrom, PhonePeAccount accountTo) {
        //Request Transformation
        String accountFromNo = accountFrom.getNumber();
        String accountToNo = accountTo.getNumber();
        TransferResponse response = new TransferResponse();
        try{
            yesBankAPI.transferAmount(amount, accountFromNo, accountToNo);
            //Response transformation
            response.status = true;
            response.message = "Transfer was successfull";
        } catch (RuntimeException e) {
            response.status = false;
            response.message = e.getMessage();
        }
       return response;
    }
}
