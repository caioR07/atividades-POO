package sistema;

public class MotoristaEmpresa extends Motorista {

    public MotoristaEmpresa(String nome) {
        super(nome);
    }

    @Override
    public double calcularCustoRecarga(double valorBase) {
        return valorBase * 0.9;
    }
}
