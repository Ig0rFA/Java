import java.util.Scanner;

public class ExemploCondicional1 {
    public static void main(String[] args){

        //Instanciando um objeto de classe Scanner
        Scanner entrada = new Scanner(System.in);

        //Entrada de dados
        System.out.print("Digite o número  1 para ver a mensagem: ");
        int valor = entrada.nextInt();

        //Teste Condicional
        if (valor == 1){
            System.out.print("Olá, seja bem-vindo(a).");
        }
    }
}
