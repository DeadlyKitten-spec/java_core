package HomeWork6;

public class HomeWorkApp {
    public static void main(String[] args) {
        Cat c1 = new Cat("Vaska");
        c1.run(201);
        c1.swim(1);
        Dog d1 = new Dog();
        d1.run(502);
        d1.swim(11);
        System.out.println(Animal.count);
        System.out.println(Dog.count);
        System.out.println(Cat.count);
    }
}
