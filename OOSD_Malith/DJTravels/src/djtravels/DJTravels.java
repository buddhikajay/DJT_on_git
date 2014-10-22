/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package djtravels;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Aeshian
 */
public class DJTravels {

 
    
    public DJTravels()
    {
        //Setting the system theme as the look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
        }
        
        // create a new login window at the start
        login_form newLogin = new login_form();
        
        // center the login screen
        this.centerScreen(newLogin);
        newLogin.setVisible(true);
    }
    
    public static void main(String[] args) {
        // Start the application
        DJTravels newProgram = new DJTravels();
    }
    
    // method to center the screen
    private void centerScreen(JFrame form)
    {
        
        form.setLocationRelativeTo(null);
        
       // Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
       // int x = (dim.width - dim.getSize().height)/2;
       // int y = (dim.height - dim.getSize().width)/2;
        
        
        //form.setLocation(x, y);
       // System.out.println("Coordinates : " + x + " , " + y);
    }
    
}
