package org.example;

import java.util.Random;

public class SumaNumerosAleatorios {
    public static void main(String[] args) {
        Random generadorDeNumeros=new Random();

        Integer numeroGenerado;
        Integer numeroVueltas=0;
        Integer suma=0;
        System.out.println("estos son los numeros generados");
        
        do {
            numeroGenerado=generadorDeNumeros.nextInt(401);
            numeroVueltas=numeroVueltas+1;
            System.out.println(numeroGenerado);
            suma=numeroGenerado+suma;
        }while (numeroVueltas<30);
        System.out.println(numeroVueltas);
        System.out.println("La suma de los numeros es: "+suma);
        System.out.println("El promedio es: "+(suma/30));


    }
}
