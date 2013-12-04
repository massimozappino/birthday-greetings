package xpug.kata.birthday_greetings;

import java.util.LinkedList;

public interface IEmployeeRepository {
    public LinkedList<Employee> findEmployeesWhoseBirthdayIs(XDate today) throws RuntimeException;
}
