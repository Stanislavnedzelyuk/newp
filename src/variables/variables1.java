package variables;

public class variables1 {
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
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

    }
    private static void task2() {
        System.out.println("Task2");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog+4);
        System.out.println(cat+4);
        System.out.println(paper+4);
        System.out.println();
    }
    private static void task3() {
        System.out.println("Task3");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog-3.5);
        System.out.println(cat-1.6);
        System.out.println(paper-7639);
        System.out.println();
    }
    private static void task4() {
        System.out.println("Task4");
        var friend = 19;
        System.out.println(friend);
        System.out.println(friend+2);
        System.out.println((friend+2)/7);
        System.out.println();
    }
    private static void task5() {
        System.out.println("Task5");
        var frog = 3.5;
        System.out.println(frog);
        System.out.println(frog*10);
        System.out.println(frog*10/3.5);
        System.out.println(frog*10/3.5+4);
        System.out.println();
    }
    private static void task6() {
        System.out.println("Task6");
        var firstBoxer = 78.2;
        var secondBoxer= 82.7;
        System.out.println(firstBoxer+secondBoxer);
        System.out.println(secondBoxer-firstBoxer);
        System.out.println();
    }
    private static void task7() {
        System.out.println("Task7");
        var firstBoxer = 78.2;
        var secondBoxer= 82.7;
        System.out.println(secondBoxer-firstBoxer);
        System.out.println(secondBoxer%firstBoxer);
        System.out.println();
    }
    private static void task8() {
        System.out.println("Task8");
        var allTime = 640;
        var workDay = 8;
        var allPeople = allTime/workDay;
        var newAllPeople = allPeople + 94;
        System.out.println("Всего работников в компании — " + allPeople + " человек");
        System.out.println("Если в компании работает " + newAllPeople + " человек, то всего " + newAllPeople*8 + " часов работы может быть поделено между сотрудниками");

    }
}