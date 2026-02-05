class Conta{
	int numero;
	String dono;
	double saldo;
	double limite;


	void deposita(double quantidade){
		this.saldo += quantidade;
	}
	boolean saca(double quantidade){
		if(this.saldo > quantidade){
			this.saldo -= quantidade;
			return true;
		}else{
			return false; }
		
	}

	void transfere(Conta destido , double valor){
		this.saldo-=valor;
		destino.saldo+=valor;

	}
	


}