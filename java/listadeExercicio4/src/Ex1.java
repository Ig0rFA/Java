/*
1. Faça um programa que leia dois números e informe qual é o maior.

Exemplo

Entrada Saída

Número 1: 20
Número 2: 5

Mensagem: O primeiro número é maior

Número 1: 2
Número 2: 10

Mensagem: O segundo número é maior
 */

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int num1, num2;

        System.out.print("Digite o primeiro número ");
        num1 = ler.nextInt();
        System.out.print("Digite o segundo número ");
        num2 = ler.nextInt();

        if (num1 > num2)
            System.out.print("O número maior é " + num1);
        else
            System.out.print("O número maior é " + num2);

    }
}
