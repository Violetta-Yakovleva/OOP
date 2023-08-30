package Homework2;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Васька", 40, false);
        cats[1] = new Cat("Барсик", 50, false);
        cats[2] = new Cat("Персик", 30, false);

        Plate plate = new Plate(100);
        plate.info();

        System.out.println("");
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].satiety == false && cats[i].getAppetite() < plate.getFood()) {
                cats[i].eat(plate);
                cats[i].satiety = true;
                System.out.println("Кот " + cats[i].getName() + " наелся.");
            } else
                System.out.println("Кот " + cats[i].getName() + " остался голодным!");
        }

        plate.info();

        System.out.println("Сколько корма положить в тарелку?");
        Scanner sc = new Scanner(System.in);
        int newFood = sc.nextInt();
        sc.close();

        plate.putFood(newFood);
        plate.info();

    }

}
