public class Factorial {
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        n = n * fact(n-1);
        return n;
    }
    public static void main(String[] args){
        System.out.print(fact(5));
    }
}
