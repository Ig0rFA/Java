/*
2. Crie um programa que leia três números e verifique se a soma deles é positiva, negativa ou igual
a zero.

Exemplo

Entrada Saída

Número 1: 9
Número 2: 6
Número 3: 4

Mensagem: A soma é positiva.

Número 1: -9
Número 2: 6
Número 3: -4

Mensagem: A soma é negativa.

Número 1: 9
Número 2: -6
Número 3: -3

Mensagem: A soma é igual a zero.
 */

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int soma;

        System.out.print("Digite o primeiro número ");
        int num1 = ler.nextInt();
        System.out.print("Digite o segundo número ");
        int num2 = ler.nextInt();
        System.out.print("Digite o terceiro número ");
        int num3 = ler.nextInt();

        soma = num1 + num2 + num3;

        if (soma >0){
            System.out.print("A soma é possitiva. ");
        } else if (soma <0) {
            System.out.print("A soma é negativa. ");
        }else {
            System.out.print("A soma é igual a zero. ");
        }
    }
}
