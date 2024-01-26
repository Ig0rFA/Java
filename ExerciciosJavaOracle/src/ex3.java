import java.util.Scanner;


public class ex3 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int opt;
        int resultado;
        int num1;
        int num2;


        System.out.println("***************************Calculadora******************");
        System.out.println("[1] - Adição\n"+"[2] - Subtração\n"+"[3] - Multiplicação\n"+"[4] - Divisão\n");
        System.out.println("********************************************************");
        System.out.print("Digite o numero da opçação Desejada: ");
        opt = ler.nextInt();
        System.out.println("********************************************************");


        switch (opt){
            case 1:
                System.out.print("Digite o Primeiro Numero: ");
                num1 = ler.nextInt();
                System.out.print("Digite o Segundo Numero: ");
                num2 = ler.nextInt();

                resultado = num1 + num2;

                System.out.println("Resultado da Soma: "+resultado);

                break;
            case 2:
                System.out.print("Digite o Primeiro Numero: ");
                num1 = ler.nextInt();
                System.out.print("Digite o Segundo Numero: ");
                num2 = ler.nextInt();

                resultado = num1 - num2;

                System.out.println("Resultado da Soma: "+resultado);

                break;
            case 3:
                System.out.print("Digite o Primeiro Numero: ");
                num1 = ler.nextInt();
                System.out.print("Digite o Segundo Numero: ");
                num2 = ler.nextInt();

                resultado = num1 * num2;

                System.out.println("Resultado da Soma: "+resultado);

                break;
            case 4:
                System.out.print("Digite o Primeiro Numero: ");
                num1 = ler.nextInt();
                System.out.print("Digite o Segundo Numero: ");
                num2 = ler.nextInt();

                if(num2 == 0){
                    System.out.println("Não foi possivel, Divisor e 0");
                }else {
                    resultado = num1 / num2;

                    System.out.println("Resultado da Soma: "+resultado);}

                break;
        }
    }
}
