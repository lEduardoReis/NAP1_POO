package Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o sabor da pizza: ");
        pizza.setSabor(sc.next());
        System.out.println("Digite quanto tempo de preparo");
        pizza.setTempo(sc.nextInt());


        pizza.printPizza();
    }
}
