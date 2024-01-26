/*
Faça um fluxograma e um programa utilizando a linguagem Java que leia um número real e
imprima 1⁄4 deste número.

Exemplo

Entrada Saída

Número: 100.0 Resultado: 25
Número: 6 Resultado: 1.5
 */

import java.util.Scanner;

public class Ex4 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        double num, res;

        //ENTRADA
        System.out.print("Digite um número real ");
        num = ler.nextDouble();

        //PROCESSAMENTO
        res = num / 4;

        //SAIDA
        System.out.print("O valor de um quarto é " + res  );
    }
}
