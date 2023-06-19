public class DiagonalMatrix {
    public static int calcDiagonal(int num[][]){
        int sum = 0;

        //Brute Force Approach
        // for(int i = 0; i < num.length; i++){
        //     for(int j = 0; j < num[i].length; j++){
        //         if(i == j){
        //             sum = sum + num[i][j];
        //         }   else if(i+j == num.length-1){
        //             sum = sum + num[i][j];
        //         }
        //     }
        // }

        //Optimal Approach
        for(int i = 0; i < num.length; i++){
            //Primary Diagonal
            sum += num[i][i];
            //Secondary Diagonal
            if(i != num.length - 1 - i){
                sum += num[i][num.length-i-1];
            }
        }
        
        return sum;
    }
    public static void main(String args[]){
        int matrix[][]= {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        System.out.print(calcDiagonal(matrix));
    }
}
