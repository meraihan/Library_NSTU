/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lib;

import javax.swing.JOptionPane;

/**
 *
 * @author Sayed Mahmud Raihan
 */
public class Validation {
    public static boolean validateEmail(String fname){
        return fname.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$");
        
    }
    public static boolean validatemobile(String mb){
        return mb.matches("^(?:\\+?88)?01[15-9]\\d{8}$");
    }
    public static boolean validateName(String nm){
       return nm.matches("[A-Z][a-zA-Z]* [A-Za-z]*" );
    }
//    public static boolean validateroll(String roll){
//        return roll.matches("^[a-zA-Za-zA-Za-zA-Z]+[0-90-90-90-90-90-90-9a-zA-Z]+");
//    }
}
