import com.manoelcampos.desconto.Venda;

import java.time.LocalDate;

public abstract class DescontoAniversario implements EstrategiaDesconto {
    public double calcular(Venda venda) {
        LocalDate hoje = LocalDate.now();
        Class<?> aniversario = venda.getCliente().getClass();

        return 0;
    }
    }
