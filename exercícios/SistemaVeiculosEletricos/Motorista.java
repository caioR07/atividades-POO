package sistema;

public abstract class Motorista {

    protected String nome;

    public Motorista(String nome) {
        this.nome = nome;
    }

    public abstract double calcularCustoRecarga(double valorBase);

    public String getNome() {
        return nome;
    }
}
