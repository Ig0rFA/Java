/*
1. Faça um programa que leia três números, e informe se a soma deles é divisível por 5 ou não.

Exemplo

Entrada Saída

Número 1: 10
Número 2: 2
Número 3: 8

Mensagem: A soma é divisível por 5.

Número 1: 7
Número 2: 2
Número 3: 8

Mensagem: A soma não é divisível por 5.
 */

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        double soma;

        System.out.print("Digite o primeiro número ");
        double num1 = ler.nextDouble();
        System.out.print("Digite o segundo número ");
        double num2 = ler.nextDouble();
        System.out.print("Digite o terceiro número ");
        double num3 = ler.nextDouble();

        soma = num1 + num2 + num3;

        if(soma % 5 ==0){
            System.out.print("A soma é divisivel por 5. ");
        } else{
            System.out.print("A soma não é divisivel por 5. ");
        }
    }
}
