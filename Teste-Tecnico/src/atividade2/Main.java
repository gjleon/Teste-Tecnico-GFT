package atividade2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numeros = sc.nextLine();
        int maior = 0, soma = 0;
        String[] numeros2 =  numeros.split(" ");
        for (int i = 0 ;i <numeros2.length; i++){
            if (maior < Integer.parseInt(numeros2[i])){
                maior = Integer.parseInt(numeros2[i]);
            }
            soma +=  Integer.parseInt(numeros2[i]);
        }
        System.out.println("O maior número é " + maior);
        System.out.println("A soma dos valores é  " + soma);

    }
}
