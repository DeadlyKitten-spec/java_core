package HomeWork6;

public class Dog extends Animal{

    static int count = 0;

    public Dog() {
        count++;
    }

    public Dog(String name) {
        super(name);
        count++;
    }

    @Override
    void run(int distance) {
        if (distance > 500) {
            System.out.println("Пес пробежал 500 метров и устал");
        } else {
            System.out.println("Пес пробежал " + distance + " метров");
        }
    }

    @Override
    void swim(int distance) {
        if (distance > 10) {
            System.out.println("Пес проплыл 10 метров и устал");
        } else {
            System.out.println("Пес проплыл " + distance + " метров");
        }
    }
}
