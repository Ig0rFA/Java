/*
Faça um fluxograma e um programa utilizando a linguagem Java que leia um número inteiro e
imprima o seu antecessor e o seu sucessor.
Exemplo

Entrada Saída

Número: 10 Antecessor: 9
Sucessor: 11
 */

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int num;
        int antecessor;
        int sucessor;

        //ENTRADA
        System.out.print("Digite um numero ");
        num = ler.nextInt();

        //PROCESSAMENTO
        antecessor = num -1;
        sucessor = num +1;

        //SAIDA
        System.out.print("Seu antecessor é " + antecessor + );
        System.out.print("O seu sucessor é " + sucessor );

    }
}
