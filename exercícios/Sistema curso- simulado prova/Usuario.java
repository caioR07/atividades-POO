public abstract class Usuario{
    private int id;
    private String nome;
    private String email;
    private PerfilPagamento pagamento;
    private static int total_usuarios;

    Usuario(String nome, String email, PerfilPagamento pagamento){
        Usuario.total_usuarios +=1;
        this.id = Usuario.total_usuarios;
        this.nome = nome;
        this.email = email;
        this.pagamento = pagamento;
    }

    public int getId(){
        return this.id;
    }
    public String getNome(){
        return this.nome;
    }
    public String getEmail(){
        return this.email;
    }
    public PerfilPagamento getPagamento(){
        return this.pagamento;
    }
    public void setEmail(String email){
        if (email.contains("@")){
            System.out.println("Email atualizado com sucesso!");
            this.email= email;
        } else {
            System.out.println("Email invalido!");
        }
    }

    public void exibirConteudo(){
        System.out.println("exibindo conteudo para o usuario: " + nome);
    }

    public abstract void acessarConteudo();



}
