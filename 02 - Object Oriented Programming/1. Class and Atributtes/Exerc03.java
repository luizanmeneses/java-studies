/*3. Usando o resultado do exercício anterior como base, crie uma classe “LivroDeLivraria” que represente os dados básicos de um livro que está à 
venda em uma livraria.  */

public class Exerc03{
    public static void main(String[] args) {
        LivroDeLivraria livraria = new LivroDeLivraria();

        livraria.autor = "teste";
        livraria.titulo = "teste";
        livraria.qtdPags = 300;
        livraria.anoLancamento = 2020;
        livraria.preco = 30;
    }
}