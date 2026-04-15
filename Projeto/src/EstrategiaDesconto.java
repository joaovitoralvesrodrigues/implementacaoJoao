import com.manoelcampos.desconto.Venda;

public interface EstrategiaDesconto {
    double calcular(Venda venda);
}
