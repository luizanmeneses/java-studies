/*4. Usando o resultado do modelo “Livro” como base, crie uma classe “LivroDeBiblioteca” que represente os dados básicos de um livro de uma 
biblioteca, que pode ser emprestado a leitores.  */

public class Exerc04{
    public static void main(String[] args) {
        LivroDeBiblioteca biblioteca = new LivroDeBiblioteca();

        biblioteca.titulo = "Um amor para recordar";
        biblioteca.autor = "Nicholas Sparks";
        biblioteca.anoLancamento = 1996;
        biblioteca.qtdPags = 300;
        biblioteca.emprestado = true;
        biblioteca.emprestadoA = "Luiza";
    }
}