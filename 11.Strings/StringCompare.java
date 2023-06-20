public class StringCompare {
    public static void main(String args[]){
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if(s1 == s2){
            System.out.println("Strings are equal");
        }   else {
            System.out.println("Strings are not equal");
        }

        if(s1 == s3){
            System.out.println("String are equal");
        }   else {
            System.out.println("String are not equal");
        }

        // '==' Operator check the string at the object level and not the value itself
        //To compare two string always use equals() method

        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }   else {
            System.out.println("Strings are not equal");
        }
    }
}
