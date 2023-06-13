import java.util.*;

public class DecimalToBinary {
    public static int calcBinary(int n){
        int power = 0;
        int BinaryValue = 0;
        while(n > 0){
            int rem = n % 2;
            BinaryValue = BinaryValue + (rem * (int)Math.pow(10,power));
            power++;
            n = n/2;
        }
        return BinaryValue;
    }
    public static void main(String args[]){
        int n = 5;
        int binaryValue = calcBinary(n);
        System.out.println(binaryValue);
    }
}
