package DesignPatterns.Adapter.Version1;

public class PhonePe {
    FastCard fastCard = new FastCard("982317");
    String accountNo = "132873128";
    YesBankAPI yesBankAPI = new YesBankAPI();

    void rechargeFastCard(Integer amount){
        fastCard.recharge(amount, yesBankAPI, accountNo);
    }
}
