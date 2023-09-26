public class QueueUsingLinkedList {   
    //Node class
    static class Node{
        int data;
        Node next;
        Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    //Queue class
    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        public static void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = head.data;
            if(tail == head){ //if we have single element in the linked list
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }

    }
    /**
     * @param args
     */
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
