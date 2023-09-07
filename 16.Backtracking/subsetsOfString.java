public class subsetsOfString {
    public static void findSubsets(String str, String ans, int i){
        //base case 
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }
            System.out.println(ans);
            return;
        }
        //recursion
        //1.YES Choice
        findSubsets(str, ans+str.charAt(i), i+1);
        //2.No Choice 
        findSubsets(str, ans, i+1);
    }
    public static void main(String args[]){
        String str = "abc";
        findSubsets(str, "" , 0);
    }
}
