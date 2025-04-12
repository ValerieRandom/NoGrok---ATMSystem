import Defined.Menu;

public class Main {

    // 程式進入口
    public static void main(String[] args) {

        System.out.println("請輸入您的帳戶及密碼，驗證成功我們將進入主選單\n"+
                "帳號：");
        System.out.println("請輸入您的帳號");
        Menu.AcountAndPassword();
        System.out.println("請輸入您的密碼");
        Menu.AcountAndPassword();


        Menu.ShowMenu();
    }
}


    /**
     *
     * 主選單生成
     * 1. 註冊帳號密碼
     * 2. 帳戶密碼輸入
     * 3. 選擇業務 -
     * 存款
     * 取款
     * 查詢餘額
     * 3. 顯示業務結果
     *
     **/