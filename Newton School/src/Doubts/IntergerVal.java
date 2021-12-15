package Doubts;

public class IntergerVal {
    float i = ((4+1) / 2.0f); // floating Point division.
    float j = (4+1) / 2;   //But the operands and hence the operation itself is integer . It performs integer division

    public static void main(String[] args) {
        IntergerVal intVal = new IntergerVal();
        System.out.println(intVal.i);
        System.out.println(intVal.j);
    }

}
