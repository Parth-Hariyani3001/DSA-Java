public class StringCompression {
    public static String compress(String str){
        StringBuilder sb = new StringBuilder("");
        int count = 1;
        char ch = str.charAt(0);

        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == ch){
                count++;
            }   else {
                sb.append(ch);
                sb.append(count);
                count = 1;
                ch = str.charAt(i);
            }    
        }
            //Append the last character and it's count
            sb.append(ch);
            sb.append(count);
        return sb.toString();
    }
    public static void main(String args[]){
        String str = "aaabbccdd";
        System.out.println(compress(str));
    }
}
