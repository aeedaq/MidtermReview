/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inclass5;

import javax.swing.JOptionPane;

/**
 *
 * @author Expression aeeda is undefined on line 12, column 14 in Templates/Classes/Main.java.
 */
public class InClass5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean success=false;
        while(!success){
        try{
            
            String input1 = JOptionPane.showInputDialog("enter a custom ID");
            String input2 = JOptionPane.showInputDialog("enter an account number");
            String input3 = JOptionPane.showInputDialog("enter an initial balance");
            
            int accNumber = Integer.parseInt(input2);
            double initBalance= Double.parseDouble(input3);
            
            Account c = new Account(input1,accNumber,initBalance);
            
            success=true;
        }
        catch(Exception e){
            System.out.println("You entered incorrectly, try again");
            }
        }
        // TODO code application logic here
    }

}
