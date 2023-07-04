public class RemoveDuplicate {
    public static void remDuplicate(String str,int index,StringBuilder newStr, boolean map[]){
        if(index == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(index);
        if(map[currChar-'a'] == true){
            //duplicate
            remDuplicate(str,index+1,newStr,map);
        }   else {
                newStr.append(currChar);
                map[currChar - 'a'] = true;
                remDuplicate(str,index+1,newStr,map);
        }
    }
    public static void main(String args[]){
        String str = "appnnacollege";
        remDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    } 
}
