public class biblioteca{
    livro[] livro = new livro[5];
    int i;


public void adicionarLivro(livro objeto){
    livro[this.i]= objeto;
   this.i++;
        

    
}    

public void mostrarLivros(){
    for(int i=0; i<=this.i ; i++){
        if(livro[i] != null){
            livro[i].exibirDetalhes();
        }

    }

}


}
