public class Exerc02{
    public static void main(String[] args) {
        ContaCorrente contaMaria = new ContaCorrente();

        contaMaria.numero = 12345;
        contaMaria.saldo = -10;
        contaMaria.especial = true;
        contaMaria.limiteEspecial = 100;
        contaMaria.valorEspecialUsado = 0;

        boolean saqueEfetuado = contaMaria.realizarSaque(100);

        if (saqueEfetuado){
            System.out.println("Saque efetuado com sucesso");
            System.out.println("Saldo atual da conta: R$ " + contaMaria.saldo);
        }else {
            System.out.println("Saldo insuficiente");
        }

        /*contaMaria.realizarDeposito(500);
        System.out.println("Saldo atual da conta: R$ " + contaMaria.saldo);*/

        contaMaria.consultarSaldo();

        if (contaMaria.verificarUsoChequeEspecial()){
            System.out.println("Cheque especial em uso.");
        }else{
            System.out.println("Não está em uso o cheque especial.");
        }

       
    }
}