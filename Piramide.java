package Senai_LLP_Variaveis_Geometria;

import java.util.Scanner;
// Faça um algoritmo que leia um numero n e imprima os n primeiros termos da serie de fibonacci
public class Piramide {
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int Forma;
        double N1, N2, N3, N4, Area, Raio;
        System.out.println("Digite o valor do lado da base: ");
        N1 = leia.nextDouble();
        System.out.println("Digite o valor do lado da apótema: ");
        N2 = leia.nextDouble();
        // Calcular a área da base (quadrado)
        N3 = N1 * N1;

        // Calcular a área lateral (4 triângulos)
        N4 = 4 * (N1 * N3 / 2);

        // Calcular a área total
        Area = N3 * N4;
        System.out.println("Area da Piramide é: " + Area);

    }
}