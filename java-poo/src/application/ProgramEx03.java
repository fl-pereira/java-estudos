package application;

import entitites.Student;

import java.util.Locale;
import java.util.Scanner;

public class ProgramEx03 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        student.name    = sc.nextLine();
        student.n1      = sc.nextDouble();
        student.n2      = sc.nextDouble();
        student.n3      = sc.nextDouble();

        double result = student.finalResult();
        int media = 60;
        if(result >= media) {
            System.out.printf("FINAL GRADE = %.2f%nPASS", result);
        } else {
            double missingPoints = media - result;
            System.out.printf("FINAL GRADE = %.2f%nFAILED%nMISSING %.2f POINTS%n", result, missingPoints);
        }
        sc.close();
    }

}
