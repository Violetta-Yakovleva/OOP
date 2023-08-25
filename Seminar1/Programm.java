package Seminar1;
public class Programm {
    public static void main(String[] args) {
        Product product1 = new Product();
        // product1.name = "Product1";
        // product1.brand = "Brand1";
        // product1.price = 200;

        System.out.println(product1.displayInfo());

        Product product2 = new Product("Product2", "Brand2", 300);
        System.out.println(product2.displayInfo());

        Product product3 = new Product("Product3");
        System.out.println(product3.displayInfo());

    }
}
