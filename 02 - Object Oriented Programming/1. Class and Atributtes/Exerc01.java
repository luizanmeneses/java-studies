public class Exerc01{
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.modelo = "A60";
        lampada.potencia = 7;
        lampada.cor = "Amarela";
        lampada.marca = "Mercado";
        lampada.tipoAbajur = true;

        lampada.tipos = new String[5];
        lampada.tipos[0] = "Abajur";
        lampada.tipos[1] = "Lampeão";

    }
}