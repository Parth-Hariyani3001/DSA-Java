import java.util.*;

public class MultipleOf10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int i = 1;

        while(i > 0){
            System.out.println("Enter a Number : ");
            i = sc.nextInt();
            if(i % 10 == 0) {
                break;
            }
            System.out.println(i);
        }

        sc.close();
    }
}
