package xpug.kata.birthday_greetings;


import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedList;

public interface IEmployeeRepository {
    public LinkedList<Employee> getEmployees() throws IOException, ParseException;
}
