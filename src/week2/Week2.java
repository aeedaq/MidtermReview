/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import javax.swing.JOptionPane;

/**
 *
 * @author aeeda
 */
public class Week2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student[] student = new Student[5];
        student[0]= new Student("Aida",19,29326922);
        student[1]= new Student("Lisa",20,93223223);
        student[2]= new Student("Nabil",19,22232439);
        student[3]= new Student("Luan",39,22323229);
        student[4]= new Student("Marka",29,23433349);
        
        
        
        for (int i = 0; i<5; i++)
            System.out.println(student[i]);
        
        // TODO code application logic here
    }
    
}
