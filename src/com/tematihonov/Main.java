package com.tematihonov;

public class Main {

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] firstArr = {{"1", "2", "3", "4"}, {"4", "5", "6", "7"}, {"8","9","11","15"}, {"13","1","2","2"}}; //поменять ячейку для вызова MyArrayDataException
        String[][] secondArr = {{"s", "2", "3", "4"}, {"4", "5", "6", "7"}};  //массив неправильного размера
        arrTask(firstArr);
        //arrTask(secondArr);           //раскомментировать для вызова исключения MyArraySizeException

    }

    public static void arrTask (String[][] Arr) throws MyArraySizeException, MyArrayDataException{
        arrSize(Arr);
        int sum = 0;
        String reg = "\\d+";
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[i].length; j++) {
                if (Arr[i][j].matches(reg)){
                    sum += Integer.parseInt(Arr[i][j]);                               //проверка на то, что в ячейке int
                } else {
                    System.out.println("В ячейке: " + i+ " " + j + " неправильные данные");
                    throw new MyArrayDataException();
                }
            }
        }
        System.out.println(sum);
    }

    public static void arrSize(String[][] Arr) throws MyArraySizeException{          //проверка длинны массива
        int a = Arr.length;
        int b = 0;
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i].length > b) {
                b = Arr[i].length;
            }
        }
        if (a!= 4 || b!= 4) {
            throw new MyArraySizeException();
        }
    }


}
