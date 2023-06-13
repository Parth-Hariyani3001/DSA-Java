import java.util.*;

public class SumOfN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of n : ");
        int N = sc.nextInt();
        int x = 0;
        int i = 0;

        while(i <= N){
            x = x + i;
            i++;
        }

        System.out.println("The sum of N natural numbers is : " + x);

        sc.close();
    }
}

