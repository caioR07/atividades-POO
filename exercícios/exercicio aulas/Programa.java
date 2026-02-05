class Programa {
	public static void main(String[] args) {
		Conta minhaConta;
		Cliente cliente01 = new Cliente("duke", "da silva", "123.456.789-84");
		minhaConta = new Conta(cliente01);
		
		minhaConta.deposita(1000.0);
		System.out.println("nome: " + minhaConta.get);
		if(minhaConta.saca(1200))
			System.out.println("Sucesso");
		else
			System.out.println("Saldo insuficiente.");
		Conta minhaConta2;
		minhaConta2 = new Conta("joão", "rocha", "132.547.252-74");
		minhaConta2.deposita(100.0);
		System.out.println("nome: " + minhaConta2.getNomeCliente());
		
		if(minhaConta.transfere(minhaConta2, 1500))
			System.out.println("Transferência Sucesso");
		else
			System.out.println("Saldo insuficiente para transferência.");

		
	}
 }
