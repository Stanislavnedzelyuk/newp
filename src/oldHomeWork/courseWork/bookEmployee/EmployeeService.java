/* package oldHomeWork.courseWork.bookEmployee;

public class EmployeeService {
    public void addEmployee(String firstName, String lastName) {
        // Проверка входных данных
        if (StringUtils.isBlank(firstName) || StringUtils.isBlank(lastName)) {
            throw new BadRequestException("Имя или фамилия сотрудника не могут быть пустыми");
        }

        // Форматирование данных
        String formattedFirstName = StringUtils.capitalize(firstName.trim());
        String formattedLastName = StringUtils.capitalize(lastName.trim());

        // Создание сотрудника и добавление в систему
        Employee employee = new Employee(formattedFirstName, formattedLastName);

    }
}

// Класс исключения для Bad Request
class BadRequestException extends RuntimeException {
    public BadRequestException(String message) {
        super(message);
    }
}
}

 */
