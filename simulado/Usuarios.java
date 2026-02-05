public class Usuarios {
    private String nome; 
    private Livros[] emprestimos=new Livros[10];
   


public Usuarios(String nome){
    this.nome=nome;
}


public void setlivro(Livros livro){
    for(int i=0; i < emprestimos.length; i++){
        if(emprestimos[i] == null){
            emprestimos[i]= livro;
            System.out.println("Um livro foi emprestado: autor: " + livro.getautor() + "; " +  livro.getlivro());
            return;
        }

    }
    System.out.println("você já atingiu o limite de livros");

}

public void devolverLivro(Livros livros){
    for(int i=0; i < emprestimos.length; i++){
        if(emprestimos[i] == livros){
            emprestimos[i]= null;
            return;
        }
    }
}
}