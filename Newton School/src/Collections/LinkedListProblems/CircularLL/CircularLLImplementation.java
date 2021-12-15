package Collections.LinkedListProblems.CircularLL;

public class CircularLLImplementation {

    public static void main(String[] args) {
       Node last = null;
       Node head ;
       last = addEl(last,1);
       head = last;
     //  printEL(last);
        last = addEl(last,2);
        last = addEl(last,3);
        last = addEl(last,4);
        last = addEl(last,5);
        printEL(last);
        last = reverse(head);
        printFromHead(last);
  //      System.out.println(last.next.val);

    }
    static void printEL(Node last){
        Node p = last.next;
        do{
            System.out.print(p.val+" ");
            p = p.next;
        }while(p != last.next);
        System.out.println( " ");
    }
    private static void printFromHead(Node head){
        Node temp = head;
        do{
            System.out.print(temp.val + " ");
            temp=temp.next;
        }while(temp != head);
        System.out.println();
    }

    static Node reverse(Node head){
        Node pre = null;
        Node curr = head;
        Node next = null;


        do{
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;

        }while(curr !=head);

        head.next = pre;
        head = pre;
        return head;
    }

    static Node addEl(Node last,int val){
        Node newNode = new Node();
        newNode.val = val;
        if(last == null){
            last = newNode;
            last.next = last;
        }
        Node head = last.next;
        last.next = newNode;
        newNode.next = head;
        last = newNode;
        return last;
    }

    static class Node{
        Node next;
        int val;
    }
}
