import java.util.ArrayList;
import java.util.List;

public class LeituraRetornoBradesco implements LeituraRetorno {
    @Override
    public List<Boleto> lerArquivo(String nomeArquivo) {
        System.out.println("Lendo arquivo do Bradesco (Layout Diferente): " + nomeArquivo);
        // Lógica de parser específica para as posições do Bradesco
        return new ArrayList<>();
    }
}