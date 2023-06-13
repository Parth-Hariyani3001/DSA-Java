import java.util.*;

public class OnetoN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of n : ");
        int N = sc.nextInt();
        int x = 0;

        while(x <= N){
            System.out.println(x);
            x++;
        }

        sc.close();
    }
}
