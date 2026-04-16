
import java.util.Scanner;

public class Exerc03{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();
        System.out.println("Nome aluno: ");
        aluno.nome = scan.next();

        System.out.println("Nome Curso: ");
        aluno.curso = scan.next();

        System.out.println("Matrícula: ");
        aluno.matricula = scan.next();

        aluno.disciplinas = new String[3]; //pode fazer isso aqui ou lá na classe.
        for (int i = 0; i < aluno.disciplinas.length; i++){
            System.out.println("Nome Disciplina " + (i+1) + ": ");
            aluno.disciplinas[i] = scan.next();
        }

        for (int i = 0; i < aluno.notas.length; i++){
            System.out.println("Obtendo notas da disciplina " + aluno.disciplinas[i]);
            for (int j = 0; j < aluno.notas[i].length; j++){
                System.out.println("Nota: " + (j+1));
                aluno.notas[i][j] = scan.nextDouble();
            }
        }
        aluno.mostrarInfo();
    }
}