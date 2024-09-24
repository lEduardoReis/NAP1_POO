package Exercicio2;

public class Pedido {
    private double valorTotal;
    private int numeroDeItens;

    public Pedido(double valorTotal, int numeroDeItens) {
        this.valorTotal = valorTotal;
        this.numeroDeItens = numeroDeItens;
    }

    public void retornaValores(){
        System.out.println(this.valorTotal);
        System.out.println(this.numeroDeItens);
    }
}
