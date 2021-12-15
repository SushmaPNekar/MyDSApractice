package Collections.LinkedListProblems;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T>{
    private Node<T> first;
    private Node<T> last;
    private int size;

    public MyLinkedList() {
        first = null;
        last = null;
        size= 0;
    }

    private boolean isEmpty(){
        return size == 0;
    }

    public void add(T value){
        if(first == null){
            first = new Node();
            first.setValue(value);
            last = first;
        }
        else{
            Node oldNode = last;
            last = new Node();
            last.setValue(value);
            oldNode.setNextNode(last);
        }
        size++;
    }
    public void remove(){
        if(first != null){
            Node oldFirst = first;
            first = first.getNextNode();
            oldFirst = null;
            size--;

        }
    }


    public T getFirst() {
        if(first != null){
            return first.getValue();
        }
        return null;
    }

    public void setFirst(T firstValue) {
        if(first != null){
            first.setValue(firstValue);

        }else{
            first = new Node();
            first.setValue(firstValue);
            last = first;
            size++;
        }

    }

    public T  getLast() {
        if(last != null){
            return last.getValue();
        }
        return null;
    }

    public void setLast(T lastVAlue) {
        if(last != null){
            last.setValue(lastVAlue);
        }else{
            last = new Node();
            last.setValue(lastVAlue);
            first =last;
            size++;
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private  class MyLinkedListIteraror implements Iterator<T> {
        private Node<T> current = first;


        @Override
        public boolean hasNext() {

            return current == null;
        }

        @Override
        public T next() {
            if(!hasNext()){
                return  null;
            }
            T value = current.getValue();
            current = current.getNextNode();
            return value;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new MyLinkedListIteraror();
    }


    private class Node<T>{
        private Node nextNode;
        private T value;

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }
}
