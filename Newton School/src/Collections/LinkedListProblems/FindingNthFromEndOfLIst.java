package Collections.LinkedListProblems;

public class FindingNthFromEndOfLIst {
    public static void main(String[] args) {
        Node head = null;
        head = add(head,1);
        head = add(head,2);
        head = add(head,3);
        head = add(head,4);
        head = add(head,5);
        head = add(head,6);
        head = add(head,7);
        System.out.println(findingNth(head,7));
    }

    private static int findingNth(Node head, int k){
        Node slow = head,fast = head;
        int count = 1;
 // 1 2 3

        while(count < k){
            fast = fast.next;
            count ++;
            if(fast == null){
                return -1;
            }
        }


        while(fast != null && fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        if(slow != null){
            return slow.val;
        }return -1;

    }

    public static Node add(Node head, int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return head;
        }

        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;

    }

    public static class Node{
        private Node next;
        private int val;

        Node(int val) {
            this.val = val;
            this.next = null;
           
        }
    }
}
