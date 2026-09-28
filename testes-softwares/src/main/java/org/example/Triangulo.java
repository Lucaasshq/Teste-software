package org.example;

import java.util.Scanner;

public class Triangulo {

    public String calcularTriangulo(double a, double b, double c){


        System.out.println("=======================================================");
        System.out.println("Calcular lados de um triângulo");
        System.out.println("=======================================================");


        if (!trianguloValido(a,b,c)){
            return "Não é um triãngulo valido!";
        }

        if (a == b &&  b == c) {
            return "Equilátero";
        } else if (a == b || a == c || b == c) {
            return "Isóceles";
        } else {
            return "Escaleno";
        }
    }

    public  boolean trianguloValido(double v1, double v2, double v3){
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



