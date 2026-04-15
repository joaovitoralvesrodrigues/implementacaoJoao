public class Main {
    public static void main(String[] args) {
        // Exemplo de alternância dinâmica sem IFs no código cliente
        MessageService service = MessageFactory.getService(MessageFactory.MessageType.WHATSAPP);
        service.send("Olá, seu código de verificação é 1234", "5511999999999");
    }
}