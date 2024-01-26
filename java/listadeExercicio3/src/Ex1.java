/*
Escreva um programa que calcule o delta de uma equação de segundo grau.
Fórmula: ∆ = b
2 − 4ac
 */

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int a, b, c, delta;

        System.out.print("Digite o valor A ");
        a = ler.nextInt();
        System.out.print("Digite o valor B ");
        b = ler.nextInt();
        System.out.print("Digite o valor C ");
        c = ler.nextInt();

        delta = b * b - 4 * a * c;

        System.out.print("O resultado do delta é " + delta );

    }
}
