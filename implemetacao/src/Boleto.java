import java.time.LocalDate;

public class Boleto {
    private int id;
    private String codBanco;
    private LocalDate dataVencimento;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getCodBanco() { return codBanco; }
    public void setCodBanco(String codBanco) { this.codBanco = codBanco; }

    public LocalDate getDataVencimento() { return dataVencimento; }
    public void setDataVencimento(LocalDate dataVencimento) { this.dataVencimento = dataVencimento; }

    @Override
    public String toString() {
        return String.format("ID: %02d | Banco: %s | Vencimento: %s", id, codBanco, dataVencimento);
    }
}