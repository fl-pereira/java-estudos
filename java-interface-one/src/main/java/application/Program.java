package application;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

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

        CarRental cr = new CarRental(start,finish,new Vehicle(modelCar));

        System.out.print("Insira o preço por hora: ");
        double valuePerHour = sc.nextDouble();
        System.out.print("Insira o preço por dia: ");
        double valuePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(valuePerHour,valuePerDay,new BrazilTaxService());
        rentalService.processInvoice(cr);

        System.out.println("### FATURA ###");
        System.out.println("Pagamento base: " + cr.getInvoice().getBasicPayment());
        System.out.println("Impost: " + cr.getInvoice().getTax());
        System.out.println("Pagamento total: " + cr.getInvoice().getTotalPayment());

        sc.close();
    }
}
