/*
Escreva um programa que solicite ao usuário dois números e exiba a soma, subtração,
multiplicação e divisão entre eles. Utilize o tipo de dados double.

Exemplo

Entrada Saída

Número 1: 10
Número 2: 5,2

Soma: 15.2
Subtração: 4.8
Multiplicação: 52
Divisão: 1.92
 */

import java.util.Scanner;

public class Ex5 {
    public static void main(String[]args){

        Scanner ler = new Scanner(System.in);

        double num1, num2, soma, sub, mult, div;

        //ENTRADA
        System.out.print("Digite o primeiro número");
        num1 = ler.nextDouble();
        System.out.print("Digite o segundo número");
        num2 = ler.nextDouble();

        //PROCESSAMENTO
        soma = num1 + num2;
        sub = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;

        //SAIDA
        System.out.print("A soma do seu resultado é " + soma + "\na Subtração é " + sub + "\na Multiplicação é " + mult + "\ne a Divisao é " + div);
    }
}
