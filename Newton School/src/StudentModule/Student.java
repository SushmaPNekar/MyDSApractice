package StudentModule;

import java.util.Objects;

public class Student implements Comparable {
    private String name;
    private int age;
    private String Course;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        Course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(Course, student.Course);
    }




    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;
        if (this.getAge() > s.getAge()){
            return 0;
        }else{
            return 1;
        } //916360024036

    }
}