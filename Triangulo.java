package Senai_LLP_Variaveis_Geometria;

import java.util.Scanner;
// Faça um algoritmo que leia um numero n e imprima os n primeiros termos da serie de fibonacci
public class Triangulo {
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int Forma;
        double N1, N2, Area, Raio;
        System.out.println("Digite o valor da base do triângulo: ");
        N1 = leia.nextDouble();
        System.out.println("Digite o valor da altura do triângulo: ");
        N2 = leia.nextDouble();
        Area = (N1 * N2)/2;
        System.out.println("Area do triângulo é: " + Area);

    }
}