package java2.HomeWork1;

public class Cat implements Participant {
    private String name;
    private int maxLength = 400;
    private int maxHeight = 1;

    public Cat(String name) {
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
