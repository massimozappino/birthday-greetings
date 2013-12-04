package xpug.kata.birthday_greetings;

import java.util.LinkedList;

public interface IEmployeeRepository {
    public LinkedList<Employee> getEmployees() throws RuntimeException;
}
