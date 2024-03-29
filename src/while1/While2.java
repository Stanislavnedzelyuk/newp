package while1;

public class While2 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    private static void task1() {
        System.out.println("Task1");
        int deposit = 0;
        int finalDeposit = 2_459_000;
        int month = 1;
        int montlyPay = 15000;
        while (deposit <= finalDeposit) {
            System.out.println("Месяц " + month + " сумма накоплений равна " + deposit +" рублей");
            deposit = deposit + montlyPay;
            month++;
        }

        System.out.println();

    }
    private static void task2() {
        System.out.println("Task2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int b = 10; b >= 1; --b) {
            System.out.print(b + " ");
        }

        System.out.println();
        System.out.println();
    }

    private static void task3() {
        System.out.println("Task3");
         int populationToday = 12_000_000;

         int birthrate = 12000000/1000*17;
         int mortality = 12000000/1000*8;

         int firstYear = 0;
         int year = 10;
         int birthrateYear = birthrate - mortality;

         while (firstYear <= year) {
             System.out.println("Год " + firstYear + ", численность населения составляет " + populationToday);
             populationToday = populationToday + birthrateYear;
             firstYear++;
         }
    System.out.println();
    }
    private static void task4() {
        System.out.println("Task4");
        int deposit = 15000;
        int month = 1;
        int sum = 12_000_000;
        double percent = 1.07;
        while (deposit <= sum) {
            System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
            month++;
            deposit = (int) (deposit * percent);
        }
        System.out.println();
    }
    private static void task5() {
        System.out.println("Task5");
        int deposit = 15000;
        int month = 1;
        double percent = 1.07;
        while (deposit <= 12_000_000) {
            month++;
            deposit = (int) (deposit * percent);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
            }
        }
        System.out.println();
    }

    private static void task6() {
        System.out.println("Task6");
        int yearToMonth = 0;
        int deposit = 15000;
        double percent = 1.07;
        int years = 9;
        int monthInYear = 12;

        while (yearToMonth <= years*monthInYear) {
            yearToMonth++;
            deposit = (int) (deposit * percent);
            if (yearToMonth % 6 == 0) {
                System.out.println("Месяц " + yearToMonth + ", сумма накоплений равна " + deposit + " рублей");
            }
        }
        System.out.println();
    }

    private static void task7() {
        System.out.println("Task7");
        int friday = 0;
        int firstFridayInTheMonth = 1;
        while (friday <= 31) {
            friday++;
            if (friday % 7 == firstFridayInTheMonth) {
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");

            }
        }
        System.out.println();
    }
    private static void task8() {
        System.out.println("Task8");
        int yearToday = 2023;
        int start = yearToday - 200;
        int everyYear = 79;
        int finish = yearToday + 100;

        while (start < finish) {
            start++;
            if (start%everyYear == 0) {
                System.out.println(start);
            }
        }

        System.out.println();

    }
}
