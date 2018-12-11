package oop.reviews.oop.bank.account;

import java.util.Random;

public class BankAccount {
    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts = 0;
    private static double totalMoneySave = 0;

    public BankAccount(){
        this.accountNumber = this.generateNewAccountNumber();
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        BankAccount.numberOfAccounts += 1;
    }

    // Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored.
    public void deposit(String account, double amount){
        if(account.equals( "checking" )){
            this.checkingBalance += amount;
            BankAccount.totalMoneySave += amount;
            System.out.println( "You just deposit $"+ amount + " into your checking account." );
            System.out.println( "Your new checking balance: $" + this.checkingBalance );
        }
        else if(account.equals( "saving" )){
            this.savingsBalance += amount;
            BankAccount.totalMoneySave += amount;
            System.out.println( "You just deposit $"+ amount + " into your saving account." );
            System.out.println( "Your new saving balance: $" + this.savingsBalance);
        }
        else{
            System.out.println("Please selected either Checking or Saving");
        }
    }


    // Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.
    public void withdraw(String account, double amount){
        if(account.equals( "checking" )){
            if(this.checkingBalance > amount){
                this.checkingBalance -= amount;
                BankAccount.totalMoneySave -= amount;
                System.out.println( "You just withdraw $" + amount + " from the your checking account ending #" + this.accountNumber );
            }else{
                System.out.println( "Insufficient checking funds!" );
            }
        }
        else if(account.equals( "saving" )){
            if(this.savingsBalance > amount){
                this.savingsBalance -= amount;
                BankAccount.totalMoneySave -= amount;
                System.out.println( "You just withdraw $" + amount + " from the your saving account ending #" + this.accountNumber );
            }else{
                System.out.println( "Insufficient saving funds!" );
            }
        }
        else {
            System.out.println("Please selected either Checking or Saving");
        }
    }

    // Create a method to see the total money from the checking and saving.
    public void accountDetails(){
        System.out.println( "Account Number: #" + this.accountNumber );
        System.out.println("Checking Balance: $" +this.checkingBalance);
        System.out.println("Saving Balance: $" + this.savingsBalance);
    }

    public static int getNumberOfAccountsCount(){
        return BankAccount.numberOfAccounts;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    // Create a private method that returns a random ten digit account number
    private String generateNewAccountNumber(){
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();

        for(int i = 1; i <= 10; i++){
            sb.append( rand.nextInt( 9) );
        }
        return sb.toString();
    }


}
