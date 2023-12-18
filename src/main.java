import library.Employee;

public class main {
    public static void main(String[] args) {
        // Два объекта ниже созданы
        Employee Nik = new Employee("Nik", 1,
                100);
        Employee Mike = new Employee("Mike", 2,
                200);

        System.out.println(Nik.toString());
        System.out.println(Mike.toString());

    }
}
