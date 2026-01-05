package DesignPatterns.Adapter.SolutionVersion;

public class PhonePeAccount {
    String number;
    String bankName;
    String IFSC;

    public PhonePeAccount(String number) {
        this.number = number;
    }

    public String getNumber() {

        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
