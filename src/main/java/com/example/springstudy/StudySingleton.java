package com.example.springstudy;

public class StudySingleton {
    public static void main(String[] args) {
        Counter c = new Counter();

        Thread th1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                c.add();
            }
        });

        Thread th2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                c.minus();
            }
        });

        th1.start();
        th2.start();

    }

}
