public class PerfilPagamento {
    private String numeroCartao;
    private String nomeCartao;
    private String dataValidade;

    PerfilPagamento(String numeroCartao,String nomeCartao, String dataValidade){
        this.numeroCartao= numeroCartao;
        this.nomeCartao = nomeCartao;
        this.dataValidade = dataValidade;
    }

    public void processarPagamento(double valor){
        System.out.println("processando pagamengo no valor de " + valor);
    }
    
}
