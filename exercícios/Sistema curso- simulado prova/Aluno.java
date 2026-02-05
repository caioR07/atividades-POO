public class Aluno extends Usuario implements Certificavel{
    
    Aluno(String nome, String email, PerfilPagamento pagamento){
        super(nome, email, pagamento);
    }
   
    @Override
    public void acessarConteudo() {
        System.out.println("aluno " + getNome() + "acessando materiais do curso...");
    
    }
    public void inscricao_curso(String nomeCurso){
        System.out.println("o aluno" + getNome() + "se insvreveu no curso " + nomeCurso );

    }

    public void emitirCertificado(String curso){
        System.out.println("emitindo certificado ao aluno: " + getNome() +  " sobre a conclusão do curso " + curso);
    }

    public double calcularProgresso(String curso){
        System.out.println("imppletação do calculo");
        return 6/2;
    }
}

interface Certificavel{

    void emitirCertificado(String curso); 

    double calcularProgresso(String curso);
}