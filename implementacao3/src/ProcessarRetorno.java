import java.net.URI;
import java.util.List;

public class ProcessarRetorno {
    private LeituraRetorno leituraRetorno;

    public ProcessarRetorno(LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }

    public void processar(URI caminhoArquivo) {
        List<Boleto> boletos = leituraRetorno.lerArquivo(caminhoArquivo);
        for (Boleto b : boletos) {
            System.out.println(b);
        }
    }
}