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
public abstract class BankAccount {

    protected double startBalanceOfMonth;
    protected double currentBalanceOfMonth;
    protected double totalDepositsOfMonth;
    protected int numberOfDepositsOfMonth;
    protected double totalWithdrawalsOfMonth;
    protected int numberOfWithdrawalsOfMonth;
    protected double annualIntrestRate;
    protected double monthServiceCharge;
    protected boolean accountStatus;

    public BankAccount() {
        this.currentBalanceOfMonth = 0;
        this.annualIntrestRate = 0;
    }

    public BankAccount(double currentBalanceOfMonth, double annualIntrestRate) {
        this.currentBalanceOfMonth = currentBalanceOfMonth;
        this.annualIntrestRate = annualIntrestRate;
    }

    void makeDeposit(double deposit) {
        this.currentBalanceOfMonth = this.currentBalanceOfMonth + deposit;
        this.totalDepositsOfMonth += deposit;
        this.numberOfDepositsOfMonth++;
    }

    void makeWithdraw(double withdraw) {
        this.currentBalanceOfMonth = this.currentBalanceOfMonth - withdraw;
        this.totalWithdrawalsOfMonth += withdraw;
        this.numberOfWithdrawalsOfMonth++;
    }

//    calculate monthly intrest earned by the account
    double calculateIntrest() {
        double monthlyIntrestRate = (this.annualIntrestRate / 12.0);
        double monthlyIntrest = this.currentBalanceOfMonth * monthlyIntrestRate;
        this.currentBalanceOfMonth = this.currentBalanceOfMonth + monthlyIntrest;
        return this.currentBalanceOfMonth;
    }

    void doMonthlyReport() {
        this.currentBalanceOfMonth = this.currentBalanceOfMonth - this.monthServiceCharge;
        this.calculateIntrest();
    }

    void doMonthlyCleanUp() {
        currentBalanceOfMonth = 0;
        totalDepositsOfMonth = 0;
        numberOfDepositsOfMonth = 0;
        totalWithdrawalsOfMonth = 0;
        numberOfWithdrawalsOfMonth = 0;
        monthServiceCharge = 0;
    }
}
