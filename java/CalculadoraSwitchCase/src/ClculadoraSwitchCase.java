import java.util.Scanner;

public class ClculadoraSwitchCase {
    public static void main(String[] args) {
        //Instanciando um objeto de classe Scanner
        Scanner ler = new Scanner(System.in);

        //Declarando a variável resultado do tipo decimal
        double resultado = 0.0;

        System.out.println("Calculadora");
        System.out.println("\n1 - Adicão");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        //Solicitando a entrada de dados ao usuário do sistema
        System.out.println("Digite a opção: ");
        int opcao = ler.nextInt();
        System.out.println("\nDigite o primeiro número: ");
        double num1 = ler.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = ler.nextDouble();

        //Comando switch case
        switch (opcao){
            case 1:
                resultado = num1 + num2;
                System.out.println("\nO resultado da soma é " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("\nO resultado da Subtração é " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("\nO resultado da multiplicação é " + resultado);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("\nNão é possivel efetuar a divisão");
                } else {
                    resultado = num1 / num2;
                    System.out.println("\nO resultado da divisão é " + resultado);
                }
                break;
            default:
                System.out.println("\nOpção invalida;");
        }



    }
}
