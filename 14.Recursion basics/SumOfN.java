public class SumOfN {
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        n = n + sum(n-1);
        return n;
    }
    public static void main(String[] args){
        System.out.print(sum(5));
    }
}
