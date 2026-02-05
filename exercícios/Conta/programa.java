class programa {
	public static void main(String[] args){
		Conta minhaConta;
		minhaConta = new Conta();
		minhaConta.dono = "duke";
		minhaConta.saldo = 1000;
		
		Conta minhaConta2 = new Conta;
		minhaConta2.dono = "jose";
		minhaConta2.saldo = 3000.0;
		
		minhaConta.transfere(minhaConta2 , 200);
		
		if(minhaConta.saca(1200))
			System.out.println(" Saque realizado com sucesso ");
		else{
			System.out.println(" Saldo insuficente");}
		minhaConta.deposita(500);
		System.out.println(" O saldo atual : " + minhaConta.saldo);

}
}