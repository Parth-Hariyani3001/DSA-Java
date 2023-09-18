import java.util.Stack;

public class ReverseAString {
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int len = str.length();
        for(int i = 0;i < len;i++){
            s.push(str.charAt(i));
        }
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String s = "abc";
        System.out.println("Before Reversing : " + s);
        s = reverseString(s);
        System.out.println("After Reversing : " + s);
    }
}
