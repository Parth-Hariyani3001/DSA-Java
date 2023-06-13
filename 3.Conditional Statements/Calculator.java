import java.util.*;

public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1 : ");
        double n1 = sc.nextDouble();

        System.out.println("Enter Number 2 : ");
        double n2 = sc.nextDouble();

        System.out.println("Enter the operation you want to perform +,-,*,/,%  :  ");
        char op = sc.next().charAt(0);

        switch(op){
            case '+' : System.out.println(n1 + n2);
                break;
            case '-' : System.out.println(n1 - n2);
                break;
            case '*' : System.out.println(n1 * n2);
                break;
            case '/' : System.out.println(n1 / n2);
                break;
            case '%' : System.out.println(n1 % n2);
                break;
            default : System.out.println("Invalid operation");
        }

        sc.close();
    }
}
