/*
    Descrição do exercicio
    Faça um programa que solicite a idade de uma pessoa e
    exiba se ela é maior de idade ou não
 */

import java.util.Scanner;

public class ExCondicional1 {
    public static void main(String[] args){

        //Instanciando um objeto da classe Scanner
        Scanner entrada = new Scanner(System.in);

        //Entrada de dados
        System.out.print("Digite sua idade ");
        int idade = entrada.nextInt();

        //Teste condicional
        if (idade >= 18){ //Se idade for maior ou igual a 18
            System.out.print("Você é maior de idade "); //Resposta de verdadeiro
        } else { //Senão - Caso contrario
            System.out.print("Você é menor de idade"); //Resposta se falso
        }

    }

}
