/*
3. Faça um programa que leia três números, e mostre eles na tela em ordem crescente.

Exemplo

Entrada Saída

Número 1: 9
Número 2: 5
Número 3: 2

Ordem: 2 5 9

Número 1: 5
Número 2: 2
Número 3: 9

Ordem: 2 5 9

Número 1: 2
Número 2: 9
Número 3: 5

Ordem: 2 5 9
 */

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int num1, num2, num3;


        System.out.print("Digite o primeiro número ");
        num1 = ler.nextInt();
        System.out.print("Digite o segundo número ");
        num2 = ler.nextInt();
        System.out.print("Digite o terceiro número ");
        num3 = ler.nextInt();

        if (num1 > num2 && num1 > num3){
        } else if (num2 > num3) {
            System.out.print("Ordem " + num3 + "," + num2 + "," + num1);
        }else {
            System.out.print("Ordem " + num2 + "," + num3 + "," + num1);
        } if (num2 > num1 && num2 > num3) {
        } else if (num1 < num3){
            System.out.print("Ordem " + num1 + num3 + num2);
        }else {
            System.out.print("Ordem " + num3 + "," + num1 + "," + num2);
        }if (num3 > num2 && num3 > num1) {
        }else if (num2 < num1) {
            System.out.print("Ordem " + num2 + "," + num1 + "," + num3);
        }else {
            System.out.print("Ordem " + num1 + "," + num2 + "," + num2);
        }


    }
    }





/*
    }
}




if (num1 < num2 && num1 < num3){
        } else if(num2 < num3) {
        System.out.print("Ordem " + num1 + "," + num2 + "," + num3);
        } else if (num2 < num3 && num2 < num1) {
        }   else if (num3 < num1) {
        System.out.print("Ordem " + num2 + ",") + num3 + "," + num1);
        }

   */