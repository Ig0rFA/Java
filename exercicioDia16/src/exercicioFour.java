import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicioFour {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        DecimalFormat deci = new DecimalFormat("0.00");

        double raio = 0;
        double area = 0;

        System.out.print("Digite o raio em (mm) do seu circulo para obter o raio:");
        raio = ler.nextDouble();

        area = Math.pow(raio,2.0/1.0) * Math.PI;

        System.out.println("Aqui esta a area do seu circulo: "+deci.format(area));
    }
}
