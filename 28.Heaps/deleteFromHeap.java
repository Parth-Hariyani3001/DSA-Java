import java.util.*;

public class deleteFromHeap {
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

        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
                minIdx = left;
            }

            if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
                minIdx = right;
            }

            if(minIdx != i){
                //Swap 
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public int remove(){
            int data = arr.get(0);

            //step 1 -> Swap first and last
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size() - 1));
            arr.set(arr.size() - 1,temp);

            //Step 2 -> Delete last
            arr.remove(arr.size() - 1);

            //Step 3 -> heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty(){
            return arr.size() == 0;
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

        System.out.println("Deleted Element from the heap : " + hp.remove());
    }
}
