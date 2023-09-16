public class LinkedList{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //static variables
    public static Node head;
    public static Node tail;
    public static int size = 1;

    public void addFirst(int data){
         //step 1 -> Create new Node
        Node newNode = new Node(data);
        //edge case where there is no node 
        if(head == null){
            head = tail = newNode;
            return;
        }    
        //step 2 -> newNode's next = head
        newNode.next = head;    //assigning the previous first node to the newNode's next
        //step 3 -> head = newNode
        head = newNode;
        size++;
    }
    
    public void addLast(int data){
        //step 1 -> Create new Node
        Node newNode = new Node(data);
        //edge case where there is no node 
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step 2 -> tail.next = newNode
        tail.next = newNode;    //previous of the newNode which was the previous tail
        //step 3 -> tail = newNode
        tail = newNode;
        size++;
    }

    public void printLinkedList(){
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }
        Node tempNode = head;
        while(tempNode != null){
            System.out.print(tempNode.data + "->");
            tempNode = tempNode.next;
        }
        System.out.println("null");
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev :: i = size - 2;
        Node tempNode = head;
        for(int i = 0; i < size - 2;i++){
            tempNode = tempNode.next;
        }
        int val = tempNode.next.data; // or tail.data
        tempNode.next = null;
        tail = tempNode;
        size--;
        return val;
    } 
    //slow fast approach
    public Node findMiddle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow; //Slow is my mid node
    }
    public static void removeCycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(!cycle){
            return;
        }
        //find meeting point
        slow = head;
        Node prev = null;
        while(slow != fast){
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }
        //remove cycle -> last.nex = null
        prev.next = null;
    }
    public static boolean isCycle(){ //Floyd's cycle finding algorithm
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        // LinkedList ll = new LinkedList();
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        //1->2-->3->1
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}