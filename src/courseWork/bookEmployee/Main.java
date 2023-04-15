package courseWork.bookEmployee;

import static courseWork.bookEmployee.Employee.*;

public class Main {

    public static void main(String[] args) {
        Employee[] storageEmployees = new Employee[10]; //создал массив Employee[10]
        storageEmployees [0] = new Employee("Иванов Иван Иванович", 1, 100_000);
        storageEmployees [1] = new Employee("Сидоров Сергей Сидорович", 2, 200_000);
        storageEmployees [2] = new Employee("Петров Петр Петрович", 3, 300000);
        storageEmployees [3] = new Employee("Морозов Иван Михайлович", 4, 402000);
        storageEmployees [4] = new Employee("Стебельков Илья Иванович", 5, 500000);
        storageEmployees [5] = new Employee("Пустынин Олег Александрович", 1, 53000);
        storageEmployees [6] = new Employee("Гусеев Анатолий Маркович", 2, 200000);
        storageEmployees [7] = new Employee("Морозова Инна Ивановна", 3, 300400);
        storageEmployees [8] = new Employee("Сергеенко Анна Сергеевна", 4, 400000);
        storageEmployees [9] = new Employee("Мильская Ольга Михайловна", 5, 500000);


        System.out.println("Базовая сложность>");
        for (Employee employee : storageEmployees) {
            System.out.println(employee);
        }

        System.out.println("=================");
        System.out.println("Сумма общих затрат на зарплаты в месяц " + totalSalary(storageEmployees));
        System.out.println("=================");
        System.out.println("Сотрудник с минимальной заработной платой: " + printMinSalaryEpmloyee(storageEmployees));
        System.out.println("=================");
        System.out.println("Сотрудник с максимальной заработной платой: " + printMaxSalaryEmployee(storageEmployees));
        System.out.println("=================");
        System.out.println("Средняя заработная плата: " + printAvarageSalaryEmployee(storageEmployees));
        System.out.println("=================");
        System.out.println("Список всех ФИО:");
        System.out.println(printAllFullnameEmployee(storageEmployees));
        System.out.println();
        System.out.println();
        System.out.println("Повышенная сложность");
        System.out.println("Сотрудник с минимальной заработной платой после индексации: " + printNewMinSalaryEpmloyee(storageEmployees));
        System.out.println("Сотрудник с максимальной заработной платой после индексации: " + printNewMaxSalaryEmployee(storageEmployees));
        System.out.println("Сумма затрат на зарплату по отделу: " + totalNewSalary(storageEmployees));




    }
}
