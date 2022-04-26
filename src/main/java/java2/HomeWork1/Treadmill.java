package java2.HomeWork1;

public class Treadmill implements Let{
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public boolean attempt(Participant p) {
        if (p.run(length)) {
            System.out.println(p.getName() + " пробежал испытание успешно");
            return true;
        } else {
            System.out.println(p.getName() + " не смог пробежать и выбывает из гонки");
            return false;
        }
    }
}
