package Seminar2.Sample3;

public interface Runner {
    int getMaxJump();
    int getMaxRun();
    String getName();

    default boolean jump(int height) {
        if (height <= this.getMaxJump()) {
            System.out.printf("%s перепрыгнул через стену высотой %d см.\n", this.getName(), height);
            return true;
        } else {
            System.out.printf("%s не смог перепрыгнуть через стену высотой %d см., остался на месте\n", this.getName(), height);
            return false;
        }
    }

    default boolean run(int length) {
        if (length <= this.getMaxRun()) {
            System.out.printf("%s пробежал по беговой дорожке %d м.\n", this.getName(), length);
            return true;
        } else {
            System.out.printf("%s не смог пробежать по беговой дорожке %d м., остался на месте\n", this.getName(), length);
            return false;
        }
    }
}
