 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist;

/**
 *
 * @author nupur
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student[] studentList = new Student[3];
        Student s1 = new Student();
        s1.setName("Nupur");
        Student s2 = new Student();
        s2.setName("Saurav");
        Student s3 = new Student();
        s3.setName("Sahil");
        Student s4 = new Student();
        s4.setName("Arjun");
        Student s5 = new Student();
        s5.setName("Ram");
        studentList[0] = s1;
        studentList[1] = s2;
        studentList[2] = s3;
        studentList[3] = s4;
        studentList[4] = s5;
        //this loop is going to run the number of times 
        //as same as the elements in the index.
        for(Student s: studentList){
            System.out.println(s.getName());
        }
        
            
    }
    
}
