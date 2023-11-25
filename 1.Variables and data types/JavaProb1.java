import java.util.*;

public class JavaProb1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        float avg = (A + B + C) / 3;

        System.out.println(avg);
        sc.close();
    }
}