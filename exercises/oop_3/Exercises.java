package exercise.javaoop.exercises.oop_3;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        // Write and use your 5 getters and setters!
        Student student = new Student();

        student.setName("Francesco");
        student.setSurname("Rossi");
        student.setAge(19);
        student.setYearOfBirth(2014);
        student.setAverageEvaluation(8.5);

        System.out.println(student.getName());
        System.out.println(student.getSurname());
        System.out.println(student.getAge());
        System.out.println(student.getYearOfBirth());
        System.out.println(student.getAverageEvaluation());
        System.out.println(student);


    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        //Write your code here
        Student student1 = new Student();

        student1.setName("Giovanni");
        student1.setSurname("Verdi");
        student1.setAge(-5);
        student1.setYearOfBirth(2018);
        student1.setAverageEvaluation(10.5);

        // creazione del counter
        System.out.println(student1.getName());
        System.out.println(student1.getName());
        System.out.println(student1.getName());
        System.out.println(student1.getName());
        System.out.println("--------------------------------------------");

        student1.getAge();// non riesco a capire perchè non mi stampa la condizione inserita nel set. se lo metto in un sout mi stampa solo il valore (null). se lo esco dal
                            // sout non stampa niente anche se dovrebbe uscire "Sorry, you can't inscribe in our school". perchè?
        System.out.println(student1.getAverageEvaluation());// fatto così mi esce solo il valore null.

        System.out.println(student1);
    }

}
