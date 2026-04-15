public class Principal {
    public static void main(String[] args) {
        // Processando Banco do Brasil
        ProcessarBoleto processador = new ProcessarBoleto(new LeituraRetornoBB());
        processador.processar("bb.ret");

        // Trocando a estratégia dinamicamente para Bradesco
        processador.setLeituraRetorno(new LeituraRetornoBradesco());
        processador.processar("bradesco.ret");
    }
}