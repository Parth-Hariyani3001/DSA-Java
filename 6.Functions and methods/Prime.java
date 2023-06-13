public class Prime {

    //Only for n>= 2
    public static boolean isPrime(int n){
        boolean isPrime = true;
        if(n == 2){
            isPrime = false;
        }
        for(int i = 2; i <= n-1; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    
    public static void main(String args[]){
        int n = 2;
        boolean primeNum = isPrime(n);

        if(primeNum){
            System.out.println("It's a Prime Number");
        }   else {
            System.out.println("It's not a prime number");
        }

    }
}
