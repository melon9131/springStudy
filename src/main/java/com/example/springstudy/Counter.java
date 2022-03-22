package com.example.springstudy;

public class Counter {

    private int count = 0;

    public void add() {
        System.out.println(++count);
    }

    public void add(int v) {
        System.out.println("overloading" + v);
        add();
    }

    public void minus() {
        System.out.println(--count);
    }

    private void pv(){
        System.out.println("private");
    }

    public static void main(String[] args){

    }
}
