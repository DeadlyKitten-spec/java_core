package java_core;

public class HomeWorkApp {
    public static void main(String[] args) {
        printTreeWords();
        checkSumSigh();
        printColor();
        compareNumbers();
    }

    public static void printTreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSigh(){
        int a = 5;
        int b = -3;
        int sum = a + b;
        if(sum >= 0){
            System.out.println("Сумма положительная");
        }else{
            System.out.println("Сумма отрицательна");
        }
    }

    public static void printColor(){
        int value = 456;
        if(value <= 0){
            System.out.println("Красный");
        }else{
            if(value <= 100){
                System.out.println("Желтый");
            }else{
                System.out.println("Зеленый");
            }
        }
    }

    public static void compareNumbers(){
        int a = 12;
        int b = 34;
        if(a >= b){
            System.out.println("a >= b");
        }else{
            System.out.println("a < b");
        }
    }
}
