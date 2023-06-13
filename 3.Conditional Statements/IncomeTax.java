import java.util.*;

public class IncomeTax{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Your Salary in Lakhs : ");
        int income = sc.nextInt();
        float tax = 0f;
        
        if(income < 500000){
            tax = 0;
        }
        else if(income >= 500000 && income < 1000000){
            tax = income * 0.2f;
        }
        else{
            tax = income * 0.3f ;
        }

        System.out.println("Your Tax Amount is : " + tax + " Rs");

        sc.close();
    }
}