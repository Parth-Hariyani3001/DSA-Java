public class AccessModifiers {
    public static void main(String[] args){
        BankAccount u1 = new BankAccount();
        u1.username = "Parth Hariyani";
        //u1.password = "12345"; -> Give error as we cannot get the private variables
        //u1.setPassword("12345");    //We can only set the password
    }
}

class BankAccount{
    public String username;
    //private String password;

    // public void setPassword(String pwd){
    //     this.password = pwd;
    // }
}