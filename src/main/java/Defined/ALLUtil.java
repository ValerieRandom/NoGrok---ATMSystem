package Defined;

import java.sql.*;
import java.util.Scanner;

public class ALLUtil {

    static final String DB_URL = "jdbc:postgresql://localhost:5432/mydb";

    public static String Register(String scanner){
        System.out.println("請先註冊您的帳號及密碼\n"+
                "帳號：");
        String SettingAccount = UserAnswer();

        System.out.println("密碼：\n");
        String SettingPassWord = UserAnswer();

        try (Connection conn = DriverManager.getConnection(DB_URL)) {
            String sql = "INSERT INTO users (account, password) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, SettingAccount);
            stmt.setString(2, SettingPassWord);
            stmt.executeUpdate();
            System.out.println("註冊成功！");
        } catch (SQLException e) {
            System.out.println("註冊失敗: " + e.getMessage());
        }
        return ShowMenu();
    }

    public static String Login (String scanner) throws SQLException {
        System.out.println("請登入您的帳號及密碼\n"+
                "帳號：");
        String GettingAccount = UserAnswer();

        System.out.println("您的密碼\n"+
                "密碼：");
        String GettingPassWord = UserAnswer();

        try (Connection conn = DriverManager.getConnection(DB_URL)){
            String sql = "SELECT * FROM users WHERE account = ? AND password = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, GettingAccount);
            stmt.setString(2, GettingPassWord);
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                throw new SQLException("帳戶或密碼錯誤");
            }
        }
        return ShowMenu();
    }

    public static String ShowMenu() {

    System.out.println("=== 銀行系統主選單 ===\n" + "請選擇您要進行的業務，輸入編號即可\n" +
            "1. 存款：輸入金額，更新餘額。\n" +
            "2. 提款：檢查餘額是否足夠，否則提示錯誤。\n" +
            "3. 查餘額：顯示當前餘額。\n" +
            "4. 結束業務\n");
    String UserAnswer = UserAnswer();
    return SelectMenu(UserAnswer);

    }

    public static String SelectMenu(String UserAnswer){

            switch (UserAnswer) {
                case "1":
                    ALLUtil.SaveMoney();
                    break;
                case "2":
                    ALLUtil.TakeMoney();
                    break;
                case "3":
                    ALLUtil.CheckAmount();
                    break;
                case "4":
                    ALLUtil.Logout();
                    break;
                default:
                    System.out.println("無效操作！重新進入主選單");
            }

            return ShowMenu ();
    }

    public static String UserAnswer(){

        Scanner UserAnswered = new Scanner(System.in);
        String UserAnswer = UserAnswered.next();

        return UserAnswer;
    }


    public static void SaveMoney() {
        System.out.println("存錢");
    }

    public static void TakeMoney() {
        System.out.println("提錢");
    }

    public static void CheckAmount() {
        System.out.println(("查詢餘額"));
    }

    public static void Logout() {
        System.out.println("登出 結束操作");
        System.exit(0);
    }
}
