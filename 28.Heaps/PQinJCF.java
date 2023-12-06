import java.util.*;
public class PQinJCF{
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //To get a priority queue where max integer will get the most priority
        //PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); 

        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);
    
        while(!pq.isEmpty()){
            System.out.print(pq.peek());
            pq.remove();
        }
    }
}