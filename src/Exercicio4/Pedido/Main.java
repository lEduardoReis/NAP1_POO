package Exercicio4.Pedido;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camiseta", 50.0);
        Produto produto2 = new Produto("Calça", 120.0);

        Pedido pedido = new Pedido(0.0, 0);

        // Adicionando itens ao pedido
        pedido.adicionarItem(produto1);  // Camiseta
        pedido.adicionarItem(produto2);  // Calça

        // Pagando o pedido
        pedido.pagar();
    }
}
