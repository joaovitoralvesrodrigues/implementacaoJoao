public class EmailService implements MessageService {
    @Override
    public void send(String message, String receiver) {
        System.out.println("[Email] Enviando para " + receiver + ": " + message);
    }
}

