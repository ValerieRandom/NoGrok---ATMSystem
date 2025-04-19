import Defined.ALLUtil;

import java.sql.SQLException;
import java.util.Objects;


public class Main {

    public static void main(String[] args) throws SQLException {

        System.out.println("請問是否是第一次使用本系統？(是/否) \n");
        String UserAnswer = ALLUtil.UserAnswer();
        if (Objects.equals(UserAnswer, "是")){

            ALLUtil.Register(UserAnswer);
        }
        else {

            ALLUtil.Login(UserAnswer);
        }
    }

}


