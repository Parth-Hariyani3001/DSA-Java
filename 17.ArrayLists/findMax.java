import java.util.ArrayList;

public class findMax {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(40);
        list.add(1);
        list.add(5);
        list.add(15);

        int max = list.get(0);

        for(int i = 1; i < list.size(); i++){
            // if(list.get(i) > max){
            //     max = list.get(i);
            // }
            max = Math.max(max,list.get(i));
        }

        System.out.println(max);
    }
}
