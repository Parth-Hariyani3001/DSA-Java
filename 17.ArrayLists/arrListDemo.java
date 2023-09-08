import java.util.ArrayList;

public class arrListDemo{
    public static void main(String args[]){
        //Array list is a part of java collection framework
        //ClassName objName = new ClassName();
        ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        //Set operation - o(1)
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(1,9);
        System.out.println(list1);

        //get operation - o(1)
        int element = list1.get(2);
        System.out.println(element);

        //Remove Element - o(n)
        list1.remove(2);
        System.out.println(list1);

        //Set Elements at index - o(n)
        list1.set(2,10);
        System.out.println(list1);

        //contains
        System.out.println(list1.contains(1));
        System.out.println(list1.contains(11));

    }
}