package MockInterview;

public class FindingMiddle {
    public static void main(String[] args) {
        Node head = null;
        Node head2 = null;
        // 1,4,6,7,10,15
        // 2,3,9,16,20,21

        head = addEl(head,1);
        head = addEl(head,4);
        head = addEl(head,6);
        head = addEl(head,7);
        head = addEl(head,10);
        head = addEl(head,15);
        print(head);
        head2 = addEl(head2,2);
        head2 = addEl(head2,3);
        head2 = addEl(head2,9);
        head2 = addEl(head2,16);
        head2 = addEl(head2,20);
        head2 = addEl(head2,21);
        print(head2);
       head = finding(head,head2);
        //head = reverse(head);
       print(head);
       // Node mid = findMid(head);
        //System.out.println(mid.val);

    }

    private static Node finding(Node h1,Node h2){
        if(h1.val < h2.val){
            return merge(h1,h2);
        }else{
           return merge(h2,h1);
        }

    }

    private static Node merge(Node h1,Node h2 ){
        Node curr1 = h1,next1 = h1.next;
        Node curr2 = h2,next2 = h2.next;

        while(curr2 != null ){
            if(curr2.val >= curr1.val && curr2.val <= next1.val){
                next2 = curr2.next;
                curr1.next = curr2;
                curr2.next = next1;

               curr1 = curr2;
                curr2 = next2;
            }
            else{
                if(next1.next == null){
                    next1.next = curr2;
                    return h1;
                }
                else{
                    next1 = next1.next;
                    curr1= curr1.next;
                }
            }
        }

        return h1;

    }
    private static void print(Node head){
        while (head != null){
            System.out.print(head.val+ " ");
            head = head.next;
        }
        System.out.println();
    }
    private static Node reverse(Node head){
        Node pre = null;
        Node next = null;
        Node curr = head;

        while(curr != null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;

        }
        return pre;
    }

    private static Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && slow != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static Node addEl(Node head, int  val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return head;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public static class Node{
        private Node next;
        private int val;

        Node(int val){
            this.val = val;
            this.next =null;
        }
    }
}
