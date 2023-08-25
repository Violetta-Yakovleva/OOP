package Seminar1;

/**
 * Товар
 */

public class Product {

    private String name; // наименование товара
    private String brand; // изготовитель
    private double price; // цена

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }



    public Product(){

    }

    public Product(String name){
        this.name = name;
        brand = "Noname";
        price = 100;
    }

    public Product(String name, String brand, double price) { // конструктор - название как у класса! инициализация состояния объекта - мы создали свой конструктор!
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String displayInfo(){
        return String.format("%s - %s - %.2f", name, brand, price);
        }
}