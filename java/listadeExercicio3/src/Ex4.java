/*
12. Crie um programa que solicite ao usuário o valor do raio de uma esfera e calcule o seu volume.

Exemplo

Entrada Saída
Raio: 5 Volume: 523,59
 */

import java.util.Scanner;

public class Ex4 {
    public static void main (String[] args){

        Scanner ler = new Scanner(System.in);

        int raio;
        double volume;

        System.out.print("Digite o valor do Raio ");
        raio = ler.nextInt();

        volume = Math.pow(raio,3.0/1.0) * Math.PI * 4.0/3.0;

        System.out.print("O volume do raio é " + volume);

    }
}
