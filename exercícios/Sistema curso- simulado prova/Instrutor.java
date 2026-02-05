public class Instrutor extends Usuario {
    Instrutor(String nome, String email, PerfilPagamento pagamento){
        super(nome,email,pagamento);
    }

    @Override
    public void acessarConteudo() {
        System.out.println("o instrutor " + getNome() + "está acessando o painel de criação" );
        
    }

    public void criarCurso(String nomeCurso){
        System.out.println("o instrutor " + getNome() + " criou o curso: " + nomeCurso);
    }
    
}


