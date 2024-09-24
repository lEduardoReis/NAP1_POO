package Exercicio3;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(30, 3);
        pedido.pagar();
        pedido.cancelar();
        System.out.println("------------------------------------");
        PropriedadeRural propriedadeRural = new PropriedadeRural("Campos abertos", 20000, "Eduardo");
        propriedadeRural.adubar();
        propriedadeRural.plantar();
    }
}