public class FriendsPairing {
    public static int friendsPairing(int n){
        //Base case
        if(n == 1 || n == 2){
            return n;
        }

        //single choice
        int fnm1 = friendsPairing(n-1);

        //pair choice
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;

        //Total ways
        int totalWays = fnm1 + pairWays;
        return totalWays;
    }
    public static void main(String[] args){
        System.out.println(friendsPairing(3));
    }
}
