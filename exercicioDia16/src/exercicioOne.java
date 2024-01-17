import java.util.Scanner;

public class exercicioOne {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double num1 = 0;
        double num2 = 0;
        double soma = 0;
        double mult = 0;
        double div = 0;
        double sub = 0;

        System.out.print("Digite o primeiro numero:");
        num1 = ler.nextDouble();

        System.out.print("Digite o segundo numero:");
        num2 = ler.nextDouble();

        soma = (num1 + num2);
        sub = (num1 - num2);
        mult = (num1 * num2);
        div = (num1 / num2);

        System.out.println("[1]Soma: "+soma+"\n[2]Subtração: "+sub+"\n[3]Multiplicação: "+mult+"\n[4]Divisão: "+div);
        }
    }
