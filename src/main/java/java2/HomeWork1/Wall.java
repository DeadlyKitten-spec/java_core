package java2.HomeWork1;

public class Wall implements Let {
    private int length;

    public Wall(int length) {
        this.length = length;
    }

    @Override
    public boolean attempt(Participant p) {
        if (p.run(length)) {
            System.out.println(p.getName() + " перепрыгнул стену успешно");
            return true;
        } else {
            System.out.println(p.getName() + " не смог перепрыгнуть и выбывает из гонки");
            return false;
        }
    }
}