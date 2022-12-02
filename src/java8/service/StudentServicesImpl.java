package java8.service;

import java8.classes.Student;
import java8.enums.Gender;
import jdk.internal.icu.text.UnicodeSet;

import java.util.ArrayList;

public class StudentServicesImpl implements StudentService {
    @Override
    public Student findByName(String name, ArrayList<Student> students) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Student> getFamele(ArrayList<Student> students) {
        ArrayList<Student> studentFamele = new ArrayList<>();
        for (Student student : students) {
            if (student.getGender().equals(Gender.F)) {
                studentFamele.add(student);
            }
        }
        return studentFamele;
    }

    @Override
    public ArrayList<Student> getMele(ArrayList<Student> students) {
        ArrayList<Student> studentF = new ArrayList<>();
        for (Student student : students) {
            if (student.getGender().equals(Gender.M)) {
                studentF.add(student);
            }
        }
        return studentF;
    }
}
