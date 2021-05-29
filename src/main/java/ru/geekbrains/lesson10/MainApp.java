package ru.geekbrains.lesson10;

public class MainApp {
    public static void main(String[] args) {
        String[][] array = new String[][]{//{"Банан", "Апельсин", "Груша", "Яблоко"},
                {"1", "2", "11", "5"}, {"1", "2", "11", "5"},{"1", "2", "11", "5"},{"1", "2", "11", "5"}};
                //{"Кошка", "Собака", "Тигр", "Птица"},
                //{"Стол", "Кресло", "Диван", "Шкаф"},
                //{"Дом", "Улица", "Фонарь", "Аптека"}};
        try {
            try {
                System.out.println(String.valueOf(size(array)));

            } catch (MyArraySizeExeption myArraySizeExeption) {
                System.out.println("Превышен размер массива");
            }
        }
        catch (MyArrayDataExeption e) {
                System.out.println("Неверное значение массива! Ошибка в ячейке: " + e.i + e.j);
            }
        }

    public static int size(String[][] array) throws MyArraySizeExeption, MyArrayDataExeption {
        int count = 0;
        if (array.length != 4) {
            throw new MyArraySizeExeption();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeExeption();
            }
            for (int j = 0; j < array.length; j++) {
                try {
                    count += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataExeption(i, j);
                }
            }
        }
        return count;
    }
}
