public class powerOptimized{
    public static int power2(int a, int n){
        if(n == 0){
            return 1;
        }
        int halfPowerSq = power2(a,n/2) * power2(a,n/2);

        if(n % 2 != 0){
            return a * halfPowerSq;
        }

        return halfPowerSq;
    }
    public static void main(String args[]){
        System.out.println(power2(5,5));
    }
}