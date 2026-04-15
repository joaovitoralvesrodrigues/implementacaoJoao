import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class LeituraRetornoBradesco implements LeituraRetorno {
    private URI caminhoArquivo;

    @Override
    public List<Boleto> lerArquivo(URI caminhoArquivo) {
        List<Boleto> result;
        try {
            List<String> linhas = Files.readAllLines(Paths.get(caminhoArquivo));
            List<Boleto> boletos = new ArrayList<>();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyy");

            for (String linha : linhas) {
                // No Bradesco, linhas de detalhe começam com "1"
                if (linha.startsWith("1")) {
                    Boleto boleto = new Boleto();

                    // Mapeamento baseado no padrão CNAB400 Bradesco
                    boleto.setId(Integer.parseInt(linha.substring(3, 7)));
                    boleto.setCodBanco(linha.substring(76, 79));
                    boleto.setAgencia(linha.substring(24, 29));
                    boleto.setConta(linha.substring(29, 36));

                    // Exemplo de Data e Valor
                    boleto.setDataVencimento(LocalDate.parse(linha.substring(110, 116), formatter));
                    boleto.setValor(Double.parseDouble(linha.substring(152, 165)) / 100.0);

                    boletos.add(boleto);
                }
            }
            result = boletos;
        } catch (IOException e) {
            throw new RuntimeException("Erro ao ler arquivo Bradesco", e);
        }
        return result;
    }
}