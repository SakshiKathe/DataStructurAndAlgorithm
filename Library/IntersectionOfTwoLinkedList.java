package Library;

public class IntersectionOfTwoLinkedList {
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

    static Node intersect(Node l1, Node l2){
        if(l1 == null || l2 == null) return null;

        Node p1 = l1, p2 = l2;

        while(p1 != p2){
            p1 = p1 == null ? l2 : p1.next;
            p2 = p2 == null ? l1 : p2.next;
        }

        return p1;
    }
    public static void main(String[] args) {
        IntersectionOfTwoLinkedList list = new IntersectionOfTwoLinkedList();
        
        Node head1, head2;
        head1 = new Node(1);
        head2 = new Node(5);

        Node newNode = new Node(2);
        head2.next = newNode;

        newNode = new Node(3);
        head2.next.next = newNode;

        newNode = new Node(4);
        head1.next = newNode;

        newNode = new Node(3);
        head1.next.next = newNode;
        head2.next.next.next = newNode;

        newNode = new Node(4);
        head1.next.next.next = newNode;

        head1.next.next.next.next = null;

    }
}
