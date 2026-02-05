
import java.util.List;
import java.util.ArrayList;

public class Teste{
public static void main(String[] args) {
    
    PerfilPagamento p2= new PerfilPagamento("123","caio a rodrigues", "22/25");
    PerfilPagamento p1= new PerfilPagamento("784","caleu pereira", "08/27");
    PerfilPagamento p3= new PerfilPagamento("999","livia alves M", "22/25");
    PerfilPagamento p4= new PerfilPagamento("547","ellon souza", "10/28");

    List<Usuario> lista = new ArrayList<>();

    lista.add(new Aluno("caio","caio@gamil", p2));
    lista.add(new Instrutor("caleu pereira", "cs@gamil", p4));
    lista.add(new Aluno("ellon souza", "ellon@gamil", p1));
    lista.add(new Aluno("livia alves M", "livia@gamil", p3));

    for(Usuario u : lista){
        u.acessarConteudo();
    }
    
    



}
}
