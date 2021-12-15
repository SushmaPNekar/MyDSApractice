package StudentModule;

public class MainClass {
    public static void main(String[] args) {
        Student s1 = new Student("Sush", 22, ".net");
        Student s2 = new Student("Sush", 23, ".net");
        // System.out.println("hii");
        //System.out.println(s1.name);
        System.out.println(s1.equals(s2));

    }
}
