import java.util.*;

public class PrintReverseOfN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number you want to reverse : ");
        int N = sc.nextInt();

        while(N > 0){
            int lastdigit = N % 10;
            System.out.print(lastdigit);
            N = N / 10;
        }

        sc.close();
    }
}
