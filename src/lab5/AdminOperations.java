/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author msi
 */
public abstract class AdminOperations extends DataBase{

    public AdminOperations(String fileName) {
        super(fileName);
    }
   public Student AddStudent(String Line)
   {  
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
   public void DeleteStudent(int id)
   {
      for(int i=0;i<record.size();i++)
          if(contains(id))
              record.remove(i);
   }
   public void UpdateStudent()
   {
       
   }
   
}
