/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.Scanner;

/**
 *
 * @author HUNG
 */
public class Test {

    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();
        Student s = new Student("DE170415", "NguyenVanAnhHung ", " 2 ", " Java ");
        sm.createStudent(s);
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT MENU =====");
            System.out.println("1. Create new student");
            System.out.println("2. Show all students");
            System.out.println("3. Find student by ID");
            System.out.println("4. Sort students by name");
            System.out.println("5. Delete student by ID");
            System.out.println("6. Update student by ID");
            System.out.println("7. Report student");
            System.out.println("0. Exit");
            System.out.print("Please choose an option: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter student ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter semester: ");
                    String semester = sc.nextLine();
                    System.out.print("Enter course name: ");
                    String course = sc.nextLine();
                    Student newStudent = new Student(id, name, semester, course);
                    sm.createStudent(newStudent);
                    break;
                case 2:
                    sm.showStudent();
                    break;
                case 3:
                    sm.findStudent();
                    break;
                case 4:
                    sm.sortStudent();
                    sm.showStudent();
                    break;
                case 5:
                    System.out.print("Enter ID of student to delete: ");
                    String delID = sc.nextLine();
                    sm.deleteStudent(delID);
                    break;
                case 6:
                    sm.updateStudent();
                    break;
                case 7:
                    sm.reportStudent();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice, please select again.");
            }

        } while (choice != 0);

        sc.close();
    }   

    }

