package org.example;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("=======================================================");
        System.out.println("Calcular lados de um triângulo");
        System.out.println("=======================================================");


        double a = 0, b = 0, c = 0;
        try {
            System.out.println("Digite lado A:");
             a = sc.nextDouble();

            System.out.println("Digite lado B:");
             b = sc.nextDouble();

            System.out.println("Digite lado C:");
             c = sc.nextDouble();
        } catch (RuntimeException e){
            System.out.println("O Valor aceito é apenas númerico!");
            return;
        }

        if (!trianguloValido(a,b,c)){
            System.out.println("Não é um triãngulo valido!");
            return;
        }

        if (a == b &&  b == c) {
            System.out.println("Equilátero");
        } else if (a == b || a == c || b == c) {
            System.out.println("Isóceles");
        } else {
            System.out.println("Escaleno");
        }
    }

    public static boolean trianguloValido(double v1, double v2, double v3){
        double maiorLado = 0;
        if (v1 >= v2 && v1 >= v3){
            maiorLado = v1;
        } else if (v2 >= v1 && v2 >= v3) {
            maiorLado = v2;
        } else {
            maiorLado = v3;
        }

        if (maiorLado == v1 && v2+v3 > v1){
            return true;
        } else if (maiorLado == v2 && v1 + v3 > v2) {
            return true;
        } else if (maiorLado == v3 && v1+v2 > v3){
            return true;
        }
        return false;
    }

}
