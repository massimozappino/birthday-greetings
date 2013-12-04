package xpug.kata.birthday_greetings;

import java.io.IOException;
import java.text.ParseException;

import javax.mail.MessagingException;

public class BirthdayService {

    private final IEmployeeRepository employeeRepository;
    private final IMessageServer mailServer;

    public BirthdayService(IEmployeeRepository employeeRepository, IMessageServer mailServer) {
        this.employeeRepository = employeeRepository;
        this.mailServer = mailServer;
    }

    public void sendGreetings(XDate today) throws IOException, ParseException, MessagingException {

        for (Employee employee : employeeRepository.findEmployeesWhoseBirthdayIs(today)) {

            String recipient = employee.getEmail();
            String body = "Happy Birthday, dear %NAME%!".replace("%NAME%", employee.getFirstName());
            String subject = "Happy Birthday!";
            mailServer.sendMessage("sender@here.com", subject, body, recipient);

        }
    }

}
