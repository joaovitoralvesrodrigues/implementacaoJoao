import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public abstract class LeituraRetornoTemplate implements LeituraRetorno {
    public final List<Boleto> lerArquivo(URI caminhoArquivo){
        try {
            var listaBoletos = new ArrayList<Boleto>();
            var linhas = Files.readAllLines(Paths.get(caminhoArquivo));

            for (String linha: linhas){
                String[] vetor = linha.split(";");
                Boleto boleto = processarLinha(vetor);
                listaBoletos.add(boleto);
            }

            return listaBoletos;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    protected abstract Boleto processarLinha(String[] vetor) throws InterruptedException;
}
