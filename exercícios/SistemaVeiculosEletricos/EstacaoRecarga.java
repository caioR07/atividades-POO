package sistema;

public class EstacaoRecarga {

    private String localizacao;
    private double potencia;

    public EstacaoRecarga(String localizacao, double potencia) {
        this.localizacao = localizacao;
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }

    public String getLocalizacao() {
        return localizacao;
    }
}
