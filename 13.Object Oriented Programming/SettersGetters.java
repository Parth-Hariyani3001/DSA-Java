public class SettersGetters {
    public static void main(String[] args){
        BankAccount u1 = new BankAccount();
        u1.setUsername("Parth Hariyani");
        u1.setPassword("P@rth3001");
        System.out.println(u1.getPassword());
        System.out.println(u1.getUsername());
    }
}

class BankAccount{
    private String username;
    private String password;

    public void setUsername(String username){
        this.username = username;   //setter
    }

    public void setPassword(String pwd){
        this.password = pwd;    //setter
    }
    
    String getPassword(){
        return this.password;   //Getter   
    }

    String getUsername(){
        return this.username;   //Getter
    }
}
