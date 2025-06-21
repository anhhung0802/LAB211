/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author HUNG
 */
public class Test {

    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
//        Student s = new Student("DE170415", "NguyenVanAnhHung ", " 2 ", " Java ");
//        studentManagement.createStudent(s);
//        studentManagement.showStudent();
        

        //Test find
        Student s2 = new Student("DE9999", "Kochiniwa", "3", "C++");
        studentManagement.createStudent(s2);
        studentManagement.showStudent();
        studentManagement.findStudent();
        

//        //Test update student       
//        studentManagement.studentList.add(new Student("DE8899", "Chihuahua", "1", "C++"));
//        studentManagement.studentList.add(new Student("DE5678", "BigPull", "3", "PHP"));
//        studentManagement.studentList.add(new Student("DE1234", "Corgi", "4", "C#/C++"));
//        studentManagement.showStudent();
//        studentManagement.updateStudent();
        
//        //Test Hàm Sort
//        Student s3 = new Student("DE8888" ,"japan" , "1", "Java" );
//        studentManagement.createStudent(s3);
//        studentManagement.showStudent();
//        studentManagement.sortStudent();
//       
        
        
    }
}
