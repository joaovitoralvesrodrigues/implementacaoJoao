public class SmsService implements MessageService {
    @Override
    public void send(String message, String receiver) {
        System.out.println("[SMS] Enviando para " + receiver + ": " + message);
    }
}
