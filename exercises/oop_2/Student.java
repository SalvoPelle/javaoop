package exercise.javaoop.exercises.oop_2;

public class Student {

    String name = null;

    Integer age = null;
    public Student(String name, Integer age){
        this.name = name;
        this.age = age;
        System.out.println("Constructing");
        System.out.println("Student name is: " + name + ", he/she is " + age + " years old.");
        System.out.println("Constructed");
    }
    public Student(Integer age){

        this.age = age;
        System.out.println("Constructing");
        System.out.println("He/She is " + age + " years old.");
        System.out.println("Constructed");
    }
    public Student(String name){
        this.name = name;

        System.out.println("Constructing");
        System.out.println("Student name is: " + name);
        System.out.println("Constructed");
    }
    public Student(){

        System.out.println("Constructing");
        System.out.println("Constructed");
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}
