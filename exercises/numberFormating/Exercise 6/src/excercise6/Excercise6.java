/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excercise6;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author IT
 */
public class Excercise6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double originalPrice = 11.575;
        final double QST = 0.1;
        final double GST = 0.05;
        
        
    
    NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH);
    
    String price = currency.format(originalPrice);
    
    System.out.println("Price: "+ price);
    
    NumberFormat percent = NumberFormat.getPercentInstance();
    String qst = percent.format(QST);
    String gst = percent.format(GST);
    
    System.out.println("QST: "+ qst);
    System.out.println("GST: "+ gst);
    
    
    double totalPrice = originalPrice* (GST+ QST) + originalPrice;
    
    price = currency.format(totalPrice);
    
    System.out.println("Total Price: "+ price);
    
    }
}
