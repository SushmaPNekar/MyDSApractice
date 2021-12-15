package Collections.Queue;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class MyQueue<T> implements Iterable<T> {
        private Node<T> head;
        private Node<T> tail;
        private int size;

    public MyQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return size ==0;
    }

    public void enqueue(T value){
        Node<T> oldTail= this.tail;
        this.tail = new Node();
        this.tail.setValue(value);
        this.tail.setNextNode(null);

        if(isEmpty()){
            this.head = this.tail;

        }else{
            oldTail.setNextNode(this.tail);
        }

        size++;
    }

    public T dequeue(){
        if(isEmpty()){
            return null;
        }
        T value = this.head.getValue();
        Node<T> oldHead = this.head;
        Node<T> newHead = oldHead.getNextNode();
        this.head = newHead;
        oldHead = null;
        size--;
        return value;

    }

    public T peek(){
        if(isEmpty()){
            return  null;
        }

        T val = this.head.getValue();
        return val;
    }

    public int getSize() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new myQueueIterator(this.head);
    }

    private class myQueueIterator<T> implements Iterator<T>{
        private Node<T> current;

        public myQueueIterator(Node<T> head){
            this.current = head;
        }

        @Override
        public boolean hasNext() {
            return this.current != null;
        }

        @Override
        public T next() {
            if(! hasNext()){
                return null;
            }
            T val = this.current.getValue();
            this.current = this.current.getNextNode();
            return val;
        }
    }


    private class Node<T>{
        private T value;
        private Node<T> nextNode;

        public T getValue(){
            return value;
        }
        public void setValue(T value){
            this.value = value;
        }
        public Node<T> getNextNode(){
            return nextNode;
        }

        public void setNextNode(Node<T> nextNode){
            this.nextNode = nextNode;
        }
    }
}
