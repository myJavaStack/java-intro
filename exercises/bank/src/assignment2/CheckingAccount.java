/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author asaberi1
 */
public class CheckingAccount extends BankAccount{
    
    public CheckingAccount(){
        super();
    }
    
    public CheckingAccount(double currentBalanceOfMonth, double annualIntrestRate){
        super(currentBalanceOfMonth, annualIntrestRate);
    }
    
    void makeWithdraw(double withdraw){
        if(this.currentBalanceOfMonth - withdraw < 0){
            monthServiceCharge += 15;
        
        } else {
            super.makeWithdraw(withdraw);
        }

    }
    
    void doMonthlyReport(){
         monthServiceCharge += 5 + ( numberOfWithdrawalsOfMonth * 0.1);
         super.doMonthlyReport();
    }
    
}
