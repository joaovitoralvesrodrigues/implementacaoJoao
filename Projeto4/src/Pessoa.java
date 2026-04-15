public abstract class Pessoa {
    public final double calcularTotalImpostos(){
        return calcularIR() + calcularTotalImpostos();
    }

    protected abstract double calcularIR();
    protected abstract double calcularOutrosImpostos();
}
