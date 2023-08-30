package Homework2;

public class Cat {
    private String name;
    private int appetite; // сколько кот съедает
    protected boolean satiety; // сытость - наелся кот или нет (хватило корма для кота или нет)

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate plate) {
        plate.eatingFood(appetite);
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }
}
