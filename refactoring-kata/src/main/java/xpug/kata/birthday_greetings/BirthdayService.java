package xpug.kata.birthday_greetings;

import java.io.IOException;
import java.text.ParseException;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class BirthdayService {

    private final IEmployeeRepository employeeRepository;

    public BirthdayService(IEmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void sendGreetings(XDate xDate, MailServer ms) throws IOException, ParseException, MessagingException {

        for (Employee employee : employeeRepository.getEmployees()) {
            if (employee.isBirthday(xDate)) {
                String recipient = employee.getEmail();
                String body = "Happy Birthday, dear %NAME%!".replace("%NAME%", employee.getFirstName());
                String subject = "Happy Birthday!";
                ms.sendMessage("sender@here.com", subject, body, recipient);
            }
        }
	}

}
