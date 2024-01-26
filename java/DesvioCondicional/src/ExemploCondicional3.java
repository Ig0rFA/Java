/*
    Se o valor digitado pelo usuario for maior ou igual 500, apresentar a
    mensagem "valor alto.

    Se o valor digitado pelo usuário for menor que 500 e maior ou
    igual a 100, apresentado a mensagem "Valor médio".

    Se o valor digitado for menor que 100, apresentar a mensagem
    "Valor baixo
 */


import java.util.Scanner;

public class ExemploCondicional3 {
    public static void main(String[] args){

        //Instanciando um objeto da classe Scanner
        Scanner entrada = new Scanner(System.in);

        //Entrada de dados
        System.out.print("Digite um valor ");
        int valor = entrada.nextInt();

        //Teste condicional
        if (valor >=500){ //Se valor for maior ou igual a 500
            System.out.print("Valor alto "); //Resposta de verdadeiro
        } else if (valor >=100 ) { //Se valor for maior ou igual a 100
            System.out.print("Valor médio "); //Resposta de verdadeira
        } else { //Senão - Caso contrario
            System.out.print("Valor baixo"); //Resposta de falso
        }
    }
}
