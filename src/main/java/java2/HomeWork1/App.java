package java2.HomeWork1;

public class App {
    public static void main(String[] args) {
        Participant[] part = {
                new Cat("Vaska"),
                new Human("Petr"),
                new Robot("R2D2"),
                new Cat("Myrsik"),
                new Human("Ivan"),
                new Robot("C3PO")
        };
        Let[] lets = {
                new Treadmill(100),
                new Wall(1),
                new Treadmill(200),
                new Wall(2),
                new Treadmill(300),
                new Wall(3)
        };
        for (int i = 0; i < part.length; i++) {
            for (int j = 0; j < lets.length; j++) {
                if (!lets[j].attempt(part[i])) {
                    break;
                }
            }
        }
    }
}
