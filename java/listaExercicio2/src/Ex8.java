import java.util.Scanner;

/*
Escreva um programa que calcule a área (mm2) de um círculo a partir do raio (mm), utilizando a
fórmula Área = π × raio2
.

Exemplo

Entrada Saída

Raio: 8,5 Área: 226.98
 */
public class Ex8 {
    public static void main(String[]args){

        Scanner ler = new Scanner(System.in);

        double raio, area;

        //ENTRADA
        System.out.print("Digite o raio ");
        raio = ler.nextDouble();

        //PROCESSAMENTO
        area = Math.PI * raio * raio;
        //area = Math.PI*Math.pow(raio,2.0);

        //SAIDA
        System.out.printf("A aréa do seu raio é %.2f ",area);
    }
}
