public class Locadora {

    private Carro[] frota = new Carro[100];
    private static int totalVeiculos;

    public void cadastrarVeiculos(String modelo, String marca, int ano){
        int cod = totalVeiculos++;
        Carro novoCarro = new Carro(modelo, marca , ano, cod );

        for(int i=0; i < frota.length ; i++){
            if(frota[i] == null){
                frota[i]= novoCarro;
                return;
            }

        }

        public void alugar(Cliente cliente, String modelo){
            
             for(int i=0; i < frota.length ; i++){
                if(frota[i].pegarmodelo() == modelo){
                
            }
        }


    }













    public static void regrasGerais(){
        System.out.println("regras gerais: lcmcksdncineicn");
    }

    
}