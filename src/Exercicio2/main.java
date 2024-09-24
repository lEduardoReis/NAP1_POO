package Exercicio2;

public class main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(30, 3);
        pedido1.retornaValores();

        System.out.println("----------------------------------------------------------------------------------------------");

        PropriedadeRural propriedadeRural = new PropriedadeRural("Campos", 2000, "Eduardo");
        propriedadeRural.retornaValores1();
    }
}
