import java.net.URI;
import java.util.List;

public class ProcessarBoleto {
    private LeituraRetorno leituraRetorno;

    public ProcessarBoleto(LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }

    public void setLeituraRetorno(LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }

    public void processar(String nomeArquivo) {
        List<Boleto> boletos = leituraRetorno.lerArquivo(URI.create(nomeArquivo));
        for (Boleto b : boletos) {
            System.out.println(b);
        }
    }
}