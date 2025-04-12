package Defined;

public class UserAccount {

    private String Total;
    private String WithdrawalAmount;
    private String SaveMoney;
    private String AccountNumber;

    public UserAccount(String withdrawalAmount, String saveMoney, String total, String accountNumber) {
        WithdrawalAmount = withdrawalAmount;
        SaveMoney = saveMoney;
        Total = total;
        AccountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;

    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String total) {
        Total = total;
    }

    public String getWithdrawalAmount() {
        return WithdrawalAmount;
    }

    public void setWithdrawalAmount(String withdrawalAmount) {
        WithdrawalAmount = withdrawalAmount;
    }

    public String getSaveMoney() {
        return SaveMoney;
    }

    public void setSaveMoney(String saveMoney) {
        SaveMoney = saveMoney;
    }

}
