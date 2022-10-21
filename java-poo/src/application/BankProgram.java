package application;

import entitites.BankData;
import java.util.Locale;
import java.util.Scanner;

public class BankProgram {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        BankData clientFelipe;

        double initialDepositValue;

        System.out.print("Inset client full name: ");
        String clientName = sc.nextLine();

        System.out.print("Insert account numbers: ");
        String bankAccount = sc.nextLine();

        System.out.print("Is there a initial deposit (y/n): ");
        char initialDepositBoolean = sc.next().charAt(0);

        if (initialDepositBoolean == 'y') {
            System.out.print("Enter initial deposit value: $ ");
            initialDepositValue = sc.nextDouble();
            clientFelipe = new BankData(clientName, bankAccount, initialDepositValue);
        } else {
            clientFelipe = new BankData(clientName, bankAccount);
        }

        System.out.println("Client data: " + clientFelipe.toString());

        System.out.print("Value to deposit: $ ");
        double depositValue = sc.nextDouble();
        clientFelipe.deposit(depositValue);

        System.out.println("Updated data: " + clientFelipe.toString());

        System.out.print("Value to withdraw ($5 tax): $ ");
        double withdrawValue = sc.nextDouble();
        clientFelipe.withdraw(withdrawValue);

        System.out.println("Updated data: " + clientFelipe.toString());

        System.out.print("Change client full name: ");
        String newClientName = sc.next();
        clientFelipe.newClientName(newClientName);

        System.out.println("Updated data: " + clientFelipe.toString());

        sc.close();

    }

}
