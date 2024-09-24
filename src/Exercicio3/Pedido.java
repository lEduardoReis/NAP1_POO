package Exercicio3;

public class Pedido {
    private double valorTotal;
    private int numeroDeItens;

    public Pedido(double valorTotal, int numeroDeItens) {
        this.valorTotal = valorTotal;
        this.numeroDeItens = numeroDeItens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getNumeroDeItens() {
        return numeroDeItens;
    }

    public void setNumeroDeItens(int numeroDeItens) {
        this.numeroDeItens = numeroDeItens;
    }

    public void pagar(){
        System.out.println("Pagando " + this.valorTotal + " do pedido");
    }

    public void cancelar(){
        System.out.println("Cancelando pedido com " + this.numeroDeItens + "itens");
    }
}
