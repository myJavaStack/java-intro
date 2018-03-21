/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calander;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author asaberi1
 */
public class Validator {
    
    public static String getUserInput(String prompt, Scanner sr){
       System.out.print(prompt);
       boolean isValidInput = false;
       String userInput = "";
       
       while(isValidInput == false){
           userInput = sr.nextLine();
           userInput = userInput.trim();
           
           if (!isValidDateFormat(userInput)){
               System.out.println("Invalid Entry, Please try again.");
               System.out.println(prompt);
               
           } else {
               isValidInput = true;
           }
           
       }
       return userInput;
    };
    
    public static boolean isValidDateFormat(String ui){
        // pattern for the Gregorian input
        String uiPattern = "^((0[1-9])|(1[0-2]))\\/\\d{4}$";
        Pattern pattern = Pattern.compile(uiPattern);
        Matcher matcher = pattern.matcher(ui);
        
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    };
    
    
}
