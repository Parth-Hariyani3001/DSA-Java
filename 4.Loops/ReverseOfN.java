import java.util.*;

public class ReverseOfN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number You want to reverse : ");
        int N = sc.nextInt();
    
        int ReverseNumber = 0;

        while(N > 0){
            int LastDigit  = N % 10;
            ReverseNumber = (ReverseNumber * 10) + LastDigit;
            N = N / 10;
        }

        System.out.println("The Reversed Number is : " + ReverseNumber);
    
        sc.close();
    }
}
