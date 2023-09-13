public class linkedList{
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

    public void addInMiddle(int idx,int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        int i = 0;
        Node tempNode = head;
        while(i < idx-1){
            tempNode = tempNode.next;
            i++;
        }
        //i -> idx-1
        Node newNode = new Node(data);
        newNode.next = tempNode.next;
        tempNode.next = newNode;
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

    public int interativeSearch(int key){
        int i = 0;
        Node tempNode = head;
        while(tempNode != null){
            if(tempNode.data == key){
                return i;
            } else {
                i++;
                tempNode = tempNode.next;
            }
        }
        return -1;
    }
    public int helper(Node head,int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recursiveSearch(int key){
        return helper(head,key);
    }

    public void reverseLinkedList(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthFromEnd(int n){
        //calculate size
        int size = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }

        if(n == size){
            head = head.next; //remove first operation
            return;
        }

        //size - n
        int i = 1;
        int iToFind = size - n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
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

    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //Step 1 - find mid
        Node midNode = findMiddle(head);

        //step 2 - revverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
             next = curr.next;
             curr.next = prev;
             prev = curr;
             curr = next;
        }

        Node right = prev; //right half head
        Node left = head; //left half head

        //step3 - check left half & right half
        while(right!= null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String args[]){
        linkedList ll = new linkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(1);
        ll.addLast(3);
        // ll.addLast(2);
        // ll.addInMiddle(2, 3);
        ll.printLinkedList();
        System.out.println(ll.size);
        // ll.removeFirst();
        // ll.printLinkedList();

        // ll.removeFirst();
        // ll.printLinkedList();

        // ll.removeLast();
        // ll.printLinkedList();

        //System.out.println(ll.interativeSearch(5));
        //ll.reverseLinkedList();
        //ll.printLinkedList();

        // ll.deleteNthFromEnd(3);
        ll.printLinkedList();
        System.out.println(ll.checkPalindrome());
    }
}