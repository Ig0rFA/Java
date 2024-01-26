/*
4. Faça um programa que leia as notas de duas provas, calcule a média aritmética simples, e
informe se o aluno foi aprovado (média maior ou igual a 6) ou reprovado (média menor que 6).

Exemplo

Entrada Saída

Prova 1: 8
Prova 2: 7

Média: 7.5
Status: Aprovado

Prova 1: 3
Prova 2: 5

Média: 4.0
Status: Reprovado
 */

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] arsg){

        Scanner entrada = new Scanner(System.in);

        double res;

        System.out.print("Digite a primeira nota ");
        double num1 = entrada.nextDouble();
        System.out.print("Digite a segunda nota ");
        double num2 = entrada.nextDouble();

        res = (num1 + num2) / 2.0;

        if (res >= 6){
            System.out.print("Sua media é " + res + "\nvocê foi aprovado ");
        } else {
            System.out.print("Sua media é " + res + "\nVocê foi reprovado ");
        }

    }
}
