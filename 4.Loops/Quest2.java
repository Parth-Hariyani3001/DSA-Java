import java.util.*;

public class Quest2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        int n = 0;
        do{
            n = sc.nextInt();
            if(n % 2 == 0){
                evenSum = evenSum + n;
                System.out.println("The even Sum = " + evenSum);
            } else {
                oddSum = oddSum + n;
                System.out.println("the Odd sum = " + oddSum);
            }
        }while(true);
    }
}
