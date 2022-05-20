package HomeWork7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        if (food != 0) {
            System.out.println("In plate " + food + " snacks");
        } else {
            System.out.println("The plate is empty");
        }
    }

    public void decreaseFood(int n, Cat c1) {
        if (food != 0) {
            if (n <= food) {
                System.out.println("Kitten " + c1.getName() + " ate " + n + " snacks");
                food -= n;
                c1.setSatiety(true);
            } else {
                System.out.println("In plate isn't enough food for the cat, he will not touch it");
            }
        } else {
            System.out.println("The plate is empty and kitten could not eat");
        }
    }

    public void increaseFood(int n) {
        if (n > 0) {
            food += n;
        } else {
            System.out.println("You can't decrease food");
        }
    }
}
