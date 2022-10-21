package application;

import entities.Employee;
import entities.OutsourcedEmployee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Felipe Pereira
 */
public class Application {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Employee> list = new ArrayList<>();
        
        System.out.print("How many employees to register? ");
        int n = sc.nextInt();
        
        int outsourcedQuestion;
        for (int i = 1; i <= n; i++){
           
            System.out.println("### EMPLOYEE #" + i +" DATA ###");
            System.out.print("Employee is outsourced? 0 = NO / 1 = YES");
            outsourcedQuestion = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Time worked: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if (outsourcedQuestion == 1){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(additionalCharge,name,hours,valuePerHour);
                list.add(emp);
            } else {
                Employee emp = new Employee(name,hours,valuePerHour);
                list.add(emp);
            }
           
            System.out.println();
            System.out.println("PAYMENTOS");
            for (Employee emp : list){
                System.out.println(emp.toString());
            }
        }
        
        sc.close();
        
    }
}
