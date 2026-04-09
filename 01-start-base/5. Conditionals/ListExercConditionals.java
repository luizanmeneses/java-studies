import java.util.Scanner;

public class ListExercConditionals{
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        scan.useLocale(java.util.Locale.US);

        //1. Faça um Programa que peça dois números e imprima o maior deles
        /*System.out.println("Digite 2 números: ");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        if (n1 > n2){
            System.out.println("O maior é o n1: " + n1);
        }else {
            System.out.println("O maior é o n2: " + n2);
        }*/

        //2. Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo. 
        /*System.out.println("Digite um valor: ");
        int valor = scan.nextInt();
        if (valor > 0){
            System.out.println("O valor é Positivo");
        }else if (valor == 0) {
            System.out.println("O valor é Neutro");
        }else {
            System.out.println("O valor é Negativo");
        }*/

        //3. Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido. 
        /*System.out.println("Digite o sexo (F ou M): ");
        String sexo = scan.next();
        if (sexo.equalsIgnoreCase("F")){
            System.out.println("F - Feminino");
        }else if (sexo.equalsIgnoreCase("M")){
            System.out.println("M - Masculino");
        }else {
            System.out.println("Sexo inválido!");
        }*/

        //4. Faça um Programa que verifique se uma letra digitada é vogal ou consoante. 
        //Solução com if-else
        /*System.out.println("Digite uma letra");
        String letra = scan.next();
        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
            System.out.println("Vogal");
        }else {
            System.out.println("Consoante");
        }

        //Solução com switch-case
        switch(letra){
            case "a", "e", "i", "o", "u" -> System.out.println("Vogal");
            default -> System.out.println("Consoante");

        }*/

        //5. Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar: 
            //o A mensagem "Aprovado", se a média alcançada for maior ou igual a sete; 
            //o A mensagem "Reprovado", se a média for menor do que sete; 
            //o A mensagem "Aprovado com Distinção", se a média for igual a dez. 

            /*double nota1;
            double nota2;

            System.out.println("Indique as 2 notas do aluno: ");
            nota1 = scan.nextDouble();
            nota2 = scan.nextDouble();

            double media = (nota1 + nota2) / 2;

            if (media >= 7){
                System.out.println("Aprovado");
            }else if (media == 10){
                System.out.println("Aprovado com Distinção");
            }else{
                System.out.println("Reprovado");
            }*/
        
        //6. Faça um Programa que leia três números e mostre o maior deles.

        System.out.println("Digite os 3 nums: ");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();

        if(n1 > n2 && n1 > n3){
            System.out.println("O n1 " + n1 + " é o maior");
        }else if (n2 > n1 && n2 > n3){
            System.out.println("O n2 " + n2 + " é o maior");
        }else if (n1 == n2 && n1 == n3){
            System.out.println("Os 3 nums são iguais ");
        }
        
        else{
            System.out.println("O n3 " + n3 + " é o maior");
        }
    }
}