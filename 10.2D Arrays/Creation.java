import java.util.*;
public class Creation{
    public static void main(String args[]){
        int matrix[][] = new int[4][3];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        
        //int m = matrix.length;      //Row
        //int n = matrix[0].length;   //Columns

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}