class programa_pneu{

public static void main(String[] args){
 pneu pirelli;
pirelli= new pneu();
pirelli.indice_velociade= 200.00;
pirelli.tipo_contrucao= "borracha";

System.out.println("velocidade: " + pirelli.indice_velociade);
System.out.println("tipo de pneu: " + pirelli.tipo_contrucao);


}


}