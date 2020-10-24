package ru.croc.javaschool.lesson3;

import java.io.IOException;

public class Ex01 {

    public static void main(String[] args) {
        String test = "Test test test test";
        Ex01 ex01 = new Ex01();
        try {
            ex01.printString(test);
        } catch (IOException exc) {
            exc.printStackTrace();
        }

        test = "Test";
        try {
            ex01.printString(test);
        } catch (IOException ignored) {}
    }

    public void printString(String s) throws IOException {
        if (s.length() > 10) {
            throw new IOException("Многа букаф");
        }
        System.out.println(s);
    }
}
