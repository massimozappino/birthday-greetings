package xpug.kata.birthday_greetings;

import java.io.*;
import java.text.ParseException;
import java.util.LinkedList;


public class EmployeeRepository {
    public LinkedList<Employee> getEmployees(String fileName) throws IOException, ParseException {
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        String str = "";
        str = in.readLine(); // skip header

        LinkedList<Employee> employees = new LinkedList<Employee>();
        while ((str = in.readLine()) != null) {
            String[] employeeData = str.split(", ");
            Employee employee = new Employee(employeeData[1], employeeData[0], employeeData[2], employeeData[3]);
            employees.add(employee);
        }

        return employees;
    }

}
