class Conta {
	private int numero;
	private Cliente cliente;
	private double saldo;
	private double limite;

	public Conta(Cliente cliente){
		this.cliente=cliente;
		
	}

	public Cliente getcliente(){
		return this.cliente;
	
	}

	public void deposita(double quantidade){
		this.saldo += quantidade;
	}

	public boolean saca(double quantidade){
		if(quantidade > this.saldo){
			return false;
		}
		else{
			this.saldo -= quantidade;
			return true;
		}
	}

	public boolean transfere(Conta destino, double valor) {
		if(valor > this.saldo){
			return false;
		}
		else{
			this.saldo -= valor;
			destino.saldo = destino.saldo + valor;
			return true;
		}

	}
	public void setNumero(int numero){
		this.numero = numero;
	}

	public int getNumero(){
		return this.numero;
	}
	
	
	
}
