/*
Escreva um programa que calcule a média geométrica entre três números informados pelo
usuário. Utilize o tipo de dados double.
Fórmula da média geométrica: √num1 × num2 × num3

3

-> (num1 × num2 × num3)
1
3

Função para calcular potências: Math.pow(num1 * num2 * num3, 1.0/3.0)

Exemplo

Entrada Saída

Número 1: 20
Número 2: 5
Número 3: 8

Média Geométrica: 9.283177
 */

import java.util.Scanner;

public class Ex6 {
    public static void main(String[]args){

        Scanner ler = new Scanner(System.in);

        double num1, num2, num3, geo;

        //ENTRADA
        System.out.print("Digite o primeiro número ");
        num1 = ler.nextDouble();
        System.out.print("Digite o segundo número ");
        num2 = ler.nextDouble();
        System.out.print("Digite o terceiro número ");
        num3 = ler.nextDouble();

        //PROCESSAMENTO
        geo = Math.pow(num1 * num2 * num3, 1.0/3.0);

        //SAIDA
        System.out.print("A sua media Geométrica é " + geo);

    }
}
