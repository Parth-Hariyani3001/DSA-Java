public class FunctionOverloading {
    
    public static int add(int a,int b){
        int c = a + b;
        return c;
    }

    public static int add(int a, int b, int c){
        int d = a + b + c;
        return d;
    }
    
    public static void main(String args[]){
        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
    }
}
