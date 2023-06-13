import java.util.*;

public class ParameterFunctionDemo {
    
    public static int Addition(int a, int b){       //Parameters or formal Parameters
        int c = a + b;
        return c;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int add = Addition(n1, n2);                 //Arguments or actual parameters
        System.out.println("The Addition is : " + add);
        sc.close();
    }
}

    
