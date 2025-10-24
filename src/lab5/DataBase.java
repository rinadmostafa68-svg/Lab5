/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lab5;

import java.util.ArrayList;

/**
 *
 * @author msi
 */
public interface DataBase {
    public abstract void ReadFromFile();
    public abstract void SaveToFile();
    public abstract boolean contains();
    public abstract ArrayList<Student> getAllstudents();
    
    
}
