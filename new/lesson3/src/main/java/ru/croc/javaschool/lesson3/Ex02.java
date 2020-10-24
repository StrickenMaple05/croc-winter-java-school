package ru.croc.javaschool.lesson3;

import java.io.IOException;

public class Ex02 {

    public static void main(String[] args) {
        Ex02 ex02 = new Ex02();

        try {
            ex02.method1();
            ex02.method2();
        } catch (Exception2 exception2) {
            exception2.printStackTrace();
        } catch (Exception1 exception1) {
            exception1.printStackTrace();
        }

        try {
            ex02.method1();
            ex02.method2();
        } catch (Exception1 exception1) {
            exception1.printStackTrace();
        } catch (Exception2 exception2) {
            exception2.printStackTrace();
        }

        try {
            ex02.method1();
            ex02.method3();
        } catch (Exception1 exception1) {
            exception1.printStackTrace();
        }

        try {
            ex02.method1();
            ex02.method3();
        } catch (Exception3 exception1) {
            exception1.printStackTrace();
        }

        try {
            ex02.method1();
            ex02.method3();
        } catch (Exception3 exception3) {
            exception3.printStackTrace();
        } catch (Exception1 exception1) {
            exception1.printStackTrace();
        }

        try {
            ex02.method1();
            ex02.method3();
        } catch (Exception1 exception1) {
            exception1.printStackTrace();
        } catch (Exception3 exception3) {
            exception3.printStackTrace();
        }

        try {
            ex02.method1();
            ex02.method2();
            ex02.method3();
        } catch (Exception1 | Exception2 exception) {
            exception.printStackTrace();
            if (exception instanceof Exception3) {
                System.out.println();
            }
        }

        try {
            ex02.method1();
            ex02.method2();
            ex02.method3();
        } catch (Exception1 | Exception2 | Exception3 exception) {
            exception.printStackTrace();
        }

        try {
            ex02.method1();
            ex02.method2();
            ex02.method3();
        } catch (Exception3 | Exception2 exception) {
            exception.printStackTrace();
        }
    }

    void method1() throws Exception1 {
        throw new Exception1();
    }

    void method2() throws Exception2 {
        throw new Exception2();
    }

    void method3() throws Exception3 {
        throw new Exception3();
    }
}

class Exception1 extends Exception {}
class Exception2 extends Exception {}
class Exception3 extends Exception1 {}
