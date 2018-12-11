package oop.reviews.oop.bank.account;

public class BankAccountTest {
    public static void main(String[] args){
        BankAccount bofa = new BankAccount();
//        bofa.accountDetails();
        bofa.deposit( "checking", 300 );
        System.out.println( BankAccount.getNumberOfAccountsCount() );
    }

}
