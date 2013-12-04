package xpug.kata.birthday_greetings;

import java.io.*;
import java.text.ParseException;

import javax.mail.*;
import javax.mail.internet.*;

public class Main {

	public static void main(String[] args) throws IOException, ParseException, MessagingException {
        EmployeeRepository employeeRepository = new EmployeeRepository("employee_data.txt");
        MailServer mailServer = new MailServer("localhost", 25);
        BirthdayService service = new BirthdayService(employeeRepository, mailServer);
        service.sendGreetings(new XDate("2008/10/08"));
	}

}
