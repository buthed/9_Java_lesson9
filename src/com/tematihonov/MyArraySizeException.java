package com.tematihonov;

public class MyArraySizeException extends Throwable {

    public MyArraySizeException() {
        super("Задан массив неправильного размера");
    }
}
