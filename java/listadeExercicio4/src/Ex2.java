/*
2. Faça um programa que leia um número e informe se ele é par ou ímpar.

Exemplo

Entrada Saída
Número: 10 Mensagem: O número é par
Número: 3 Mensagem: O número é ímpar
 */

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int  num;

        System.out.print("Digite um número ");
        num = ler.nextInt();

        if (num % 2 == 0)
            System.out.print("Esse número é par ");
        else
            System.out.print("Esse número é impar ");

    }
}
