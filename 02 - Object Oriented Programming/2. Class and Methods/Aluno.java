/*3. Escreva uma class para representar um Aluno. Adicione atributos relacionados às caracteristicas de um Aluno, como nome, matricula, curso que está matriculado, nome de 
3 disciplinas que está cursando e as notas dessas 3 disciplinas. Desenvolva um método para verificar se o aluno está aprovado (nota maior ou igual a 7) em uma determinada 
disciplina. Escreva um programa para testar essa classe, que pede as informações do aluno ao usuário e ao final informa o nome das disciplinas, mostra as notas e mostra se o 
aluno foi aprovado ou não.  */

public class Aluno{
    String nome;
    String matricula;
    String curso;
    String[] disciplinas;
    double[][] notas = new double[3][4];//3 disciplinas e 4 notas. Pode fazer isso tanto aqui quanto na

    //Methods
    void mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);

        for (int i = 0; i < notas.length; i++){
            System.out.println("Notas disciplina : " + disciplinas[i]);
            for (int j = 0; i < notas[i].length; j++){
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
        }
    }
    /*boolean verificarAprovacao(){
        //
    }*/

}