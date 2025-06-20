/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week4;

import java.util.Scanner;

/**
 *
 * @author HUNG
 */
public class Student {

    String studentID;
    String studentName;
    String semester;
    String courseName;

    public Student(String studentID, String studentName, String semester, String courseName) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.semester = semester;
        this.courseName = courseName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "students{" + "studentID=" + studentID + ", studentName=" + studentName + ", semester=" + semester + ", courseName=" + courseName + '}';
    }

    Student() {
    }
  
}
