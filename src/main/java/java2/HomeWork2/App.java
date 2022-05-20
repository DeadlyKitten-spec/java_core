package java2.HomeWork2;

public class App {
    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        try {
            try {
                int answer = ArrayCheck(array);
                System.out.println("Сумма элементов равна: " + answer);
            } catch (MyArraySizeException e) {
                e.Error();
            }
        }catch (MyArrayDataException e){
            e.Error();
        }
    }

    public static int ArrayCheck(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if(array.length != 4){
            throw new MyArraySizeException();
        }
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i].length != 4){
                throw new MyArraySizeException();
            }
            for (int j = 0; j < array[i].length; j++) {
                try{
                    answer += Integer.parseInt(array[i][j]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return answer;
    }
}
