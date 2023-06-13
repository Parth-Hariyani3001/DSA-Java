public class Quest5 {
    public static int calcDigit(int a){
        int sum = 0;
        while(a > 0){
            int LastDigit = a % 10;
            sum = sum  + LastDigit;
            a = a / 10;
        }
        return sum;
    }
    public static void main(String args[]){
        int a = 525;
        int SumOfInteger = calcDigit(a);
        System.out.println(SumOfInteger);
    }
}
