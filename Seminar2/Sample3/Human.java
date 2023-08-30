package Seminar2.Sample3;

class Human extends BaseHuman implements Runner {

    private final String name;
    private final int maxRun;
    private final int maxJump;

    public String getName() {
        return this.name;
    }

    public int getMaxRun() {
        return this.maxRun;
    }

    public int getMaxJump() {
        return this.maxJump;
    }

    public Human(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }
}
