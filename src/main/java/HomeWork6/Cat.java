package HomeWork6;

public class Cat extends Animal {

    static int count = 0;

    public Cat(String name) {
        super(name);
        count++;
    }

    public Cat() {
        count++;
    }

    @Override
    void run(int distance) {
        if (distance > 200) {
            System.out.println("Кот пробежал 200 метров и устал");
        } else {
            System.out.println("Кот пробежал " + distance + " метров");
        }
    }

    @Override
    void swim(int distance) {
        System.out.println("Кот не умеет плавать!");
    }
}
