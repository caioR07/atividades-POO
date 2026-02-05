public class Livros{
    private String autor;
    private String titulo;
    private boolean status;
    private int cod;
    private static int quantidade;


public Livros(String titulo, String autor, int cod){
    this.titulo=titulo;
    this.autor=autor;
    this.status=true;
    Livros.quantidade++;
    this.cod=cod;
}

public int getCodigo(){
    return this.cod;
}
public void alterstatus(boolean status){
    this.status= status;
}

public String getautor(){
    return this.autor;
}

public String getlivro(){
    return this.titulo;
}





}