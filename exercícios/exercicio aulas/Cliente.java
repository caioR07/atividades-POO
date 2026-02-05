class Cliente{
 	private String nome;
	private String sobrenome;
	private String cpf;

	public Cliente(String nomeCliente, String sobrenomecliente, String cpfCliente){
		this.setNome(sobrenomecliente);
		this.setSobrenome(sobrenomecliente);
		this.setcpf(cpfCliente);
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}

	public void setSobrenome(String sobrenome){
		this.sobrenome=sobrenome;
	}
	public String getSobrenome(){
		return this.sobrenome;
	}
	public void setcpf(String cpf){
		this.cpf = cpf;
	}
	public String getcpf(){
		return this.cpf;
	}

}