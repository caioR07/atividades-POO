public class Carro {
   private String modelo;
   private String marca;
   private int ano;
   private int codigo;
   private Boolean status;

   public Carro(String modelo, String marca, int ano, int codigo){
        this.modelo= modelo;
        this.marca= marca;
        this.ano= ano;
        this.codigo=codigo;
        this.status=true;
   }

   public String pegarmodelo(){
         return this.modelo;
   }

}
