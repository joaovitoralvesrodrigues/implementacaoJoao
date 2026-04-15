import java.time.LocalDate;

/**
 * Representa um boleto bancário no sistema para processamento de retorno.
 */
public class Boleto {
    private int id;
    private String codBanco;
    private String agencia;
    private String conta;
    private String nossoNumero;
    private LocalDate dataVencimento;
    private LocalDate dataPagamento;
    private double valor;
    private double juros;
    private double multa;
    private String nossonumero;

    // Construtor padrão
    public Boleto() {}

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getCodBanco() { return codBanco; }
    public void setCodBanco(String codBanco) { this.codBanco = codBanco; }

    public String getAgencia() { return agencia; }
    public void setAgencia(String agencia) { this.agencia = agencia; }

    public String getConta() { return conta; }
    public void setConta(String conta) { this.conta = conta; }

    public String getNossoNumero() { return nossonumero; }
    public void setNossoNumero(String nossoNumero) { this.nossoNumero = nossoNumero; }

    public LocalDate getDataVencimento() { return dataVencimento; }
    public void setDataVencimento(LocalDate dataVencimento) { this.dataVencimento = dataVencimento; }

    public LocalDate getDataPagamento() { return dataPagamento; }
    public void setDataPagamento(LocalDate dataPagamento) { this.dataPagamento = dataPagamento; }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    public double getJuros() { return juros; }
    public void setJuros(double juros) { this.juros = juros; }

    public double getMulta() { return multa; }
    public void setMulta(double multa) { this.multa = multa; }

    @Override
    public String toString() {
        return String.format(
                "Boleto{ID=%d, Banco='%s', Ag=%s, Conta=%s, Valor=R$%.2f, Vencimento=%s}",
                id, codBanco, agencia, conta, valor, dataVencimento
        );
    }

    public void setCpfCliente(String s) {
    }
}