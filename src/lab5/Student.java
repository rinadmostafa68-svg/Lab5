/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author msi
 */
public class Student{
    private int StudentID; 
    private String Name;
    private int Age;
    private String Gender;
    private String Department;
    private  double gpa;      

    public Student(int StudentID, String Name, int Age, String Gender, String Department, double gpa) {
        this.StudentID = StudentID;
        this.Name = Name;
        this.Age = Age;
        this.Gender = Gender;
        this.Department = Department;
        this.gpa = gpa;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public String tostString()
    {
      return StudentID+","+Name+","+Age+","+Gender+","+Department+","+gpa;
    }
}
