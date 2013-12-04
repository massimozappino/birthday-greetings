package xpug.kata.birthday_greetings;


public interface IMessageServer {
    public void sendMessage(String sender, String subject, String body, String recipient) throws RuntimeException;
}
