package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Felipe Pereira
 * 
 */
public class Program {

    public static void main(String[] args) throws ParseException {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        List<Product> list = new ArrayList<>();
        
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++){
            System.out.println("PRODUCT #" + i + " DATA:");
            System.out.print("Common, used or imported? (c/u/i)");
            char choice = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: $");
            Double price = sc.nextDouble();
            if (choice == 'u'){
                System.out.print("Manufacture date: ");
                Date date = sdf.parse(sc.next());
                Product prod = new UsedProduct(date,name,price);
                list.add(prod);
            } else if (choice == 'i'){
                System.out.print("Customs fee: $");
                Double customsFee = sc.nextDouble();
                Product prod = new ImportedProduct(customsFee,name,price);
                list.add(prod);
            } else {
                Product prod = new Product(name,price);
                list.add(prod);
            }
        }
        
        System.out.println("PRICE TAGS:");
        for(Product prod : list){
            System.out.println(prod.priceTag());
        }
        
        sc.close();
    }
}
