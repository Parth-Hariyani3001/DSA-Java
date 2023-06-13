public class Product {
    public static int Multiply(int a, int b){
        int c = a * b;
        return c;
    }
    public static void main(String args[]){
        int n1 = 5;
        int n2 = 10;

        int product = Multiply(n1, n2);
        
        System.out.println("The product is : " + product);
    }
}
