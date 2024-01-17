import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicioTre {
    public static void main(String[] args) {

            Scanner ler = new Scanner(System.in);

            DecimalFormat deci = new DecimalFormat("0.0");

            double raio = 0;
            double perimetro = 0;

        System.out.print("Digite o raio (cm) do seu circulo:");
        raio = ler.nextDouble();

        perimetro = (2 * Math.PI * raio);

        System.out.println("Aqui esta o perimetro do seu circulo: "+deci.format(perimetro));
        }
    }
