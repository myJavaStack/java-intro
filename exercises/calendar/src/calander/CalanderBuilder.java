/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calander;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author asaberi1
 */
public class CalanderBuilder {
    
    private  static final String[] MONTH_NAME = {
     "January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "Octtober", "November", "December"
    };
    
    private static int[][] calanderMap = new int[][]{
            { 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0 }
        };
    
    public static void build(String inputCal){
        String month = inputCal.substring(0,2);
        String year = inputCal.substring(3);
        int monthInt = Integer.parseInt(month);
        int yearInt = Integer.parseInt(year);
        
        GregorianCalendar thisDate = new GregorianCalendar(yearInt, monthInt - 1, 1);
       
        int counter = 1;
        int numberOfDays = thisDate.getActualMaximum(Calendar.DAY_OF_MONTH);

        
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 7; j++) {
                if ( i == 0 && j < thisDate.get(Calendar.DAY_OF_WEEK) - 1) {
                 continue;
                } else {
                    if (counter <= numberOfDays) {
                        calanderMap[i][j] = counter;
                        counter++;
                    }
                }
            }
        }
        
        printCalendar(thisDate);
    };

    private static void printCalendar(GregorianCalendar thisDate) {
        System.out.println(MONTH_NAME[thisDate.get(Calendar.MONTH)] +" "+ thisDate.get(Calendar.YEAR));
        System.out.println("Su Mo Tu We Th Fr Sa");
        
        for (int i = 0; i < 6; i++){
            for(int j = 0; j < 7; j++){
                if (calanderMap[i][j] < 10) {
                    System.out.print(calanderMap[i][j] + "  ");
                } else {
                    System.out.print(calanderMap[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }
    
    
}
