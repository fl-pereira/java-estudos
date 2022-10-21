package application;

import entitites.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProgramExample {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Insira os dados do produto: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        product.setName(name);
        System.out.print("Código numeral: ");
        int code = sc.nextInt();
        product.setCode(code);
        System.out.print("Preço: ");
        double price = sc.nextDouble();
        product.setPrice(price);

        System.out.println();
        System.out.println("Dados do produto: " + product.toString());

        System.out.println();
        System.out.println("Insira o número de produtos adicionados ao estoque: ");
        int qty = sc.nextInt();
        product.addProducts(qty);

        System.out.println();
        System.out.println("Dados do produto atualizados: " + product.toString());

        System.out.println();
        System.out.println("Insira o número de produtos removidos do estoque: ");
        qty = sc.nextInt();
        product.removeProducts(qty);

        System.out.println();
        System.out.println("Dados do produto atualizados: " + product.toString());

        sc.close();

    }

}
