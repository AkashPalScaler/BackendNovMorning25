package DesignPatterns.Adapter.Version1WithICICI;


public class PhonePe {
    FastCard fastCard = new FastCard("982317");
    String accountNo = "132873128";
    ICICIBankAPI iciciBankAPI = new ICICIBankAPI();

    void rechargeFastCard(Integer amount){
        fastCard.recharge(amount, iciciBankAPI, accountNo);
    }
}
