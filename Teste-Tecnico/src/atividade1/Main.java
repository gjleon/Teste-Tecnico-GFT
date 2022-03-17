package atividade1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numeros = sc.next();
        StringBuilder strb = new StringBuilder(numeros);
        System.out.println(numeros);
        System.out.println(strb.reverse());
    }
}