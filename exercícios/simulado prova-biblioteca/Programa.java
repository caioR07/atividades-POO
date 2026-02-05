public class Programa {
    public static void main(String[] args) {
        Biblioteca ifba = new Biblioteca();
        ifba.cadastrarLivro("Marco aurélio", "dicionario");
        ifba.cadastrarLivro("caio", "nem eu sei");
        ifba.cadastrarLivro("silas", "malacarne");
        Biblioteca.totalLivros();
        ifba.totalAcervo();
        Usuarios caio = new Usuarios("caio");
        ifba.emprestar(caio, 1);



    }
}