/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converterapp;

/**
 *
 * @author Manik
 */
public class FtToCmConverter {
    
    public double convertToCm(double inFeet){
        System.out.println("Double input method is called");
        return inFeet*30.48;
    }
    
    public double convertToCm(int inFeet){
        System.out.println("Integer input method is called");
        return inFeet*30.48;
    }
    
}
