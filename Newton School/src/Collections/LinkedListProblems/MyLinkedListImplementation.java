package Collections.LinkedListProblems;

public class MyLinkedListImplementation {

    // Node head;

    public static void main(String[] args) {
       MyLinkedListImplementation myList = new MyLinkedListImplementation();
        Node head;
        head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        head.nextNode = second;
        head.nextNode.nextNode = third;
        myList.printList(head);
    }

    public static class Node{
        int value;
        Node nextNode;

        public Node(int value) {
            this.value = value;
            this.nextNode = null;
        }



    }
    public void printList( Node head){
        Node n = head;

        while(n != null){
            System.out.println("Data : " + n.value);
            n = n.nextNode;
        }
    }

}
