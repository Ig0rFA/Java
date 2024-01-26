/*
Se o valor digitado pelo usuario for maior ou igual a 100, apresentar
a mensagem valor alto.
Caso contrário, apresentar a mensagem Valor baixo.
 */


import java.util.Scanner;

public class ExemploCondicional2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numInteiro = entrada.nextInt();

        //Desvio condicional
        if(numInteiro >= 100){ //Se o valor for maior ou igual a 100
            System.out.print("Valor alto."); //Rsposta se verdadeiro
        } else { //Senão - Caso contrário
            System.out.print("Valor baixo"); //Resposta se falso
        }
    }
}
