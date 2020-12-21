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
public class ConverterApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FtToCmConverter converter = new FtToCmConverter();
        
        System.out.println("5.8 feet in cms is: "+converter.convertToCm(5.8));
        
        System.out.println("10 feet in cms is: "+converter.convertToCm(10));
    }
    
}
