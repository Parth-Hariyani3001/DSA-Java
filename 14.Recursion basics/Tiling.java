public class Tiling {
    public static int tilingProblem(int n){         //2 x n (floor size)
        if(n == 0 || n == 1){
            return 1;
        }
        //Vertical choice
        int fVerticalTiles = tilingProblem(n-1);

        //Horizontal choice
        int fHorizontalTimes = tilingProblem(n-2);

        int totalWays = fVerticalTiles + fHorizontalTimes;
        return totalWays;
    }
    public static void main(String args[]){
        System.out.println(tilingProblem(4));
    }
}
