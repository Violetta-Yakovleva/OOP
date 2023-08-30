package Seminar2.Sample3;

public class Track extends Obstacle {

    private final int length;

    public Track(int length) {
        this.length = length;
    }

    public int getLength() {
        return this.length;
    }

    public int getHeight() {
        return 0;
    }
}
