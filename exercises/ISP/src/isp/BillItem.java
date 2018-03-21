/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp;

/**
 *
 * @author asaberi1
 */
public class BillItem {
    private char packageType;
    private double totalHours;
    
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
    
}
