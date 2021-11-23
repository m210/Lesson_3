package com.company;

public class Main {

    private static final int iOS = 0;
    private static final int AndroidOS = 1;

    public static void main(String[] args) {
        task1(AndroidOS);

        task2(iOS, 2012);

        task3(2022);

        task4(95);

        task5(12);
    }

    public static void task1(int clientOS) {
        if(clientOS == iOS)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else if(clientOS == AndroidOS)
            System.out.println("Установите версию приложения для Android по ссылке");
        else System.out.println("Неизвестное устройство");
    }

    public static void task2(int OS, int clientDeviceYear) {
//        if(clientDeviceYear >= 2015 && OS == AndroidOS)
//            System.out.println("Установите версию приложения для Android по ссылке");
//        else if(clientDeviceYear >= 2015 && OS == iOS)
//            System.out.println("Установите версию приложения для iOS по ссылке");
//        else if(OS == AndroidOS)
//            System.out.println("Установите облегченную версию приложения для Android по ссылке");
//        else System.out.println("Установите облегченную версию приложения для iOS по ссылке");

        if(OS != iOS && OS != AndroidOS) {
            System.out.println("Неизвестное устройство");
            return;
        }

        if(clientDeviceYear < 2015) {
            if(OS == iOS)
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            else if(OS == AndroidOS)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else task1(OS);
    }

    public static void task3(int year) {
        if(((year % 4) == 0 && (year % 100) != 0) || (year % 400) == 0) {
            System.out.println(year + " год является високосным");
        } else System.out.println(year + " год не является високосным");
    }

    public static void task4(int deliveryDistance) {
       int days;
       if(deliveryDistance < 20)
           days = 1;
       else if(deliveryDistance >= 20 && deliveryDistance < 60)
           days = 2;
       else if(deliveryDistance >= 60 && deliveryDistance < 100)
           days = 3;
       else {
           int extraDistance = deliveryDistance - 19; // отнимать 19 или 20, зависит, нужно ли захватывать 20й км для добавления 1 дня.
           days = 1 + extraDistance / 40;
           if(extraDistance > 0 && (extraDistance % 40) != 0) // Эта формула теперь будет работать и для дистанции < 20км, поэтому остальные условия избыточныы
               days++;
       }
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
