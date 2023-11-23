package create_java.create4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new BottleOFWater("water", 123, 100));
        productList.add(new BottleOFWater("juice", 200, 150));
        productList.add(new BottleOFWater("soda", 500, 1000));
        productList.add(new BottleOFWater("compote", 123, 500));
        productList.add(new HotDrink("coffe", 200, 250, 40));
        productList.add(new HotDrink("tea", 300, 150, 45));
        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();
        vendingMachine.initProduct(productList);
        System.out.println(vendingMachine.getProduct("coffe", 250, 40));
    }
}