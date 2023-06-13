import java.util.*;

public class BinomialCoefficient {
    
    public static int Factorial(int n){
        int f = 1;
        for(int i = 1; i<= n; i++){
            f = f * i;
        }
        return f;
    }

    public static float Binomial(int n,int r){
        int nFactorial = Factorial(n);
        int rFactorial = Factorial(r);
        int nrFactorial = Factorial(n - r);
        int BinomailCoeff = (nFactorial)/(rFactorial * nrFactorial);
        return BinomailCoeff;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n and r : ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        float BinomailFact = Binomial(n, r);
        System.out.println("The Binomial Factorial is : " + BinomailFact);
        sc.close();
    }
}
