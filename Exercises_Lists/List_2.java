import java.util.Scanner;

public class List_2{
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
        System.out.println("Digite uma letra");
        String letra = scan.next();
        /*if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
            System.out.println("Vogal");
        }else {
            System.out.println("Consoante");
        }*/

        //Solução com switch-case
        switch(letra){
            case "a": 
            case "e":
            case "i":
            case "o":
            case "u": System.out.println("Vogal"); break;
            default: System.out.println("Consoante"); break;

        }
        
    }
}