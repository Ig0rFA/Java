import java.util.Scanner;
import java.lang.Math;

public class ex4 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int opt;

        int baseTri;
        int alturaTri;

        double ladoQuad;

        int diagMaiorLos;
        int diagMenorLos;

        int baseRet;
        int alturaRet;

        int baseMaiorTrap;
        int baseMenorTrap;
        int alturaTrap;

        double raioCirc;

        int resultado;



        do {
            System.out.println("********************************************************");
            System.out.println("************** ÁREA - FIGURAS GEOMÉTRICAS **************");
            System.out.println("********************************************************");

            System.out.println("[1] - Triângulo\n" + "[2] - Quadrado\n" + "[3] - Losango\n" + "[4] - Retangulo\n" + "[5] - Trapézio\n" + "[6] - Círculo\n"+ "\n" + "[0] - Exit\n");
            System.out.println("********************************************************");

            System.out.println("Digite a opção desejada: ");
            opt = ler.nextInt();

            if (opt == 1) {

                System.out.print("Digite a Base: ");
                baseTri = ler.nextInt();
                System.out.print("Digite a Altura: ");
                alturaTri = ler.nextInt();

                resultado = (baseTri*alturaTri)/2;

                System.out.println("Área = "+resultado);

            } else if (opt == 2) {
                System.out.print("Digite o Lado: ");
                ladoQuad = ler.nextInt();

                resultado = (int) Math.pow(ladoQuad,2.0);

                System.out.println("Área = "+resultado);


            } else if (opt == 3) {
                System.out.print("Digite a Diagonal Maior: ");
                diagMaiorLos = ler.nextInt();
                System.out.print("Digite a Diagonal Menor: ");
                diagMenorLos = ler.nextInt();

                resultado = (diagMaiorLos * diagMenorLos)/2;

                System.out.println("Área = "+resultado);

            } else if (opt == 4) {
                System.out.print("Digite a Base: ");
                baseRet = ler.nextInt();
                System.out.print("Digite a Altura: ");
                alturaRet = ler.nextInt();

                resultado = baseRet * alturaRet;

                System.out.println("Área = "+resultado);

            } else if (opt == 5) {
                System.out.print("Digite a Base Maior: ");
                baseMaiorTrap = ler.nextInt();
                System.out.print("Digite a Base Menor: ");
                baseMenorTrap = ler.nextInt();
                System.out.print("Digite a Altura: ");
                alturaTrap = ler.nextInt();

                resultado = (baseMaiorTrap + baseMenorTrap) * alturaTrap/2;

                System.out.println("Área = "+resultado);

            } else if (opt == 6) {
                System.out.print("Digite o Raio: ");
                raioCirc = ler.nextInt();

                resultado = (int) (Math.pow(raioCirc,2.0) * Math.PI);

                System.out.println("Área = "+resultado);

            } else if (opt > 6){
                System.out.println("Opção Invalida");
            }else{

            }
        }while(opt != 0);
    }
}
