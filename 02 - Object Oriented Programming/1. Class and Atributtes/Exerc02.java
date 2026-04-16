//2. Crie uma classe Livro que represente os dados básicos de um livro, sem se preocupar com a sua finalidade.

public class Exerc02{
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.titulo = "Seu nome é Jesus";
        livro.autor = "Max Lucado";
        livro.anoLancamento = 2000;
        livro.qtdPags = 100;

        System.out.println("Meu livro preferido é: " + livro.titulo + " de " + livro.autor);
    }
}