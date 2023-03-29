package methods;

import java.time.LocalDate;

public class Methods {
    public static void separator() {
        System.out.println("===================");
    }
    public static void checkLeapYear() {
        int year = 2021;
        int everyYear = 4;
        int every100 = 100;
        int every400 = 400;
        if (year % everyYear == 0 && year % every100 != 0 && year % every400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void checkOsVersion() {
        int currentYear = LocalDate.now().getYear();
        int clientOS = 0;
        int clientDeviceYear = currentYear;

        if (clientDeviceYear < 2015) {
            if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (clientDeviceYear >= 2015) {
                if (clientOS == 0) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
            }
        }
    }
    public static void checkNumberDays() {
        int deliveryDistance = 1000;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1 день срок доставки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2 дня срок доставки");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3 дня срок доставки");
        } else {
            System.out.println("Карта не может быть доставлена");
        }
    }
    public static void main(String[] args) {
        checkLeapYear();
        separator();
        checkOsVersion();
        separator();
        checkNumberDays();

    }
}
