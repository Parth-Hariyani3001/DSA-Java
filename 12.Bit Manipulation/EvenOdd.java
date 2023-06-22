public class EvenOdd {
    public static void calcEvenOdd(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.print("The number is even");
        } else {
            System.out.println("The number is Odd");
        }
    }
    public static void main(String args[]){
        calcEvenOdd(3);
    }
}
