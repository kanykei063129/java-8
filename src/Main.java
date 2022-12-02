import java8.classes.Student;
import java8.enums.Gender;
import java8.service.StudentServicesImpl;
import java8.service.myException;

import java.time.LocalDate;
import java.util.*;

public class Main {

    public static  void main(String[] args) throws Exception {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        Student student1 = new Student("Kanykei",16,Gender.F,  LocalDate.of(2006,03,19));
        Student student2 = new Student("Adil",18,Gender.M,  LocalDate.of(2004,02,17));
        Student student3 = new Student("Erlan",21,Gender.M,  LocalDate.of(2001,9,11));
        Student student4 = new Student("Madina",16,Gender.F,  LocalDate.of(2006,10,31));
        Student student5 = new Student("Zarina",27,Gender.F,  LocalDate.of(1995,07,11));
        Student student6 = new Student("Kutman",18,Gender.M,  LocalDate.of(2004,06,11));
        Student student7 = new Student("Nuriza",17,Gender.F,  LocalDate.of(2005,03,21));
        Student student8 = new Student("Adilet",22,Gender.M,  LocalDate.of(2000,8,3));
        Student student9 = new Student("Osmon",18,Gender.M,  LocalDate.of(2004,04,25));
        Student student10 = new Student("Aiperi",27,Gender.F,  LocalDate.of(1995,12,30));
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        StudentServicesImpl studentServices = new StudentServicesImpl();
        Scanner scanner = new Scanner(System.in);



            System.out.println("""
                1===findByName
                2===getFamelle
                3===getMale""");
            int num = 0;
            try {
                num = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("1-3 san jaz");
        }

        switch (num) {
            case 1:
                System.out.print("name  ");
                String n = scanner.nextLine();
                String name = scanner.nextLine();
                if (studentServices.findByName(name, students) == null) {
                    System.out.println("tura jaz");
                } else {
                    System.out.println(studentServices.findByName(name, students));
                }


                break;
            case 2:
                System.out.println(studentServices.getFamele(students));
                break;
            case 3:
                System.out.println(studentServices.getMele(students));
                break;
            default:
                System.out.println("tura jaz");
        }











    }catch (myException r){
        System.out.println("не проавильно заполнил обьект!");
    }


}



