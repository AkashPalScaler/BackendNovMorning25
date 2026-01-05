package DesignPatterns.Adapter.SolutionVersion;

import DesignPatterns.Adapter.Version1.YesBankAPI;

public class PhonePe {
    FastCard fastCard = new FastCard("982317");
    PhonePeAccount phonePeAccount = new PhonePeAccount("178123413412");
    BankAdapterAPI bankAdapterAPI = new YesBankAdapterAPI();

    void rechargeFastCard(Integer amount){
        fastCard.recharge(amount, bankAdapterAPI, phonePeAccount);
    }
}
