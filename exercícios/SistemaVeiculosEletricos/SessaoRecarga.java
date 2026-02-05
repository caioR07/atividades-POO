package sistema;

public class SessaoRecarga {

    private VeiculoEletrico veiculo;
    private Motorista motorista;
    private EstacaoRecarga estacao;
    private double energiaFornecida;

    public SessaoRecarga(VeiculoEletrico veiculo, Motorista motorista, EstacaoRecarga estacao) {
        this.veiculo = veiculo;
        this.motorista = motorista;
        this.estacao = estacao;
    }

    public void iniciarRecarga(double horas) {
        energiaFornecida = estacao.getPotencia() * horas;
        veiculo.recarregar(energiaFornecida);
        System.out.println("Recarga iniciada por " + motorista.getNome());
    }

    public void encerrarRecarga() {
        double custoBase = energiaFornecida * 1.5;
        double custoFinal = motorista.calcularCustoRecarga(custoBase);

        System.out.println("Recarga finalizada.");
        System.out.println("Energia fornecida: " + energiaFornecida + " kWh");
        System.out.println("Custo final: R$ " + custoFinal);
        System.out.println("Bateria atual: " + veiculo.getNivelBateria() + " kWh");
    }
}
