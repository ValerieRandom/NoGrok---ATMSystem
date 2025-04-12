package Defined;

public class UserAccount {

    private int Total;
    private int WithdrawalAmount;
    private int SaveMoney;
    public UserAccount(int withdrawalAmount, int saveMoney, int total, int accountNumber) {
        WithdrawalAmount = withdrawalAmount;
        SaveMoney = saveMoney;
        Total = total;
        AccountNumber = accountNumber;
    }
    private int AccountNumber;

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int total) {
        Total = total;
    }

    public int getWithdrawalAmount() {
        return WithdrawalAmount;
    }

    public void setWithdrawalAmount(int withdrawalAmount) {
        WithdrawalAmount = withdrawalAmount;
    }

    public int getSaveMoney() {
        return SaveMoney;
    }

    public void setSaveMoney(int saveMoney) {
        SaveMoney = saveMoney;
    }

}
