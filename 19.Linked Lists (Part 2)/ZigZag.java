public class ZigZag {
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
    
    public void zigZag(){
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        
        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //alternate merge(zigzag merge)
        Node left = head;
        Node right = prev;
        Node nextL,nextR;

        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }
    public static void main(String args[]){
        ZigZag ll = new ZigZag();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.printLinkedList();
        //1->2->3->4->5

        ll.zigZag();
        ll.printLinkedList();
    }
}
