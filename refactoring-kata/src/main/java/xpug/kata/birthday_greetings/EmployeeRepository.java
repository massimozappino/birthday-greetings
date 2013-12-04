package xpug.kata.birthday_greetings;

import java.io.*;
import java.util.LinkedList;


public class EmployeeRepository implements IEmployeeRepository {


    private final String fileName;

    public EmployeeRepository(String fileName) {
        this.fileName = fileName;
    }

    public LinkedList<Employee> findEmployeesWhoseBirthdayIs(XDate today) {
        LinkedList<Employee> employees = new LinkedList<Employee>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            String str = "";
            str = in.readLine(); // skip header

            while ((str = in.readLine()) != null) {
                String[] employeeData = str.split(", ");
                Employee employee = new Employee(employeeData[1], employeeData[0], employeeData[2], employeeData[3]);
                if (employee.isBirthday(today)) {
                    employees.add(employee);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return employees;
    }

}
