import java.util.ArrayList;

public class pairSum1BruteForce {
    public static boolean pairSum(ArrayList<Integer> list, int target){
        for(int i = 0; i < list.size(); i++){
            for(int j = i+1; j < list.size(); j++){
                int sum = list.get(i) + list.get(j);
                if(sum == target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(pairSum(list, 5));
    }
}
