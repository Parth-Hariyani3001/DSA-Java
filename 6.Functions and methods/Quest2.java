public class Quest2 {
    public static boolean calcEvenOdd(int a){
        boolean isEven = true;
        if(!(a % 2 == 0)){
            isEven = false;
        }
        return isEven;
    } 
    public static void main(String args[]){
        int a = 5;
        boolean isEven = calcEvenOdd(a);
        System.out.println(isEven);
    }
}
