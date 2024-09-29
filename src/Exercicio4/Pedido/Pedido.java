package Exercicio4.Pedido;

public class Pedido {
    private double valorTotal;
    private int numeroDeItens;

    public Pedido(double valorTotal, int numeroDeItens) {
        this.valorTotal = valorTotal;
        this.numeroDeItens = numeroDeItens;
    }
    // Método para adicionar um item ao pedido
    public void adicionarItem(Produto item) {
        // Incrementa o número de itens
        this.numeroDeItens++;
        // Incrementa o valor total do pedido com o valor do produto
        this.valorTotal += item.getValor();

        System.out.println("Item '" + item.getNome() + "' adicionado ao pedido.");
        System.out.println("Número de itens: " + this.numeroDeItens);
        System.out.println("Valor total: R$" + this.valorTotal);
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
