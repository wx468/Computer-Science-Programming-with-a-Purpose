/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class BankAccount {

    public double balance;

    public void printBalance() {
        System.out.println("Your balance is " + balance);
    }


    public static void main(String[] args) {
        BankAccount a = new CheckingAccount(600.0);
    }
}
