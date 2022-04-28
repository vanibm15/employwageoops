package com.bridgelabz;

public class Emplywageoops {
    int EMP_RATE_PER_HOUR = 20;
    int empHrs = 0;
    int empwage = 0;
    int IS_FULL_TIME = 1;

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
    void dailyEmploywage(){
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == IS_FULL_TIME)
            empHrs = 8;
        else
            empHrs = 0;
        empwage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp wage: " + empwage);
    }

    public static void main(String[] args) {
        method1();//calling 1st method
        Emplywageoops obj1=new Emplywageoops();//calling 2nd method
        obj1.dailyEmploywage();

    }
}





