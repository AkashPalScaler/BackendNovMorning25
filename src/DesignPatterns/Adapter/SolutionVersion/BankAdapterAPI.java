package DesignPatterns.Adapter.SolutionVersion;

public interface BankAdapterAPI {
    Integer balanceInfo(PhonePeAccount account);
    TransferResponse transfer(Integer amount, PhonePeAccount accountFrom, PhonePeAccount accountTo);
}
