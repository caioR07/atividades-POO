package sistema;

public class MotoristaPessoaFisica extends Motorista {

    public MotoristaPessoaFisica(String nome) {
        super(nome);
    }

    @Override
    public double calcularCustoRecarga(double valorBase) {
        return valorBase;
    }
}
