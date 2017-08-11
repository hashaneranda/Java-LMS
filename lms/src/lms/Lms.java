/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hashan
 */
public class Lms {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("Convert2Lambda")
    public static void main(String[] args) {
        // TODO code application logic here
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new courses_std("SOC","12").setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Lms.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    
}
