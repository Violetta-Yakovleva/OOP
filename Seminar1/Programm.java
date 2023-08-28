package Seminar1;

import java.util.ArrayList;
import java.util.List;

public class Programm {
public static void main(String[] args) {
        Product product1 = new Product();
        System.out.println(product1.displayInfo());

        Product product2 = new Product((String)null, "Brand2", 300.0);
        System.out.println(product2.displayInfo());

        product2.setPrice(400.0);
        double price = product2.getPrice();
        System.out.println(price);
        System.out.println(product2.displayInfo());

        Product product3 = new Product("Product3");
        System.out.println(product3.displayInfo());

        Product bottleOfMilk1 = new BottleOfMilk("Бутылка1", "ООО Молоко", 350.0, 1.5, 15);
        System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfWater1 = new BottleOfWater("Бутылка c водой", "ООО Источник", 350.0, 1.0);
        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfWater2 = new BottleOfWater("Бутылка c водой", "ООО Источник", 150.0, 1.5);

        Product bottleOfWater3 = new BottleOfWater("Бутылка c водой", "ООО Источник", 250.0, 2.0);


        List<Product> products = new ArrayList<Product>();
        products.add(bottleOfMilk1);
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfWater3);

        VendingMachine vendingMachine = new VendingMachine(products);

        BottleOfWater bottleOfWater = vendingMachine.getBottleOfWater("Бутылка c водой", 1.5);
        if (bottleOfWater != null) {
            System.out.println("Вы получили: ");
            System.out.println(bottleOfWater.displayInfo());
        } else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }

        Chocolate chocolate1 = new Chocolate("Twix", "MARS", 150, 500);
        Chocolate chocolate2 = new Chocolate("Обыкновенное чудо", "Славянка", 100, 480);
        Chocolate chocolate3 = new Chocolate("Milky Way", "MARS", 100, 450);
        products.add(chocolate1);
        products.add(chocolate2);
        products.add(chocolate3);

        //Chocolate chocolate = vendingMachine.getChocolate("Milky Way", 500);
        Chocolate chocolate = vendingMachine.getChocolate("Milky Way", 450);

        if (chocolate != null) {
            System.out.println("Вы получили: ");
            System.out.println(chocolate.displayInfo());
        } else {
            System.out.println("Такой шоколадки нет в автомате.");
        }

    }
}
