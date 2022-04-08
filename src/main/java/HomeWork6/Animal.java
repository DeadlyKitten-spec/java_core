package HomeWork6;

public abstract class Animal {

    static int count = 0;

    private String name;

    public Animal() {
        count++;
    }

    public Animal(String name) {
        this.name = name;
        count++;
    }

    abstract void run(int distance);

    abstract void swim(int distance);
}
