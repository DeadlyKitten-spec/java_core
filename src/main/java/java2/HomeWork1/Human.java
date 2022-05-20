package java2.HomeWork1;

public class Human implements Participant {
    private String name;
    private int maxLength = 200;
    private int maxHeight = 2;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean run(int length) {
        if (length > maxLength) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height > maxHeight) {
            return false;
        } else {
            return true;
        }
    }
}
