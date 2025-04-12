package Defined;

import java.util.Scanner;

public class ALLUtil {

    public static String UserAnswer;

    public static String UserAccountAnswer(){

        System.out.println("請輸入您的帳戶及密碼，驗證成功我們將進入主選單\n"+
                "帳號：");
        Scanner UserAnswered = new Scanner(System.in);
        String UserAccountAnswer = UserAnswered.next();

        System.out.println("密碼：");
        Scanner UserPWAnswered = new Scanner(System.in);
        String UserPWAnswer = UserAnswered.next();

        return UserAccountAnswer;

    }

    public String Auth (String UserAccountAnswer, String UserPWAnswer ){

    }


}
