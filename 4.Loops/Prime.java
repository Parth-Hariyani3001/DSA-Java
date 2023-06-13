import java.util.*;

public class Prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 2){
            System.out.println("n is not prime");
        } else{
                boolean isPrime = true;
                for(int i = 2; i <= Math.sqrt(n); i++){         //or i <= n-1(Takes more time)
                    if(n % i == 0) {        
                        isPrime = false;
                    }
                }

                if(isPrime == true) {
                    System.out.println("Your number is prime");
                } else {
                    System.out.println("You number is not prime");
                }
        }
        sc.close();
    }

}
