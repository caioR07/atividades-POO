package sistema;

public class Main {

    public static void main(String[] args) {

        VeiculoEletrico carro = new VeiculoEletrico("Tesla Model 3", 75);
        Motorista motorista = new MotoristaEmpresa("Carlos Silva");
        EstacaoRecarga estacao = new EstacaoRecarga("Shopping Center", 50);

        carro.deslocar(100);

        SessaoRecarga sessao = new SessaoRecarga(carro, motorista, estacao);
        sessao.iniciarRecarga(1.5);
        sessao.encerrarRecarga();
    }
}
