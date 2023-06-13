import java.util.*;

public class Quest4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);    
        System.out.println("Enter the number to display : ");
        int n = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(n + " * " + i + " = " + (n * i));
        }

        sc.close();
    }
}
