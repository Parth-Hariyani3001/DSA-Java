public class MergeSort{
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

    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //mid node
    }

    public Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }
    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        //find mid
        Node mid = getMid(head);
        //left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        //merge
        return merge(newLeft, newRight);
    }
    public static void main(String args[]){
        MergeSort ll = new MergeSort();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.printLinkedList();

        ll.head = ll.mergeSort(ll.head);
        ll.printLinkedList();
    }
}