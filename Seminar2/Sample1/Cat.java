package Seminar2.Sample1;

class Cat extends Animal {
    private String color;

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void jump() {
        System.out.println("Кот прыгает");
    }

    public void voice() {
        System.out.println("Кот мяукает");
    }



}
