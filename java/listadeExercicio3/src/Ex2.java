/*
10. Escreva um programa que calcule o perímetro e a área de um retângulo.

Exemplo

Entrada Saída

Largura: 5
Comprimento: 7

Perímetro: 24
Área: 35
 */

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int largura, comprimento, perimetro, area;

        System.out.print("Digite a largura do retangulo ");
        largura = ler.nextInt();
        System.out.print("Digite o comprimento do retangulo ");
        comprimento = ler.nextInt();

        perimetro = largura + largura + comprimento + comprimento;
        area = largura * comprimento;

        System.out.print("O valor do perimetro é " + perimetro + "\ne a area é " + area);
    }
}
