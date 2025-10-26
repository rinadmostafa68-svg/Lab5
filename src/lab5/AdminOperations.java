/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.io.FileNotFoundException;

/**
 *
 * @author msi
 */
public class AdminOperations extends DataBase {

    public AdminOperations(String fileName) throws FileNotFoundException {
        super(fileName);
    }

    public boolean AddStudent(Student s) {
        if (!contains(s.getId())) {
            record.add(s);
            SaveToFile();
            return true;
        } else {
            return false;
        }
    }

    public Student SearchStudent(int id) {
        for (int i = 0; i < record.size(); i++) {
            if (record.get(i).getId()==id) {
                return record.get(i);
            }
        }
        return null;
    }

    public boolean DeleteStudent(int id) {
        for (int i = 0; i < record.size(); i++) {
            if (record.get(i).getId()==id) {
                record.remove(i);
                SaveToFile();
                return true;
            }
        }
        return false;
    }

    public boolean UpdateStudent(int id, String name, int Age, String Gender, String Dep, double gpa) {
        if (contains(id)) {
            Student s = SearchStudent(id);
            s.setName(name);
            s.setAge(Age);
            s.setGender(Gender);
            s.setDepartment(Dep);
            s.setGpa(gpa);
            SaveToFile();
            return true;
        }
        return false;

    }

}
