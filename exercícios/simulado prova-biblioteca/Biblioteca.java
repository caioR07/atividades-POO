public class Biblioteca {
    private Livros[] acervo= new Livros[10];
    private String regras;
    private static int total;


    public void cadastrarLivro(String autor,String titulo ){
        int cod=Biblioteca.total++;
        Livros novolivro= new Livros( titulo, autor, cod);

        for(int i=0;i <10; i++){
            if(acervo[i] == null){
                acervo[i]=novolivro;
                System.out.println("livro criado");
                return;
            }
        }

    }

    public void emprestar(Usuarios usuario ,int codigoLivro){
        
        for(int i=0; i < acervo.length; i++){
            if(acervo[i] != null && acervo[i].getCodigo()== codigoLivro){
                acervo[i].alterstatus(false);
                usuario.setlivro(acervo[i]);
                
            }
        }

    }

    public void devolver(Usuarios usuario, int codigoLivro){
        
        for(int i=0; i < acervo.length; i++){
            if(acervo[i].getCodigo()== codigoLivro){
                acervo[i].alterstatus(true);
                usuario.devolverLivro(acervo[i]);
            }
        }
    }

    public void totalAcervo(){
        for(int i=0; i< acervo.length; i++){
            if (acervo[i] != null){
            System.out.println("autor: " + acervo[i].getautor());
            System.out.println("livro: " + acervo[i].getlivro());
            System.out.println("=================");
            }
        }

    }

    public static void totalLivros(){
        System.out.println(" total de livros: " + Biblioteca.total);
    }
    




}
