public class GetIthbit {
    public static int ithBit(int n,int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        } else {
            return 1;
        }
    }
    public static void main(String args[]){
        int n = 10;     // 10 -> 1010
        int i = 3;
        System.out.println(ithBit(n,i));
    }
}
