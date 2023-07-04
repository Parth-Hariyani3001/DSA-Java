public class PrintNthFibonacci {
    public static int fib(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        n = fib(n-1) + fib(n-2);
        return n;
    }
    public static void main(String[] args){
        System.out.print(fib(5));
    }
}
