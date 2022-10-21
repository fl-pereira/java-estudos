package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

/**
 *
 * @author Felipe Pereira
 */
public class JavaHeritage {

    public static void main(String[] args) {
        
        BusinessAccount bacc = new BusinessAccount(500.0, 1002, "Daphne", 0.0);
        
        /**
         * UPCASTING
         * Quando você atribui uma subclasse a uma superclasse, desde que seja herança
        */
        
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(200.0, 1003,"Mika", 0.0);
        Account acc3 = new SavingsAccount(1.2, 1003,"Mika", 0.0);
        
        /**
         * DOWNCASTING
         * 
         */
        if (acc2 instanceof BusinessAccount) {
            BusinessAccount acc4 = (BusinessAccount)acc2; // Precisa fazer o casting para converter a Super Classe em Subclasse
            acc4.loan(100.0);
            System.out.println("Loan!");
        }
        
        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3; // Precisa fazer o casting para converter a Super Classe em Subclasse
            acc5.updateBalance();
            System.out.println("Loan!");
        }
        
        /**
         * Sobreposição de método
         */
        
        Account acc7 = new SavingsAccount(1.2,1011,"Felipe",1000.0);
        acc7.withdraw(10.0);
        System.out.println(acc7.getBalance());
        
        Account acc8 = new BusinessAccount(100.0,1011,"Felipe",1000.0);
        acc8.withdraw(10.0);
        System.out.println(acc8.getBalance());
        
        /**
         * Trabalhando com classes abstratas agora
         */
        
        Account acc20 = new SavingsAccount(1.2, 1111, "Felipe", 100.0);
        Account acc30 = new BusinessAccount(200.0, 1111, "Felipe", 100.0);
    }
    
}
