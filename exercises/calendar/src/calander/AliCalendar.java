/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calander;

import java.util.Scanner;

/**
 *
 * @author asaberi1
 */
public class AliCalendar {

    /**
     * @param args the command line arguments
     */
    public void perform(){
        Scanner sr = new Scanner(System.in);
        System.out.println("Welcome Calandar Printer Program.");
        System.out.println();
        String userInput = Validator.getUserInput("Please, Enter date in the following format MM/YYYY: ", sr);
        CalanderBuilder.build(userInput);  
    }
    
    
    public static void main(String[] args) {
        AliCalendar myCalendar = new AliCalendar();
        myCalendar.perform();
        System.exit(0);     
    }
    
}
