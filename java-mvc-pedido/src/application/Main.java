package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println(">>> ENTER CLIENT DATA");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String clientMail = sc.nextLine();       
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date clientBirthDate = sdf.parse(sc.next());
        
        Client cli = new Client(clientName, clientMail, clientBirthDate);
        
        System.out.println(">>> ENTER ORDER DATA");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        
        Order order = new Order(new Date(), status, cli);
        
        System.out.print("How many items for this order? ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println(">> Enter #" + i + "item data");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();
            
            Product product = new Product(productName, productPrice);
            OrderItem it = new OrderItem(productQuantity, productPrice, product);
            
            order.addItem(it);
        }
        
        System.out.println("");
        System.out.println(order);    
                
        
        sc.close();
    }
    
}
