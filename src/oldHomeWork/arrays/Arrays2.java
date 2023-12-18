package oldHomeWork.arrays;

public class Arrays2 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static void task1() {
        System.out.println("Task1");
        int[ ] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++ )
            sum = sum + arr[i];
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println();
    }

    private static void task2() {
        System.out.println("Task2");
        int[ ] arr = generateRandomArray();
        int minSum = arr[0];
        int maxSum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minSum) {
                minSum = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSum) {
                maxSum = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum +" рублей. Максимальная сумма трат за день составила " + maxSum + " рублей");

        System.out.println();
    }

    private static void task3() {
        System.out.println("Task3");
        int[ ] arr = generateRandomArray();
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            average = arr[i] + average;
        } System.out.println("Средняя сумма трат за месяц составила " + average/ arr.length + " рублей");

        System.out.println();
    }

    private static void task4() {
        System.out.println("Task4");
        // int[ ] arr = generateRandomArray();
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; --i) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}
