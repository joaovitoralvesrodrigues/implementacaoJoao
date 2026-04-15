import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LeituraRetornoBB implements LeituraRetorno {
    public List<Boleto> lerArquivo(String nomeArquivo) {
        // Simulação da lógica: No BB, o ID está na posição X, Data na Y
        System.out.println("Lendo arquivo do Banco do Brasil: " + nomeArquivo);
        List<Boleto> boletos = new ArrayList<>();

        // Lógica de parser (Exemplo simplificado)
        Boleto b = new Boleto();
        b.setId(1);
        b.setCodBanco("001");
        b.setDataVencimento(LocalDate.now());
        boletos.add(b);

        return boletos;
    }

    @Override
    public List<Boleto> lerArquivo(URI caminhoArquivo) {
        return List.of();
    }
}