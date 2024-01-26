import java.util.Scanner;

public class ExemploCalculadora1 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double resultado = 0.0;

        System.out.println("*******************************");
        System.out.println("*          Calculadora        *");
        System.out.println("*******************************");
        System.out.println("\n1 - Adicão");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multlicação");
        System.out.println("4 - Divisão");
        System.out.println("\n*******************************");
        System.out.print("\nDigite a opção desejada: ");
        int opcao = ler.nextInt();
        System.out.println("\n*******************************");
        System.out.print("\nDigite o primeiro número: ");
        double num1 = ler.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = ler.nextDouble();
        System.out.println("\n*******************************");

        //DESVIO CONDICIONAL - IF/ELSE IF/ELSE
        if(opcao == 1) { //Se opção for igual a 1 -> Adição
            resultado = num1 + num2;
            System.out.println("O resultado da adição é " + resultado);
        } else if (opcao == 2) { //Se opção for igual a 2 -> subtração
            resultado = num1 - num2;
            System.out.println("O resultado da subtração é " + resultado);
        } else if (opcao == 3) { //Se opção for igual a 3 -> Multiplicação
            resultado = num1 * num2;
            System.out.println("O resultado da multiplicação é " + resultado);
        } else if (opcao == 4) { //Se opção for igual a 4 -> Divisão
            if (num2 == 0){
                System.out.println("Não é possivel efetuar a divisão. ");
            } else {
                resultado = num1 / num2;
                System.out.println("O resultado da divisão é " + resultado);
            }
        } else { //Se não for nehuma das opcões apresentará a msg abaixo
            System.out.println("Opção invalida. ");
        }

    }
}
