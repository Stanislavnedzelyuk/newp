package courseWork.bookEmployee;

public class Employee {

    private String fullName;                                //переменная Ф.И.О.
    private static int department;                                 //переменная отдела
    private double salary;                                  //переменная зарплата
    private int counterID = 0;                              //переменная счетчик
    private int empolyeeID;                                 //переменная ID
    private double changeSalary = 1.05;                     //переменная по увеличению зарплаты
    private double newSalary;                               //переменная с новой заработной платной


    public Employee(String fullName, int department, double salary, int counterID) { // создал конструктор
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.counterID = ++counterID;
        this.newSalary = salary*changeSalary;
    }

    public String getFullName() { // создал геттер
        return fullName;
    }
    public int getDepartment() { // создал геттер
        return department;
    }
    public double getSalary() { // создал геттер
        return salary;
    }
    public int getCounterID() { // создал геттер
        return counterID;
    }
    public double getNewSalary() { // создал геттер
        return newSalary;
    }
    public double getChangeSalary() {  // создал геттер
        return changeSalary;
    }
    public void setSalary(int salary) { // создал сеттер
        this.salary = salary;
    }
    public void setDepartment(int department) {  // создал сеттер
        this.department = department;
    }
    public void setNewSalary(double newSalary) { // создал сеттер
        this.newSalary = newSalary;
    }


    @Override
    public String toString() {
        return counterID + ", " + fullName + ", "  + department + ", " + salary + ", " + newSalary;

    }

    public static double totalSalary (Employee[] employees) {
        double total = 0;
        for (Employee employee : employees) {
            total += employee.getSalary();
        }
        return total;
    }
    public static Employee printMinSalaryEpmloyee(Employee[] employees) {
        Employee minSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }
    public static Employee printMaxSalaryEmployee(Employee[] employees) {
        Employee maxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary.getSalary()) {
                maxSalary = employee;
            }
        }
        return maxSalary;
    }
    public static double printAvarageSalaryEmployee(Employee[] employees) {
        double average = 0;
        for (Employee employee : employees) {
            average += employee.getSalary();
        }
        return average;
    }

    public static Employee printAllFullnameEmployee(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }

        return null;
    }

    public static Employee printNewMinSalaryEpmloyee(Employee[] employees) {
        Employee minSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getNewSalary() < minSalaryEmployee.getNewSalary()) {
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public static Employee printNewMaxSalaryEmployee(Employee[] employees) {
        Employee maxNewSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getNewSalary() > maxNewSalary.getNewSalary()) {
                maxNewSalary = employee;
            }
        }
        return maxNewSalary;
    }
    public static double totalNewSalary (Employee[] employees) {
        double total = 0;
        for (Employee employee : employees) {
            total += employee.getNewSalary();
        }
        return total;
    }


    public static void main(String[] args) {
        Employee[] storageEmployees = new Employee[10]; //создал массив Employee[10]
        storageEmployees [0] = new Employee("Иванов Иван Иванович", 1, 100_000, 0);
        storageEmployees [1] = new Employee("Сидоров Сергей Сидорович", 2, 200_000, 1);
        storageEmployees [2] = new Employee("Петров Петр Петрович", 3, 300000, 2);
        storageEmployees [3] = new Employee("Морозов Иван Михайлович", 4, 402000, 3);
        storageEmployees [4] = new Employee("Стебельков Илья Иванович", 5, 500000, 4);
        storageEmployees [5] = new Employee("Пустынин Олег Александрович", 1, 53000, 5);
        storageEmployees [6] = new Employee("Гусеев Анатолий Маркович", 2, 200000,6 );
        storageEmployees [7] = new Employee("Морозова Инна Ивановна", 3, 300400, 7);
        storageEmployees [8] = new Employee("Сергеенко Анна Сергеевна", 4, 400000, 8);
        storageEmployees [9] = new Employee("Мильская Ольга Михайловна", 5, 500000, 9);


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
        System.out.println("Средняя заработная плата: " + printAvarageSalaryEmployee(storageEmployees)/storageEmployees.length);
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


