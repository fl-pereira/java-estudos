package application;

import model.entities.Account;
import model.exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Felipe Pereira
 */
public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("### ENTER ACCOUNT DATA ###");
            System.out.print("Account Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account ac = new Account(number,name,balance,withdrawLimit);
            System.out.println(ac);

            System.out.println();
            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();
            ac.withdraw(amount);
            System.out.println("New balance: $ " + ac.getBalance());
        }
        catch (DomainException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }

        sc.close();
    }
}
