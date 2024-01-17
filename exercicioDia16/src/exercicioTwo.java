import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicioTwo {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        DecimalFormat deci = new DecimalFormat("0.000000");

        double num1 = 0;
        double num2 = 0;
        double num3 = 0;
        double geometrica = 0;

        System.out.print("Digite o primeiro numero:");
        num1 = ler.nextDouble();

        System.out.print("Digite o segundo numero:");
        num2 = ler.nextDouble();

        System.out.print("Digite o terceiro numero:");
        num3 = ler.nextDouble();

        geometrica = Math.pow(num1 * num2 * num3,1.0/3.0);

        System.out.println("Essa e a media Geometrica com os respectivos valores obtidos: "+deci.format(geometrica));

    }
}
