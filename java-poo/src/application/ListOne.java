package application;

import java.util.ArrayList;
import java.util.List;

public class ListOne {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Felipe 1");
        list.add("Phelipe 2");
        list.add("Zelipe 3");
        list.add("Felipe 4");

        for (String obj : list){
            System.out.println(obj);
        }

        list.add(2, "Delipe 5");

        for (String obj : list){
            System.out.println(obj);
        }
    }
}
