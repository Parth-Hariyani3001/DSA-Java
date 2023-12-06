import java.util.*;

public class insertInHeap {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            //add at last idx
            arr.add(data);
            
            int x = arr.size() - 1; //x is child index
            int parent = (x - 1) / 2;

            while(arr.get(x) < arr.get(parent)){    //O(logn)
                //swap
                int temp = arr.get(x);
                arr.set(x , arr.get(parent));
                arr.set(parent, temp);
                
                x = parent;
                parent = (x - 1) / 2;
            }
        }

        public int peek(){
            return arr.get(0);
        }
    }
    public static void main(String args[]){
        Heap hp = new Heap();
        hp.add(2);
        hp.add(3);
        hp.add(4);
        hp.add(5);
        hp.add(10);
        hp.add(1);

        System.out.println(hp.arr);
        System.out.println(hp.peek());
    }
}
