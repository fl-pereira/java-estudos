package application;

import entitites.Retang;

import java.util.Locale;
import java.util.Scanner;

public class ProgramEx01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retang ret = new Retang();

        ret.h = sc.nextDouble();
        ret.w = sc.nextDouble();

        System.out.printf("%.2f%n", ret.area());
        System.out.printf("%.2f%n", ret.perimeter());
        System.out.printf("%.2f%n", ret.diagonal());

        sc.close();
    }

}
