/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author HUNG
 */
public class StudentManagement {

    Scanner sc = new Scanner(System.in);

    ArrayList<Student> studentList = new ArrayList<>();

    public void createStudent(Student student) {
        studentList.add(student);

    }

    public void showStudent() {
        for (Student student : studentList) {
            System.out.println(student.toString());
        }

    }

    public void findStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID to search: ");
        String inputID = scanner.nextLine();

        boolean found = false;
        for (Student s : studentList) {
            if (s.studentID.equalsIgnoreCase(inputID)) {
                System.out.println("Student found: " + s);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with ID " + inputID + " not found.");
        }
    }

    public void sortStudent() {
        System.out.println("After sort :");
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.studentName.compareTo(s2.studentName);  // Sắp xếp theo tên
            }

        });
    }

    public void deleteStudent(String id) {
    }

    public void updateStudent() {
        System.out.println("Input ID you want to find : ");
        String studentID = sc.nextLine();
        Student found = null;
        for (Student s : studentList) {
            if (s.studentID.equals(studentID)) {
                found = s;
                break;
            }
        }
        if (found == null) {
            System.out.println("Student not found.");
        }
        System.out.println("Input new ID :");
        found.studentID = sc.nextLine();
        System.out.println("Input new name : ");
        found.studentName = sc.nextLine();
        System.out.println("Input new semester : ");
        found.semester = sc.nextLine();
        System.out.println("Input new course name : ");
        found.courseName = sc.nextLine();
        System.out.println("Student information updated successfully.");
        System.out.println("Update student" + found);
    }

    public void reportStudent() {
    }

}
