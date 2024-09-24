package Exercicio1;

public class Pizza {
    private String sabor;
    private int tempo;


    public String getSabor() {
        return this.sabor;
    }
    public int getTempo() {
        return this.tempo;
    }
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public void printPizza() {
        System.out.println("Sabor: " + this.sabor);
        System.out.println("Tempo de preparo: " + this.tempo + " Minutos");
    }
}
