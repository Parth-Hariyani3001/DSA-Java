public class ButterflyPattern {
    public static void main(String args[]){
        int n = 4;
        //First Half
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row ; col++){
                System.out.print("* ");
            }
            for(int col = 1; col <= (2*(n - row));col++){
                System.out.print("  ");
            
            }
            for(int col = 1;col <= row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Second Half
        for(int row = n; row >= 1; row--){
            for(int col = 1; col <= row ; col++){
                System.out.print("* ");
            }
            for(int col = 1; col <= (2*(n - row));col++){
                System.out.print("  ");
            
            }
            for(int col = 1;col <= row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
