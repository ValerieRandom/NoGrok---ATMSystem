package Defined;

class User {

     private String Account;
     private int PassWord;

     public User(int passWord, String account, int total) {
         PassWord = passWord;
         Account = account;
     }
     public String getAccount() {
         return Account;
     }

     public void setAccount(String account) {
         Account = account;
     }

     public int getPassWord() {
         return PassWord;
     }

     public void setPassWord(int passWord) {
         PassWord = passWord;
     }

}
