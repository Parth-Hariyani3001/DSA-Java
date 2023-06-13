public class Quest3 {
    public static int calcPalindrome(int n){
        int palindrome = n;
        int rev = 0;
       while(palindrome > 0){
            int lastDigit = palindrome % 10;
            rev = rev * 10 + lastDigit;
            palindrome = palindrome/10;
        }
        return rev;
    }
    public static void main(String args[]){
        int n = 121;
        int rev = calcPalindrome(n);
        System.out.println(rev);
        if(n == rev){
            System.out.println(n + " is a Palindrome number");
        }   else {
            System.out.println(n + " is not a palindrome number");
        }
    }
}
