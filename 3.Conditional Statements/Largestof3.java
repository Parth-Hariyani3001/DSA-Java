public class Largestof3 {
    public static void main(String args[]){
        int a = 20, b = 6, c = 2;
        if(a > b){
            if(a > c){
                System.out.println("A is the largest");
            }
        }
        else if(b > c){
            System.out.println("B is the largest Number");
        }
        else{
            System.out.println("C is the largest Number");
        }
    }
}
