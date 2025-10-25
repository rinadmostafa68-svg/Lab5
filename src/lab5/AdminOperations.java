/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5.pkg2;

/**
 *
 * @author msi
 */
public abstract class AdminOperations extends DataBase{

    public AdminOperations(String fileName) {
        super(fileName);
    }
   public boolean  AddStudent(Student s)
   { 
       if(!contains(s.getStudentID())){
     record.add(s);
     return true;}
     else return false;
   }
   public Student SearchStudent(int id)
   {
     for(int i=0;i<record.size();i++)
     {
         if(contains(id))
             return record.get(i);
     }
     return null;
   }
   public boolean DeleteStudent(int id)
   {
      for(int i=0;i<record.size();i++){
          if(contains(id)){
              record.remove(i);
      return true;}}
      return false;
   }
   public boolean UpdateStudent(int id, String name, int Age,String Gender, String Dep,double gpa)
   {
       if(contains( id)){
       Student s= SearchStudent(id);
       s.setName(name);
       s.setAge(Age);
       s.setGender(Gender);
       s.setDepartment(Dep);
       s.setGpa(gpa);
       return true;
       }
       return false;
       
   }
   
}
