import java.time.LocalDate;

public class Produto {
    private final long id;
    private final String codigoEan;
    private final String descricao;
    private final String marca;
    private final String modelo;
    private final double preco;
    private final LocalDate dataCadastro;
    private final LocalDate dataUltimaAtualizacao;
    private final int estoque;
    private final String categoria;
    private final String urlFoto;

    private Produto(Builder builder) {
        this.id = builder.id;
        this.codigoEan = builder.codigoEan;
        this.descricao = builder.descricao;
        this.marca = builder.marca;
        this.modelo = builder.modelo;
        this.preco = builder.preco;
        this.dataCadastro = builder.dataCadastro;
        this.dataUltimaAtualizacao = builder.dataUltimaAtualizacao;
        this.estoque = builder.estoque;
        this.categoria = builder.categoria;
        this.urlFoto = builder.urlFoto;
    }


    public static class Builder {
        private long id;
        private String codigoEan = ""; // Valor padrão não nulo
        private String descricao;
        private String marca;
        private String modelo = "";
        private double preco;
        private final LocalDate dataCadastro = LocalDate.now(); // Regra 4
        private LocalDate dataUltimaAtualizacao;
        private int estoque = 0; // Regra 6
        private String categoria;
        private String urlFoto = "";

        public Builder(long id, String descricao, String marca, double preco, String categoria) {
            this.id = id;
            this.descricao = descricao;
            this.marca = marca;
            this.preco = preco;
            this.categoria = categoria;
        }

        public Builder codigoEan(String codigoEan) {
            this.codigoEan = (codigoEan != null) ? codigoEan : "";
            return this;
        }

        public Builder modelo(String modelo) {
            this.modelo = (modelo != null) ? modelo : "";
            return this;
        }

        public Builder dataUltimaAtualizacao(LocalDate data) {
            this.dataUltimaAtualizacao = data;
            return this;
        }

        public Builder estoque(int estoque) {
            if (estoque < 0) throw new IllegalArgumentException("Estoque não pode ser negativo."); // Regra 6
            this.estoque = estoque;
            return this;
        }

        public Builder urlFoto(String urlFoto) {
            this.urlFoto = (urlFoto != null) ? urlFoto : "";
            return this;
        }

        public Produto build() {

            if (descricao == null || marca == null || categoria == null) {
                throw new IllegalStateException("Atributos obrigatórios (String) não podem ser nulos.");
            }


            if (!modelo.isEmpty() && (marca == null || marca.trim().isEmpty())) {
                throw new IllegalStateException("Não pode ser informado um modelo se não for informada a marca.");
            }


            if (preco <= 0) {
                throw new IllegalStateException("O preço deve ser maior que zero.");
            }

            if (dataUltimaAtualizacao != null && dataUltimaAtualizacao.isBefore(dataCadastro)) {
                throw new IllegalStateException("A data da última atualização não pode ser anterior à data de cadastro.");
            }

            return new Produto(this);
        }
    }


}