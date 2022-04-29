package java2.HomeWork2;

public class MyArrayDataException extends Throwable {
    private int i;
    private int j;
    public MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;
    }
    public void Error(){
        System.out.println("Ошибка в значении элемента по индексам: " + (i + 1) + " " + (j + 1));
    }
}
