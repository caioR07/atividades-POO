package sistema;

public class VeiculoEletrico {

    private String modelo;
    private double capacidadeBateria;
    private double nivelBateria;

    public VeiculoEletrico(String modelo, double capacidadeBateria) {
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;
        this.nivelBateria = capacidadeBateria * 0.5;
    }

    public void deslocar(double distanciaKm) {
        double consumo = distanciaKm * 0.2;
        if (consumo <= nivelBateria) {
            nivelBateria -= consumo;
            System.out.println("Veículo percorreu " + distanciaKm + " km.");
        } else {
            System.out.println("Bateria insuficiente para o deslocamento.");
        }
    }

    public void recarregar(double energia) {
        nivelBateria = Math.min(nivelBateria + energia, capacidadeBateria);
    }

    public double getNivelBateria() {
        return nivelBateria;
    }

    public String getModelo() {
        return modelo;
    }
}
