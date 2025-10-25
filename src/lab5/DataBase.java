/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lab5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author msi
 */
public abstract class DataBase {
    ArrayList<Student> record =new ArrayList<>();
    private String fileName;

    public DataBase(String fileName) {
        this.fileName = fileName;
    }
    
    public void ReadFromFile() throws FileNotFoundException
    {
      File f = new File(fileName);
        Scanner s = new Scanner(f);
        while (s.hasNextLine()) {
            String line = s.nextLine();
            String[] tokens = line.split(",");
            int id = Integer.parseInt(tokens[0]);
            String name = tokens[1];
            int Age = Integer.parseInt(tokens[2]);
            String gender=tokens[3];
            String Dep=tokens[4];
            double gpa=Double.parseDouble(tokens[5]);
            record.add(new Student(id,name,Age,gender,Dep,gpa));
            
        } 

    }
    public void SaveToFile(){
     try (FileWriter writer = new FileWriter(this.fileName, false)){
            for (int i = 0; i < this.record.size(); i++){
                writer.write(record.get(i)+"\n");
            }
            System.out.println("File overwritten successfully!");
        }
        catch (IOException e){
            System.out.println("Error writing to file!");
            e.printStackTrace();
        }
    }
    public ArrayList<Student> getAllstudents()
    {
        return record;
    }
    public boolean contains(int id)
    {
      for(int i=0;i<record.size();i++)
      {
          if(record.get(i).getStudentID()==id)
              return true;
      }
      return false;
    }
}
