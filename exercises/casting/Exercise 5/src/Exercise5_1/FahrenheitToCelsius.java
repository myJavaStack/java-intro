/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise5_1;

import java.util.Scanner;
import java.text.NumberFormat;

/**
 *
 * @author Amin
 */
public class FahrenheitToCelsius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Convert Fahrenheit to Celsius 
        double celsius = (5.0 / 9) * (fahrenheit - 32);

        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);

        System.out.println("Fahrenheit " + fahrenheit + " is " + nf.format(celsius) + " in Celsius");

    }

}
