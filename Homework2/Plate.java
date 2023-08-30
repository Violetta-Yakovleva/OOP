package Homework2;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("\nКорма в тарелке: " + food);
    }

    public void eatingFood(int appetite) {
        food = food - appetite;
    }

    public void putFood(int newFood) {
        food = food + newFood;
    }
}
