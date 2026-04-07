import java.util.Scanner;
public class MatrizIrregular{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        //Uma entrevista com diversas pessoas para saber quantidade de filhos e seus nomes

        System.out.println("Número de pessoas que serão entrevistadas: ");
        int numEntrevistados = scan.nextInt();

        String [][] nomesFilhos = new String[numEntrevistados][]; //a quantidade de filhos será preenchida a medida que vão se fazendo as entrevistas

        for (int i = 0; i < nomesFilhos.length; i++){
            System.out.println("Quantidade de filhos: ");
            int qtdFilhos = scan.nextInt();

            //Agora sim criamos a dimensão que faltava pra que o espaço seja alocado na memória
            nomesFilhos[i] = new String[qtdFilhos];

            for (int j = 0; j < nomesFilhos[i].length; j++){
                System.out.println("Nome do filho " + (j+1) + ": ");
                nomesFilhos[i][j] = scan.next();
            }
        }
        for (int i = 0; i<nomesFilhos.length; i++){
            System.out.println("Pessoa " + i + " tem " + nomesFilhos[i].length + " filhos");
            for (int j = 0; j < nomesFilhos[i].length; j++){
                System.out.println(nomesFilhos[i][j]);
            }
        }
    }
}