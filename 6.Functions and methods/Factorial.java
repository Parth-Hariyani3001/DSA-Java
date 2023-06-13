import java.util.*;

public class Factorial {
    public static int Fact(int a){
        int f = 1;
        for(int i = 1; i <= a; i++){
            f = f * i;
        }
        return f;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int Factorial = Fact(n);
        System.out.println(Factorial);
        sc.close();
    }       
}
