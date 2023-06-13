import java.util.*;

public class PrimeInRange{

    //Only for n>= 2
    public static boolean isPrime(int n){
        boolean isPrime = true;
        if(n == 2){
            isPrime = false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    
    public static void main(String args[]){
        int n = 10;

        for(int i = 1; i<= 10; i++){
            boolean primeNum = isPrime(i);
            if(primeNum){
                System.out.println(i);
            }   else {
                continue;
            }
        }
    }
}
