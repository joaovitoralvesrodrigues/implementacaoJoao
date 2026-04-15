public class MessageFactory {
    public enum MessageType { EMAIL, SMS, WHATSAPP }

    public static MessageService getService(MessageType type) {
        return switch (type) {
            case EMAIL -> new EmailService();
            case SMS -> new SmsService();
            case WHATSAPP -> new WhatsAppService();
        };
    }
}