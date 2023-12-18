package oldHomeWork.methods;

import java.time.LocalDate;

public class Methods {
    public static void printSeparator () {
        System.out.println("========");
    }
    public static void leapYearCheck (int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void checkClientDevice (int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear < currentYear) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (clientDeviceYear >= currentYear) {
                if (clientOS == 0) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
            }
        }
    }
    public static int checkNumberDays(int deliveryDistance) {

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1 день срок доставки");
        } else
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2 дня срок доставки");
        } else
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3 дня срок доставки");
        } else {
            System.out.println("Карта не может быть доставлена");
        }
        return deliveryDistance;
    }
    public static void main(String[] args) {
        printSeparator();
        leapYearCheck(2024);
        printSeparator();
        checkClientDevice(0,2025);
        printSeparator();
        checkNumberDays(15);





    }


}



