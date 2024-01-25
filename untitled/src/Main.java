import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int opt;

        do{

            System.out.println("Digite um numero entre 1 a 12 e apresentarei o mes correspondente!");
            opt = ler.nextInt();

            if (opt == 1) {
                System.out.println("Mes = Janeiro");

            } else if (opt == 2) {
                System.out.println("Mes = Fevereiro");
            } else if (opt == 3) {
                System.out.println("Mes = Março");
            } else if (opt == 4) {
                System.out.println("Mes = Maio");
            } else if (opt == 5) {
                System.out.println("Mes = Abriç");
            } else if (opt == 6) {
                System.out.println("Mes = Junho");
            } else if (opt == 7) {
                System.out.println("Mes = Julho");
            } else if (opt == 8) {
                System.out.println("Mes = Agosto");
            } else if (opt == 9) {
                System.out.println("Mes = Setembro");
            } else if (opt == 10) {
                System.out.println("Mes = Outubro");
            } else if (opt == 11) {
                System.out.println("Mes = Novembro");
            } else if (opt == 12) {
                System.out.println("Mes = Dezembro");
            } else {
                System.out.println("Mes Inexistente");
                System.out.println("[0] Nova Tentativa");
            }
        }while(opt ==0);
    }
}