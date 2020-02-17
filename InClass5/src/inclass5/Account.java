/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclass5;

/**
 *
 * @author aeeda
 */
public class Account {
    private String custID;
    private int accNum;
    private double initBal;
    
    public Account(){
        this.custID(" ",0,0,0);
        this.accNum(0,0,0,0,0);
        this.initBal(1000);
    }

    public Account(String custID, int accNum, double initBal) {
        this.custID = custID;
        this.accNum = accNum;
        this.initBal = initBal;
    }

    private void custID(String a_, int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void accNum(int i, int i0, int i1, int i2, int i3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void initBal(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
