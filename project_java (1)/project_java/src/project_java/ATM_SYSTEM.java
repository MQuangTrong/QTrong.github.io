/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_java;

import project_java.dangnhapATM;
import project_java.nhapSTK;
import project_java.welcomeatm;

/**
 *
 * @author Tran Quoc
 */
public class ATM_SYSTEM {
    public static void main(String[] args) {
        welcomeatm wel = new welcomeatm();
        wel.setVisible(true);
        wel.setLocationRelativeTo(null);
        nhapSTK stk = new nhapSTK();
        try {
            
            for(int i =0; i<=100; i++){
                Thread.sleep(50);                
                if (i==100) {
                    wel.setVisible(false);
                    stk.setVisible(true);
                    stk.setLocationRelativeTo(null);                    
                }
                
            }
        } catch (Exception e) {
        }
    }
}
