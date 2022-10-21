package application;

import entitites.Employer;
import entitites.Retang;

import java.util.Locale;
import java.util.Scanner;

public class ProgramEx02 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employer employer = new Employer();

        System.out.print("Name: ");
        employer.name = sc.nextLine();

        System.out.print("Gross salary: ");
        employer.salary = sc.nextDouble();

        System.out.print("Tax: ");
        employer.tax = sc.nextDouble();

        System.out.println("Employee:" + employer.toString());

        System.out.print("Which percentage to increase salary: ");
        double percentage = sc.nextDouble();
        employer.increaseSalaryPercentage(percentage);

        System.out.println("Updated data: " + employer.toString());

        sc.close();
    }

}
