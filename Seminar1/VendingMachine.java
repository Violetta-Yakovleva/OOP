package Seminar1;

import java.util.Iterator;
import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(String name, double volume) {
        Iterator<Product> var4 = this.products.iterator();

        while(var4.hasNext()) {
            Product product = (Product)var4.next();
            if (product instanceof BottleOfWater bottleOfWater) {
                if (bottleOfWater.getName().equals(name) && bottleOfWater.getVolume() == volume) {
                    return bottleOfWater;
                }
            }
        }
        return null;
    }

    public Chocolate getChocolate(String name, int kcal) {
        Iterator<Product> var5 = this.products.iterator();

        while(var5.hasNext()) {
            Product product = (Product)var5.next();
            if(product instanceof Chocolate chocolate) {
                if (chocolate.getName().equals(name) && chocolate.getKcal() == kcal) {
                    return chocolate;
                }
            }
        }
        return null;
    }
}

