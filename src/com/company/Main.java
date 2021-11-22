package com.company;

public class Main {

    public static void main(String[] args) {
        task1(1.0);

        task2(AndroidOS, 2020);

        task3(2022);

        task4(95);

        task5(12);
    }

    private static final int iOS = 0;
    private static final int AndroidOS = 1;

    public static void task1(Object clientOS) {
        // Объявите переменную clientOS, которая равна 0 или 1.0 — iOS, 1 — Android.

        if((clientOS instanceof Double && (double) clientOS == 1.0) || (clientOS instanceof Integer && (int) clientOS == iOS))
            System.out.println("Установите версию приложения для iOS по ссылке");
        else if(clientOS instanceof Integer && (int) clientOS == AndroidOS)
            System.out.println("Установите версию приложения для Android по ссылке");
        else System.out.println("Неизвестное устройство");

//        var clientOS = 1.0;
//        if(clientOS == 1) {
//            System.out.println("Установите версию приложения для Android по ссылке");
//        } else if(clientOS == 1.0 || clientOS == 0) {
//            System.out.println("Установите версию приложения для iOS по ссылке");
//        } else System.out.println("Неизвестное устройство");
    }

    public static void task2(int OS, int clientDeviceYear) {
        if(clientDeviceYear >= 2015 && OS == AndroidOS)
            System.out.println("Установите версию приложения для Android по ссылке");
        else if(clientDeviceYear >= 2015 && OS == iOS)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else if(OS == AndroidOS)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        else System.out.println("Установите облегченную версию приложения для iOS по ссылке");
    }

    public static void task3(int year) {
        if((year % 4) == 0 || ((year % 100) == 0 && (year % 400) == 0)) {
            System.out.println(year + " год является високосным");
        } else System.out.println(year + " год не является високосным");
    }

    public static void task4(int deliveryDistance) {
        int extraDistance = deliveryDistance - 20;
        int days = 1 + extraDistance / 40;
        if((extraDistance % 40) != 0)
            days++;

       System.out.println("Потребуется дней: " + days);
    }

    public static void task5(int monthNumber) {
        if(monthNumber <= 0 || monthNumber > 12) {
            System.out.println("monthNumber = " + monthNumber + ", нет такого месяца. P.S. Это условие лишнее, можно было в switch сделать блок default для такой обработки, но в задаче просят написать именно условие.");
            return;
        }

        switch(monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + "й месяц - это Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + "й месяц - это Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + "й месяц - это Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + "й месяц - это Осень");
                break;
        }
    }


}
