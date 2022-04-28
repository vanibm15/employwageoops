package com.bridgelabz;

public class Emplywageoops {
    static void method1() {
        int IS_FULL_TIME = 1;
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == IS_FULL_TIME)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is absent");
    }

    public static void main(String[] args) {
        method1();
    }
}



