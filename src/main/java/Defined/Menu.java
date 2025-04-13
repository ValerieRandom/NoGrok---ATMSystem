package Defined;


public class Menu {

    public static void AcountAndPassword()
    {
        ALLUtil.UserAnswer();

    }

    public static String ShowMenu() {

        System.out.println ("=== 銀行系統主選單 ===\n"+ "請選擇您要進行的業務，輸入編碼即可\n" +
                "1. 存款：輸入金額，更新餘額。\n" +
                "2. 提款：檢查餘額是否足夠，否則提示錯誤。\n" +
                "3. 查餘額：顯示當前餘額。\n" +
                "4. 結束業務\n");

        return ALLUtil.UserAnswer();
    }

    public static void SelectMenu(String UserAnswer){

       switch (UserAnswer){
           case "1" :
               ALLUtil.SaveMoney();
               break;
           case "2" :
               ALLUtil.TakeMoney();
               break;
           case "3" :
               ALLUtil.CheckAmount();
               break;
           case "4" :
               ALLUtil.Logout();
               break;
           default:
               System.out.println("無效操作！重新進入主選單");
       }

    }

}
