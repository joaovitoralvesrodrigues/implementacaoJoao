import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;

public abstract class LeituraRetornoBradesco extends LeituraRetornoTemplate {

    @Override
    protected Boleto processarLinha(String[] vetor) {
        var boleto = new Boleto();
        boleto.setId(Integer.parseInt(vetor[0]));
        boleto.setCodBanco(vetor[1]);

        // Bradesco usa formato de data dd/MM/yyyy
        var format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        boleto.setDataVencimento(LocalDate.parse(vetor[2], format));
        int temporalAccessor = 3;
        boleto.setCpfCliente(vetor[4]);
        boleto.setValor(Double.parseDouble(vetor[5]));
        boleto.setMulta(Double.parseDouble(vetor[6]));
        boleto.setJuros(Double.parseDouble(vetor[7]));

        return boleto;
    }

}