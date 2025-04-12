package Defined;

class User {

     private String Account;
     private String PassWord;

     public User(String passWord, String account, int total) {
         PassWord = passWord;
         Account = account;
     }
     public String getAccount() {
         return Account;
     }

     public void setAccount(String account) {
         Account = account;
     }

     public String getPassWord() {
         return PassWord;
     }

     public void setPassWord(String passWord) {
         PassWord = passWord;
     }

}
