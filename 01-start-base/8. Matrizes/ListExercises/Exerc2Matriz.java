
import java.util.Random;

/*2. Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0-9. Após isso indique qual é o maior e o menor valor da linha 5 e qual é o maior e o menor valor da coluna 7.  */
public class Exerc2Matriz{
    public static void main(String[] args) {
        int[][] m = new int[10][10];

        //Gerar valores
        Random numAleatorios = new Random();

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = numAleatorios.nextInt(50);
            }
        }
        //Ver matriz gerada
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        int maiorL5 = 0;
        int menorL5 = 51;
        int maiorC7 = 0;
        int menorC7 = 51;
        //Maior e menor valor da linha 5
        for(int i = 0; i < m[5].length; i++){ //linha fixa
            if (m[5][i] > maiorL5){ //colunas variáveis
                maiorL5 = m[5][i];
            }
            if (m[5][i] < menorL5){
                menorL5 = m[5][i];
            }
        }

        //Maior e menor valor da Coluna 7
        for(int i = 0; i < m.length; i++){//linhas variáveis e coluna fixa
            if (m[i][7] > maiorC7){
                maiorC7 = m[i][7];
            }
            if (m[i][7] < menorC7){
                menorC7 = m[i][7];
            }
        }        

        System.out.println("Maior linha 5: " + maiorL5);
        System.out.println("Menor linha 5: " + menorL5);

        System.out.println("Maior coluna 7: " + maiorC7);
        System.out.println("Menor coluna 7: " + menorC7);
    }
}