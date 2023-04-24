package courseWork.bookEmployee;

public class Employee {

    private String fullName;                                //переменная Ф.И.О.
    private static int department;                          //переменная отдела
    private double salary;                                  //переменная зарплата
    private static int counterID = 0;                       //переменная счетчик
    private int empolyeeID;                                 //переменная ID
    private double changeSalary = 1.05;                     //переменная по увеличению зарплаты
    private double newSalary;                               //переменная с новой заработной платной


    public Employee(String fullName, int department, double salary) { // создал конструктор
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.empolyeeID = counterID++;
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

    public int getEmpolyeeID() {
        return empolyeeID;
    }

    @Override
    public String toString() {
        return empolyeeID + ", " + fullName + ", "  + department + ", " + salary + ", " + newSalary;

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
        return (average/10);
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
}


