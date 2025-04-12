package Defined;


public class Menu {

    public static void WelcomePage()
    {
        System.out.println( "Welcome to simple ATM system\n");

        ALLUtil.UserAccountAnswer();

    }

    public String ShowMenu = "主選單 - 請選擇您要進行的業務，輸入編碼即可\n" +
            "1. 存款：輸入金額，更新餘額。\n" +
            "2. 提款：檢查餘額是否足夠，否則提示錯誤。\n" +
            "3. 查餘額：顯示當前餘額。"+
            "4. 結束業務\n";



}
