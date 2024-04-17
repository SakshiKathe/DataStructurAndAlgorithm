package Library;

//Merge Two sorted Linked list

public class MergedTwoSortedList {
    public static Node head;
    public static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

  public static Node mergeTwoLists(Node list1, Node list2){

    if(list1 != null && list2 != null){
        if(list1.val <= list2.val){
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }else{
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
    if(list1 == null)
        return list2;
    else
        return list1;
  }
    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(4);
        //1->2->4

        Node head2 = new Node(1);
        head2.next = new Node(3);
        head2.next.next = new Node(4);
        //1->3->4

        // Node mergNode = merge(head1, head2);

        // //printList(mergNode);
        
    }
}
