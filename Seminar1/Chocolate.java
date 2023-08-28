package Seminar1;

public class Chocolate extends Product {
    private int kcal;

    public Chocolate(String name, String brand, double price, int kcal) {
        super(name, brand, price);
        this.kcal = kcal;
    }

    public int getKcal(){
        return this.kcal;
    }

    public String displayInfo() {
        return String.format("[Шоколад] %s - %s - %.2f - калорийность: %d", this.name, this.brand, this.price, this.kcal);
    }

}
