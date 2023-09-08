import java.util.ArrayList;

public class printReverse {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1;i < 6; i++){
            list.add(i);
        }
        for(int i = list.size() - 1; i >= 0;i--){
            System.out.println(list.get(i) + " ");
        }
    }
}
