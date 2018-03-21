/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp;

import java.util.Scanner;

/**
 *
 * @author asaberi1
 */
public class MonthlyBillValidator {
    
    private static final String PACKAGE_TYPE_ERROR = "Package type is a character i.e (A, B, C, a, b, c). Please, try again!";
    private static final String TOTAL_HOURS_ERROR = "Usage hours is positive number, equal or smaller than 744hrs. Please, try again!";
   
    public static boolean validatePackageType(Scanner sc, String prompt, BillItem input){
        
        
        boolean isValid = false;
        while (isValid == false)
        {
            System.out.print(prompt);
            if (sc.hasNext())
            {
                String packageType = sc.next();
                if(packageType.length() > 1) {
                    isValid = false;
                    System.out.println(PACKAGE_TYPE_ERROR);
                } else {
         
                    switch(packageType) {
                        case "A":
                        case "a":
                        case "B":
                        case "b":
                        case "C":
                        case "c":
                            isValid = true;
                            input.setPackageType(packageType.charAt(0));
                            break;
                        default:
                            isValid = false;
                            System.out.println(PACKAGE_TYPE_ERROR);
                    }
                }
                
            }
            else {
                System.out.println(PACKAGE_TYPE_ERROR);
            }
            sc.nextLine();  // discard any other data entered on the line
        }
       
        return isValid;
    }
    
      public static boolean validateTotalHours(Scanner sc, String prompt, BillItem input){
        
        boolean isValid = false;
        while (isValid == false)
        {
            System.out.print(prompt);
            if (sc.hasNextDouble())
            {
                double totalHours = sc.nextDouble();
                if(totalHours > 744 || totalHours < 0 ) {
                    isValid = false;
                    System.out.println(TOTAL_HOURS_ERROR);
                } 
                else {
                    isValid = true;
                    input.setTotalHours(totalHours);
                }
                
            }
            else {
                System.out.println(TOTAL_HOURS_ERROR);
            }
            sc.nextLine();  // discard any other data entered on the line
        }
       
        return isValid;
    }  

}
