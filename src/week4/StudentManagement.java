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
// Create 

    public void createStudent(Student student) {
        studentList.add(student);

    }
// Show Student

    public void showStudent() {
        for (Student student : studentList) {
            System.out.println(student.toString());
            
        }

    }
//Find Student

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
// Hàm Sort 

    public void sortStudent() {
        System.out.println("After sort :");
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.studentName.compareTo(s2.studentName);  // Sắp xếp theo tên
            }

        });
    }
// Hàm delete

    public void deleteStudent(String id) {
        boolean removed = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).studentID.equalsIgnoreCase(id)) {
                studentList.remove(i);
                System.out.println("Student with ID " + id + " has been deleted.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
// Hàm update

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
// Hàm Report

    public void reportStudent() {
        System.out.println("Student Report:");
        ArrayList<String> printed = new ArrayList<>();

        for (Student s1 : studentList) {
            int count = 0;
            for (Student s2 : studentList) {
                if (s1.studentName.equalsIgnoreCase(s2.studentName)
                        && s1.courseName.equalsIgnoreCase(s2.courseName)) {
                    count++;
                }
            }
            String key = s1.studentName + "-" + s1.courseName;
            if (!printed.contains(key)) {
                System.out.println(s1.studentName + " | " + s1.courseName + " | " + count);
                printed.add(key);
            }
        }

    }

}
