package application;

import model.entities.CarRental;
import model.entities.Vehicle;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Felipe Pereira
 * 
 */
public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");

        System.out.println("### Entre com os dados do veículo alugado ###");
        System.out.print("Modelo do carro: ");
        String modelCar = sc.next();
        System.out.print("Retirada (dd/mm/aaaa hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.next(), fmt);
        System.out.print("Retorno (dd/mm/aaaa hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.next(), fmt);
        System.out.print("Insira o preço por hora: ");
        double valuePerHour = sc.nextDouble();
        System.out.println("Insira o preço por dia: ");
        double valuePerDay = sc.nextDouble();

        CarRental cr = new CarRental(start,finish,new Vehicle(modelCar));

        sc.close();
    }
}
