package com.bridgelabz;


public class Emplywageoops {
    int EMP_RATE_PER_HOUR = 20;
    int empHrs = 0;
    int empwage = 0;
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;


    //UC1
    static void method1() {
        int IS_FULL_TIME = 1;
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == IS_FULL_TIME)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is absent");
    }

    //UC2
    //creating another method
    void dailyEmploywage() {
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == IS_FULL_TIME)
            empHrs = 8;
        else
            empHrs = 0;
        empwage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp wage: " + empwage);
    }

    //UC3-Method three
    static void partTimeEmployWage() {
        int IS_PART_TIME = 1;
        int IS_FULL_TIME = 2;
        int EMP_RATE_PER_HOUR = 20;
        int empHrs = 0;
        int empwage = 0;
        double empcheck = Math.floor(Math.random() * 10) % 3;
        if (empcheck == IS_PART_TIME)
            empHrs = 4;
        else if (empcheck == IS_FULL_TIME)
            empHrs = 8;
        else
            empHrs = 0;
        empwage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp wage: " + empwage);

    }

    //creating 4th method;
    static void employWageSwitchstatement() {
        int EMP_RATE_PER_HOUR = 20;
        int empHrs = 0;
        int empwage = 0;
        int empcheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empcheck) {
            case IS_PART_TIME:
                empHrs = 4;
                break;
            case IS_FULL_TIME:
                empHrs = 8;
                break;
            default:
                empHrs = 0;
        }
        empwage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp wage: " + empwage);

    }

    public static void main(String[] args) {
        method1();//calling 1st method
        Emplywageoops obj1 = new Emplywageoops();//calling 2nd method
        obj1.dailyEmploywage();
        partTimeEmployWage();//calling method 3;
        employWageSwitchstatement();//calling method4
    }
}




