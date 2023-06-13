import java.util.*;

public class BinaryToDecimal {
    public static int CalcDecimal(int n){
        int power = 0;
        int decimal = 0;
        do{
            int LastDigit = n % 10;
            decimal = decimal + LastDigit * (int)Math.pow(2,power);
            power++;
            n = n / 10;
        } while(n > 0);
        return decimal;
    }
    public static void main(String args[]){
        int n = 10100011;
        int decimal = CalcDecimal(n);
        System.out.println(decimal);
    }
}
