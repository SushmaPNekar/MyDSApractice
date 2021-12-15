package Collections.LinkedListProblems.ProblemsOnDoublyLL;

public class ReverseDLL {

    public static void main(String[] args) {
        Node head = null;
        head = addElements(head,1);

        head = addElements(head,2);

        head = addElements(head,3);
        head = addElements(head,4);
        head = addElements(head,5);
        head = addElements(head,6);
        head = addElements(head,7);
        head = addElements(head,8);
        head = addElements(head,9);


        head = reverseEl(head);
        printEl(head);

          //  1 2 3 4
    }

    public static void printEl(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
    public static Node reverseEl(Node head){
        Node temp = null;
        Node curr = head;

        while(curr != null){
            Node oldPrev = curr.prev;
            Node oldNext = curr.next;
            curr.next = oldPrev;
            curr.prev = oldNext;
            temp = curr;
            curr = oldNext;
        }
        head = temp;
        return head;
    }

    public static Node addElements(Node head , int val){
        if(head == null){
            head = new Node(val);
            return head;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = new Node(val);
        temp.next.prev = temp;
        return head;
    }


    public static class Node{
        private Node next;
        private Node prev;
        private int val;

        Node(int val){
            this.val = val;
        }
    }
}
