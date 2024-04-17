package Library;
public class PartitionList {
    static Node head1, head2;
    static class Node{
        int val;
        Node next;
        public Node head1;
        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static Node newNode(int key){
        Node temp = new Node(key);
        temp.val = key;
        temp.next = null;
        return temp;
    }

    static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

    static Node parition(Node head, int x){
        Node before_head = newNode(0); //dummy node
        Node before = before_head;
        Node after_head = newNode(0);
        Node after = after_head;

        while(head != null){
            if(head.val < x){
                before.next = head;
                before = before.next;
            } else{
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }

        //merge
        after.next = null;
        before.next = after_head.next;

        return before_head.next;
    }
    public static void main(String[] args) {
        Node head = newNode(1);
        head.next = newNode(4);
        head.next.next = newNode(3);
        head.next.next.next = newNode(2);
        head.next.next.next.next = newNode(5);
        head.next.next.next.next.next = newNode(2);
        //1->4->3->2->5->2 linkedlist created

        int x = 3;
        head = parition(head, x);
        printList(head);
    }
}
