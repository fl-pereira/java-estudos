package application;

import entities.enums.OrderStatus;
import entitites.Order;

import java.util.Date;

public class EnumOne {
    public static void main(String[] args){

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        OrderStatus os3 = OrderStatus.valueOf("PENDING-PAYMENT");

    }
}
