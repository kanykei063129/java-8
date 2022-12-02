package java8.classes;

import java8.enums.Gender;
import java8.service.StudentService;
import java8.service.myException;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student implements StudentService {
    private final LocalDate dateOfbirth;
    private String name;
    private int age;
    private Gender gender;
    private LocalDate dataOfBirth;

    public Student(String name, int age, Gender gender, LocalDate dateOfbirth) throws myException {
        if(name.matches("[a-zA-Za-яA-Я]*")){
            this.name = name;
        }else {
            this.name="error";
        }
        if (age<120){
            if(age>0){
                this.age = age;
            }else {
                this.age=0;
            }
        }else {
            this.age=0;
        }

        this.gender = gender;
        LocalDate localDate1 = LocalDate.now();
        int localDate = dateOfbirth.compareTo(localDate1);
        if(localDate==0){
            throw new myException("rovno localdate");
        } else if (localDate<0) {
            this.dateOfbirth=dateOfbirth;
        }else {
            throw new myException("rovno localdate");
        }

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getDateOfbirth() {
        return dateOfbirth;
    }

    @Override
    public String toString() {
        String dateOfbirth = null;
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfbirth=" + dateOfbirth +
                '}';
    }

    @Override
    public Student findByName(String name, ArrayList<Student> students) {
        return null;
    }

    @Override
    public ArrayList<Student> getFamele(ArrayList<Student> students) {
        return null;
    }

    @Override
    public ArrayList<Student> getMele(ArrayList<Student> students) {
        return null;
    }
}

