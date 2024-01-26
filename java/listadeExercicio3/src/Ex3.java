/*
11. Escreva um programa que calcule a área de um triângulo.
Exemplo

Entrada Saída

Base: 12
Altura: 8

Área: 48
 */

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int base, altura, area;

        System.out.print("Digite a Base de um triangulo ");
        base = ler.nextInt();
        System.out.print("Digite a Altura de um triangulo ");
        altura = ler.nextInt();

        area = base * altura / 2;

        System.out.print("A aréa do triangulo é " + area);

    }
}
