public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        biblioteca ifba= new biblioteca();
        
        livro livro1= new livro();
        livro1.titulo = "Dom Casmurro";
        livro1.autor = "Machado de Assis";
        livro1.anoPublicacao = 1899;

        livro livro2= new livro();
        livro2.titulo = "caio rodrigues";
        livro2.autor= "caio almeida";
        livro2.anoPublicacao= 2025;

        ifba.adicionarLivro(livro1);
        ifba.adicionarLivro(livro2);

        ifba.mostrarLivros();


    }
}
