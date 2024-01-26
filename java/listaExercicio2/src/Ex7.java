/*
Crie um programa que calcule e exiba o perímetro (cm) de um círculo, solicitando o raio (cm) ao
usuário. Utilizar a fórmula Perímetro = 2 × π × raio.
Exemplo

Entrada Saída
Raio: 10 Perímetro: 62.8
 */

import java.util.Scanner;

public class Ex7 {
    public static void main(String[]args){

        Scanner ler = new Scanner(System.in);

        double raio, perimetro;

        //ENTRADA
        System.out.print("Digite o raio ");
        raio = ler.nextDouble();

        //PROCESSAMENTO
        perimetro = Math.PI * 2 * raio;

        //SAIDA
        System.out.print("O resultado do seu perimetro é " + perimetro);
    }
}
