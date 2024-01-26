/*
3. Faça um programa que leia um número e informe se ele é positivo, negativo ou zero.

Exemplo

Entrada Saída
Número: 1 Mensagem: O número é positivo
Número: -4 Mensagem: O número é negativo
Número: 0 Mensagem: O número é zero
 */

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.print("Dgite um número ");
        int num = ler.nextInt();

        if (num > 0){
            System.out.print("Esse número é positivo ");
        } else if (num == 0) {
            System.out.print("Esse número é zero ");
        } else {
            System.out.print("Esse número é negativo ");
        }

    }
}
