/*
1. Escreva um programa que usuário digite um número inteiro de 1 a 12 e apresente o mês
correspondente, como por exemplo, caso o usuário digite 5, apresente o mês Maio. Utilize a
condicional if-else.
Obs. Teste todas as entradas e verifique se as saídas estão corretas.
 */


import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digie um número de 1 a 12 ");
        int num = ler.nextInt();

        if (num == 1) {
            System.out.println("Janeiro ");
        } else if (num == 2) {
            System.out.println("Fevereiro ");
        } else if (num == 3) {
            System.out.println("Março ");
        } else if (num == 4) {
            System.out.println("Abril ");
        } else if (num == 5) {
            System.out.println("Maio ");
        } else if (num == 6) {
            System.out.println("Junho ");
        } else if (num == 7) {
            System.out.println("Julho");
        } else if (num == 8) {
            System.out.println("Agosto ");
        } else if (num == 9) {
            System.out.println("Setembro ");
        } else if (num == 10) {
            System.out.println("Outrubro ");
        } else if (num == 11) {
            System.out.println("Novembro ");
        } else if (num == 12) {
            System.out.println("Dezembro ");
        } else {
            System.out.println("Número invalido");
        }
    }
}
