/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Scanner;

/**
 *
 * @author asaberi1
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public Bank() {
        super();
    }

    private SavingAccount mySavingAccount = new SavingAccount(0.0, 0.0);
    private CheckingAccount myCheckingAccount = new CheckingAccount(0, 0);

    public void perform() {
        System.out.println("Welcome to your bank!");
        System.out.println();

        boolean isExit = false;

        Scanner sc = new Scanner(System.in);

        while (!isExit) {
            printBankMenu();
            if (sc.hasNext()) {
                String bankMenuActionType = sc.next();
                if (bankMenuActionType.length() > 1) {
                    System.out.println("Error!");

                } else {
                    switch (bankMenuActionType) {
                        case "A":
                        case "a":
                            executeSavingMenu(sc);
                            break;
                        case "B":
                        case "b":
                            executeCheckingMenu(sc);
                            break;
                        case "C":
                        case "c":
                            isExit = true;
                            break;
                        default:
                            System.out.println("Error!");
                    }
                }

            }
        }

        System.out.println(mySavingAccount.currentBalanceOfMonth);
        System.out.println(myCheckingAccount.currentBalanceOfMonth);
    }

    private void printBankMenu() {
        System.out.println();
        System.out.println("Bank Menu\nA: Saving \nB: Checking \nC: Exit\n");
    }

    private void printSavingMenu() {
        System.out.println();
        System.out.println("Saving Menu\nA: Deposit \nB: Withdrawal \nC: Report \nD: Return to Bank Menu\n");
    }

    private void printCheckingMenu() {
        System.out.println();
        System.out.println("Checking Menu\nA: Deposit \nB: Withdrawal \nC: Report \nD: Return to Bank Menu\n");
    }

    public static void main(String[] args) {
        Bank myBank = new Bank();
        myBank.perform();
        System.exit(0);
    }

    private void executeSavingMenu(Scanner sc) {
        boolean isReturnFromSavingMenu = false;
        while (!isReturnFromSavingMenu) {
            printSavingMenu();
            if (sc.hasNext()) {
                String SavingMenuActionType = sc.next();
                if (SavingMenuActionType.length() > 1) {
                    System.out.println("Error!");
                } else {
                    switch (SavingMenuActionType) {
                        case "A":
                        case "a":
                            deposit(sc, mySavingAccount);
                            break;
                        case "B":
                        case "b":
                            withdraw(sc, mySavingAccount);
                            break;
                        case "C":
                        case "c":
                            report(sc, mySavingAccount);
                            break;
                        case "D":
                        case "d":
                            isReturnFromSavingMenu = true;
                            break;
                        default:
                            System.out.println("Error!");
                    }
                }

            }
        }

    }

    private void executeCheckingMenu(Scanner sc) {
        boolean isReturnFromCheckingMenu = false;
        while (!isReturnFromCheckingMenu) {
            printCheckingMenu();
            if (sc.hasNext()) {
                String checkingMenuActionType = sc.next();
                if (checkingMenuActionType.length() > 1) {
                    System.out.println("Error!");

                } else {
                    switch (checkingMenuActionType) {
                        case "A":
                        case "a":
                            deposit(sc, myCheckingAccount);
                            break;
                        case "B":
                        case "b":
                            withdraw(sc, myCheckingAccount);
                            break;
                        case "C":
                        case "c":

                            report(sc, myCheckingAccount);
                            break;
                        case "D":
                        case "d":
                            isReturnFromCheckingMenu = true;
                            break;
                        default:
                            System.out.println("Error!");
                    }
                }

            }
        }
    }

    private void deposit(Scanner sc, BankAccount account) {
        System.out.println("Please enter the deposit amount: ");
        if (sc.hasNextDouble()) {
            double amount = sc.nextDouble();
            account.makeDeposit(amount);
        }
    }

    private void withdraw(Scanner sc, BankAccount account) {
        System.out.println("Please enter the withdraw amount: ");
        if (sc.hasNextDouble()) {
            double amount = sc.nextDouble();
            account.makeWithdraw(amount);
        }
    }

    private void report(Scanner sc, BankAccount account) {
        account.doMonthlyReport();
        System.out.println("Report:");
        System.out.println("Starting balance: " + account.startBalanceOfMonth);
        System.out.println("Total amount of deposit: " + account.totalDepositsOfMonth);
        System.out.println("Total amount of withidrawal: " + account.totalWithdrawalsOfMonth);
        System.out.println("Service charge: " + account.monthServiceCharge);
        System.out.println("Current balance: " + account.currentBalanceOfMonth);
        System.out.println("Account status: " + account.accountStatus);

        account.startBalanceOfMonth = account.currentBalanceOfMonth;

        account.doMonthlyCleanUp();

    }

}
