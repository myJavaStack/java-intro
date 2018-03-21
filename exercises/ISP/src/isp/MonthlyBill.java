/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author asaberi1
 */
public class MonthlyBill {
    
//    private variables
    private NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
    
    private final double PACKAGE_A_PRICE = 9.95;
    private final double PACKAGE_B_PRICE = 14.95;
    private final double PACKAGE_C_PRICE = 19.95;
    
    private final double PACKAGE_A_EXTRA = 2.0;
    private final double PACKAGE_B_EXTRA = 1.0;
    private final double PACKAGE_C_EXTRA = 0;
    
    private final int PACKAGE_A_REG_HOURS = 10;
    private final int PACKAGE_B_REG_HOURS = 20;
    private final int PACKAGE_C_REG_HOURS = 0;
    
    private char packageType;
    private double totalHours;
    private double extraHours;
    private double totalCost;
    
//    custructors
    public MonthlyBill(){
    }
    
    
    public MonthlyBill(char packageType, double totalHours){
        this.packageType = packageType;
        this.totalHours = totalHours;   
    }
    
    
//    getter and setters
    
    public void setPackageType(char packageType){
      this.packageType = packageType;  
    }
    
    public char getPackageType(){
        return this.packageType;
    }
    
    public void setTotalHours(double totalHours){
        this.totalHours = totalHours;
    }
    
    public double getTotalHours(){
        return this.totalHours;
    }
    
    public void setExtraHours(double extraHours){
        this.extraHours = extraHours;
    }
    
    public double getExtraHours(){
        return this.extraHours;
    }
    
    
//    methods
    private void calculatePlanACosts (){
        double temp = this.totalHours - this.PACKAGE_A_REG_HOURS;
        if( temp > 0){
           this.extraHours = temp;    
        } else {
            this.extraHours = 0;
        }
        this.totalCost = this.PACKAGE_A_PRICE + (this.PACKAGE_A_EXTRA * this.extraHours);
    }
    
    private void calculatePlanBCosts() {
        double temp = this.totalHours - this.PACKAGE_B_REG_HOURS;
        if ( temp > 0 ){
            this.extraHours = temp;
        } else {
            this.extraHours = 0;
        }
        this.totalCost = this.PACKAGE_B_PRICE + (this.PACKAGE_B_EXTRA * this.extraHours);
    }
    
    private void calculatePlanCCosts() {
        double temp = this.totalHours - this.PACKAGE_C_REG_HOURS;
        if ( temp > 0 ) {
            this.extraHours =temp;
        } else {
            this.extraHours = 0;
        }  
        this.totalCost = this.PACKAGE_C_PRICE + (this.PACKAGE_C_EXTRA * this.extraHours);
    }
    
    public String calculateTotalCost(){
        switch (this.packageType){
            case 'a':
            case 'A':
                this.calculatePlanACosts();
                break;
            case 'b':
            case 'B':
                this.calculatePlanBCosts();
                break;
            case 'c':
            case 'C':
                this.calculatePlanCCosts();
                break;
            default:
                this.totalCost = 0;
                
        }
        return "Total bill: " + numberFormat.format(this.totalCost);
    }
}
