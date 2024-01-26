/*
3. Escreva um programa que usuário escolha um dos cálculos aritméticos (soma, subtração,
multiplicação e divisão), digite dois números decimais e apresente o resultado.
Obs. Caso o usuário escolha a opção Divisão, o programa deve verificar se divisor (segundo
número) não é igual a zero, se for apresentar a mensagem “Não é possível efetuar a divisão.”

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

public class Exercicio3 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        double resultado = 0.0;

        System.out.println("********* Calculadora ********* ");
        System.out.println("1 - Soma ");
        System.out.println("2 - Subtração ");
        System.out.println("3 - Multiplicação ");
        System.out.println("4 - Divisão ");

        System.out.println("Escolha uma opção ");
        int opcao = ler.nextInt();
        System.out.println("Digite o primeiro número ");
        double num1 = ler.nextDouble();
        System.out.println("Digite o segundo número ");
        double num2 = ler.nextDouble();

        switch (opcao) {
            case 1:
               resultado = num1 + num2;
               System.out.println("A soma é " + resultado);
               break;
            case 2:
                resultado = num1 - num2;
                System.out.println("A subtração é " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("A multiplicação é " + resultado);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Não é possivel efetuar a operção ");
                } else {
                    resultado = num1 / num2;
                    System.out.println("A divisão é " + resultado);
                }
                break;
            default:
                System.out.println("Opção invalida ");
        }

    }
}
