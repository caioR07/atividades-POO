public class Cliente {
   private String nome;
   private Carro[] garagem= new Carro[3];







   public alugueis(Carro carro){
     for(int i=0; i < garagem.length ; i++){
            if(garagem[i] == null){
                garagem[i]= carro;
                return;
            }
   }



}
