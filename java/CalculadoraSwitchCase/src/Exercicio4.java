/*
4. Escreva um programa que usuário digite escolha uma das figuras geométricas e apresente a
sua área. Utilize a imagem 3 para montar as fórmulas. Utilize a condicional if-else.
 */

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){

        Scanner ler = Scanner(System.in);

        double resultado = 0.0;

        System.out.println("***********************");
        System.out.println("** ÁREA - FIGURA - GEOMÉTRICA**");
        System.out.println("***********************");
        System.out.println("1 -> TRIANGULO ");
        System.out.println("2 -> QUADRADO ");
        System.out.println("3 -> LOSANGO ");
        System.out.println("4 -> RETANGULO ");
        System.out.println("5 -> TRAPÉZIO ");
        System.out.println("6 -> CIRCULO ");
        System.out.println("\n***********************");

        System.out.println("Digite uma opção ");
        int opcao = ler.nextInt();

    }
}
