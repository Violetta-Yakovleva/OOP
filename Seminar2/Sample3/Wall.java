package Seminar2.Sample3;

public class Wall extends Obstacle{
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getLength(){
        return 0;
    }

    public int getHeight(){
        return this.height;
    }
}
