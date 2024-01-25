import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int opt;
        int baseTri;
        int alturaTri;

        int ladoQuad;

        int diagMaiorLos;
        int diagMenorLos;

        int baseRet;
        int alturaRet;
        int baseMenorTrap;
        int baseMenorTrap;
        int raioCirc;
        int resultado;



        do {
            System.out.println("********************************************************");
            System.out.println("** ÁREA - FIGURAS GEOMÉTRICAS **");
            System.out.println("********************************************************");

            System.out.println("[1] - Triângulo\n" + "[2] - Quadrado\n" + "[3] - Losango\n" + "[4] - Retangulo\n" + "[5] - Trapézio\n" + "[6] - Círculo\n");
            System.out.println("********************************************************");

            System.out.println("Digite a opção desejada: ");
            opt = ler.nextInt();

            if (opt == 1) {

                System.out.print("Digite a Base: ");
                baseTri = ler.nextInt();
                System.out.print("Digite a Altura: ");
                alturaTri = ler.nextInt();

                resultado = ;

                System.out.println("Área = "+resultado);

            } else if (opt == 2) {
                System.out.print("Digite o Lado: ");
                ladoQuad = ler.nextInt();

                resultado = ;

                System.out.println("Área = "+resultado);

            } else if (opt == 3) {
                System.out.print("Digite a Diagonal Maior: ");
                diagMaiorLos = ler.nextInt();
                System.out.print("Digite a Diagonal Menor: ");
                diagMenorLos = ler.nextInt();

                resultado = ;

                System.out.println("Área = "+resultado);

            } else if (opt == 4) {
                System.out.print("Digite a Base: ");
                num1 = ler.nextInt();
                System.out.print("Digite a Altura: ");
                num2 = ler.nextInt();

                resultado = ;

                System.out.println("Área = "+resultado);

            } else if (opt == 5) {
                System.out.print("Digite a Base Maior: ");
                num1 = ler.nextInt();
                System.out.print("Digite a Base Menor: ");
                num2 = ler.nextInt();
                System.out.print("Digite a Altura: ");
                num2 = ler.nextInt();

                resultado = ;

                System.out.println("Área = "+resultado);

            } else if (opt == 6) {
                System.out.print("Digite o Raio: ");
                num1 = ler.nextInt();

                resultado = ;

                System.out.println("Área = "+resultado);

            } else {
                System.out.println("Opção Invalida");
                System.out.println("[0] Nova Tentativa");
            }
        }
    }
}
