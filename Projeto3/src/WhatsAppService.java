public class WhatsAppService implements MessageService {
    @Override
    public void send(String message, String receiver) {
        System.out.println("[WhatsApp] Enviando para " + receiver + ": " + message);
    }
}
