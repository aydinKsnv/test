package com.example.students;

import com.example.students.models.Students;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Students> students = new ArrayList<>();
        students.add(new Students("qwerty", "q1", 1, 5 ));
        students.add(new Students("asdf", "k9", 1, 2 ));
        students.add(new Students("ytquewio", "nd0", 1, 2 ));
        students.add(new Students("qewds", "s3", 4, 3 ));
        students.add(new Students("qwesa", "i9", 4, 4 ));
        students.add(new Students("vbc", "p9", 3, 5 ));
        students.add(new Students("adsfg", "h77", 2, 1 ));
        students.add(new Students("asd", "1", 1, 2 ));
        students.add(new Students(";lo", "q1", 2, 3 ));
        students.add(new Students("jhg", "09", 4, 2 ));


        removeStudent(students);
        nextCourse(students);
        printStudents(students, 3);

    }

    public static void removeStudent(ArrayList<Students> students){
        students.removeIf(student -> student.getAverageGrade() < 3);
    }

    public static void nextCourse(ArrayList<Students> students){
        for (Students student : students) {
            if (student.getAverageGrade() >= 3){
                student.setCourse(student.getCourse() + 1);
            }
        }
    }
    public static void printStudents (List<Students> students, int course){
        for (Students student : students){
            if (student.getCourse() == course){
                System.out.println(student.getName());
            }
        }
    }

}
