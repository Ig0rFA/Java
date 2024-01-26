/*
    Descricão
    Crie um program que imprima a média aritimetrica de duas
    notas. Utilize o tipo de variável real.

    Lista de Exercício 1 - Ex1
    Data: 12/01/2024
    Programador: Luiz

 */

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
       //INSTANCIANDO E CRIANDO UM OBIJTO SCANNER
        Scanner ler = new Scanner(System.in);

        //DECLARAÇÃO DE VARIÁVEIS
        double nota1, nota2, total, media;

        System.out.println("*********** Lista de Exercícios ***********");

        //ENTRADA DE DADOS
        System.out.print("\n\nDigite a primeira nota ");
        nota1 = ler.nextDouble();

        System.out.print("Digite a segunda nota ");
        nota2 = ler.nextDouble();

        //PROCESSAMENTO
        total = nota1 + nota2;
        media = total / 2.0;

        //SAÍDA DE DADOS
        System.out.println("A média das notas é " + media + ".");
    }
}
