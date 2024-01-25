import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int opt;

            System.out.println("Digite um numero entre 1 a 12 e apresentarei o mes correspondente!");
            opt = ler.nextInt();

            switch (opt){
                case 1:
                System.out.println("Mes = Janeiro");
                break;
                case 2:
                System.out.println("Mes = Fevereiro");
                    break;
                case 3:
                System.out.println("Mes = Março");
                    break;
                case 4:
                System.out.println("Mes = Maio");
                    break;
                case 5:
                System.out.println("Mes = Abril");
                    break;
                case 6:
                System.out.println("Mes = Junho");
                    break;
                case 7:
                System.out.println("Mes = Julho");
                    break;
                case 8:
                System.out.println("Mes = Agosto");
                    break;
                case 9:
                System.out.println("Mes = Setembro");
                    break;
                case 10:
                System.out.println("Mes = Outubro");
                    break;
                case 11:
                System.out.println("Mes = Novembro");
                    break;
                case 12:
                System.out.println("Mes = Dezembro");
                    break;
                case 0 :
                System.out.println("Mes Inexistente");
                    break;
        }
    }
}
