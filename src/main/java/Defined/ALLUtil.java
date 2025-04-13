package Defined;

import java.util.Scanner;

public class ALLUtil {

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
    }
}
