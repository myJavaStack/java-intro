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
public class SavingAccount extends BankAccount {

    public SavingAccount() {
        super();
    }

    public SavingAccount(double currentBalanceOfMonth, double annualIntrestRate) {
        super(currentBalanceOfMonth, annualIntrestRate);
    }

    void makeWithdraw(double withdraw) {
        if (accountStatus) {
            super.makeWithdraw(withdraw);

            if (currentBalanceOfMonth > 25) {
                accountStatus = true;
            } else {
                accountStatus = false;
            }
        }
    }

    void makeDeposit(double deposit) {
        if (!super.accountStatus) {
            super.makeDeposit(deposit);
            if (currentBalanceOfMonth > 25) {
                accountStatus = true;
            }
        } else {
            super.makeDeposit(deposit);
        }
    }

    void doMonthlyReport() {
        if (numberOfWithdrawalsOfMonth > 4) {
            this.monthServiceCharge = (numberOfWithdrawalsOfMonth - 4) * 1.0 + this.monthServiceCharge;
        }

        super.doMonthlyReport();
    }
}
