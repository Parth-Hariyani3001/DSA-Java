import java.util.*;

public class QueueReversal {
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        Stack<Integer> s = new Stack<>();

        //transferring elements from queue to stack
        while(!q.isEmpty()){
            s.push(q.remove());
        }

        //transferring elements from stack to queue
        while(!s.isEmpty()){
            q.add(s.pop());
        }

        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
    }   
}
