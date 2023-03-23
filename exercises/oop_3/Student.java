package exercise.javaoop.exercises.oop_3;

import java.time.LocalDate;

public class Student {

    private String name = null;
    private String surname = null;
    private Integer age = null;
    private Integer yearOfBirth = null;
    private Double averageEvaluation = null;

    private Integer numberOfMonthsInSchool = 0;

    private Integer maximumAge = 35;

    LocalDate date = LocalDate.now();

    public Student(){}


    void setName (String name){
        this.name = name;
    }
    void setSurname (String surname){
        this.surname = surname;
    }
    void setAge (Integer age){
        this.age = age;

    }

    void setYearOfBirth (Integer yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }
    void setAverageEvaluation (Double averageEvaluation){
        this.averageEvaluation = averageEvaluation;

    }
    String getName(){
        System.out.println("Month n: " + numbersOfMonths());
        return this.name;
    }
    String getSurname(){
        return this.surname;
    }
    Integer getAge(){
        // primi 2 constrains
        if (age > maximumAge || age<0){
            System.out.println("Sorry, you can't inscribe in our school");
            age = null;
        } else {
            age = age;
        }
        return this.age;
    }
    Integer getYearOfBirth(){
        return this.yearOfBirth;
    }
    Double getAverageEvaluation(){
        // 3 constrain
        if (averageEvaluation > 10){
            System.out.println("Sorry, there is an error in your average.");
        }else {
            averageEvaluation = averageEvaluation;
        }
        return this.averageEvaluation;
    }
    Integer numbersOfMonths(){
        numberOfMonthsInSchool++;
        return numberOfMonthsInSchool;
    }
    // è un esempio molto stupido ma non sapevo cosa mettere come counter e farlo funzionare in questo caso
    //lo ho aggiunto al nome perchè, secondo il mio ragionamento, lo richiamiamo una volta al mese per vedere a che mese è arrivato nel corso. l'unica cosa che mi è venuta in mente





    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", yearOfBirth=" + yearOfBirth +
                ", averageEvaluation=" + averageEvaluation +
                '}';
    }
}
