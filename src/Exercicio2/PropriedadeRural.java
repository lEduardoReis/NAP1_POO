package Exercicio2;

public class PropriedadeRural {
    private String nome;
    private double area;
    private String proprietario;

    public PropriedadeRural(String nome, double area, String proprietario) {
        this.nome = nome;
        this.area = area;
        this.proprietario = proprietario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public void retornaValores1(){
        System.out.println(this.area);
        System.out.println(this.proprietario);
        System.out.println(this.nome);
    }
}
