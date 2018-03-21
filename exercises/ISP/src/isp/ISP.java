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
public class ISP {
    
    public ISP() {
        super();
    }


    public void perform() {

        System.out.println("Welcome to our ISP monthly bill Calculator");
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        BillItem item = new BillItem();
        
            boolean isPackageValid = false;
            boolean isHourValid = false;
            
            while (!isPackageValid || !isHourValid){
            
                isPackageValid = MonthlyBillValidator.validatePackageType(sc,
                "Enter purchaced package type: ", item);
                isHourValid = MonthlyBillValidator.validateTotalHours(sc,
                "Enter usage hours: ", item);
            }
            
            System.out.println(new MonthlyBill(item.getPackageType(), item.getTotalHours()).calculateTotalCost());
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ISP myISP = new ISP();
        myISP.perform();
        System.exit(0);
    }
    
}
