import java.net.URI;
import java.util.List;

public interface LeituraRetorno {
    List<Boleto> lerArquivo(URI caminhoArquivo);
}