public class NumberInDecreasing{
    public static void printDecreasing(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDecreasing(n-1);
    }
    public static void main(String[] args){
        printDecreasing(10);
    }
}