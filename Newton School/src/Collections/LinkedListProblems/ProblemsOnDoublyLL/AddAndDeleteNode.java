package Collections.LinkedListProblems.ProblemsOnDoublyLL;

public class AddAndDeleteNode {
    public static void main(String[] args) {
        Node head  = null;
        head = addElAtLast(head,1);
        head = addElAtLast(head,2);
        head = addElAtLast(head,3);
        head = addElAtLast(head,4);
        //head = deleteKthNode(head,0);
        head = deleteByVal(head,3);
        printEL(head);

    }
    private static Node deleteByVal(Node head, int val){
        if(head == null){
            return null;
        }
        Node temp = head;
        if(val == head.val){
            Node newNode = head.next;
            head = newNode;
            return head;
        }
        while(temp != null){
            if(temp.val == val){
                Node preNode = temp.prev;
                Node nextNode = temp.next;
                if(preNode != null)
                 preNode.next = nextNode;
                if(nextNode != null){
                    nextNode.prev = preNode;
                }
            }
            temp = temp.next;
        }
        return head;

    }
    private static Node deleteKthNode(Node head, int k){
        Node temp = head;
        if(head == null){
            return null;
        }
       // int len= 1;
        int index = 0;
        if(k == 0){
            Node temp1 = head;
            Node newHead = temp1.next;
            head = newHead;
            return head;
        }
        while(index < k-1){      //  1 -> 2 -> 3 -> 4
            temp = temp.next;
            index ++;

        }
        Node toDelete  = temp.next;
        temp.next = toDelete.next;
        if(toDelete.next != null){
            toDelete.next.prev = temp;
        }
        return head;
    }

    private static void printEL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public static Node addElAtLast(Node head, int val){
        if(head == null){
            Node newNode = new Node(val);
            head = newNode;
            head.next = null;
            return head;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node newNode = new Node(val);
        Node preNode = temp;
        preNode.next = newNode;
        newNode.next = null;
        newNode.prev = preNode;
        return head;
    }

    public static class Node{
        private Node next;
        private Node prev;
        private int val;

        public Node(int val){
            this.val = val;
            this.next = null;
            this.prev= null;
        }
    }
}
