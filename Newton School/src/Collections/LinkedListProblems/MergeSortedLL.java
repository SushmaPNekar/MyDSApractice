package Collections.LinkedListProblems;

public class MergeSortedLL {
    public static void main(String[] args) {

        Node head1 ;
        Node head2;
        head1 = new Node(0);
        head1.next = new Node(3);
        head1.next.next = new Node(6);
        head1.next.next.next = new Node(8);

        head2 = new Node(1);
        head2.next  = new Node(2);
        head2.next.next = new Node(7);
        head2.next.next.next    = new Node(10);

        head1 = merge(head1,head2);
        printEl(head1);

       // Node head = Merge(head1,head2);
    }


    private static void printEl(Node head){
        while (head != null){
            System.out.print(head.val+" ");
            head = head.next;
        }
    }

    private static Node merge(Node head1,Node head2){
        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }

        if(head1.val < head2.val){
            return mergeList(head1,head2);
        }else{
            return mergeList(head2,head1);
        }
    }

    private static Node mergeList(Node head1,Node head2){
        Node curr1 = head1, next1 = head1.next;
        Node curr2 = head2, next2 = head2.next;

        while(curr2 != null){
            if(curr2.val >= curr1.val && curr2.val <= next1.val){
                next2 = curr2.next;
                curr1.next = curr2;
                curr2.next = next1;
                curr1 = curr2;
                curr2 = next2;

               // curr1 = curr1.next;
            }      //  0 3 6 8
                  //   1 2 7 10
            else{
                if(next1.next != null){
                    curr1 = curr1.next;
                    next1 = next1.next;
                }
                else {
                    next1.next = curr2;
                    return head1;
                }

            }

        } //0 1 2 3 6 7 8 10
        return head1;


    }


 static  class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
}
