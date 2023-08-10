package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaTeclado=new Scanner (System.in);
        Random generador=new Random();

        Boolean esAdministrador;
        String respuestaDePerfil, contraseniaIngresada;
        double tarifaEnergia;

        final String contrasenia="admin12345*";


        System.out.println("Bienvenido!");
        System.out.print("Eres administrador? ");
        respuestaDePerfil=entradaTeclado.nextLine();

        //PROCESO PARA EL LOGIN
        if (respuestaDePerfil.equalsIgnoreCase("si")){
            System.out.print("Digita tu contrasenia: ");
            contraseniaIngresada=entradaTeclado.nextLine();

            //COMPARAMOS SI LA CONTRASEÑA INGRESADA COINCIDE CON LA ALMACENADA EN LA BASE DE DATOS
            if (contraseniaIngresada.equals(contrasenia)){
                System.out.println("Eres un administrador, bienvenido.");
                //EL ADMIN PUEDE ACTUALIZAR LA TARIFA DE ENERGIA
                System.out.println("Digita el valor del KWH");
                tarifaEnergia=entradaTeclado.nextDouble();
                System.out.println("La tarifa de energia quedo en: "+tarifaEnergia);

                //GENERANDO DATOS PARA UNA EMPRESA
                //GENERAR UN CICLO DE 30 VUELTAS
                Integer numeroDeVueltas=0; //contador
                Integer contadorDePicos=0;
                Integer suma=0;

                do {

                    numeroDeVueltas=numeroDeVueltas+1;
                    Integer numeroGenerado=generador.nextInt(401);
                    System.out.println(numeroGenerado);
                    suma=numeroGenerado+suma;


                    if (numeroGenerado>300){
                        System.out.println("ALERTAAAA, PICO DETECTADO, ALERTAAAA!!!");
                        contadorDePicos=contadorDePicos+1;
                    }else {
                        System.out.println("Operando con tranquilidad, recuerda que la tranquilidad no tiene precio.");
                    }
                }while (numeroDeVueltas<30);
                System.out.println(numeroDeVueltas);
                System.out.println(contadorDePicos);

                //MENU
                int opcion;
                do {
                    System.out.println("Este es tu menu");
                    System.out.println("1. Ver tarifa");
                    System.out.println("2. ver consumo promedio");
                    System.out.println("3. ver picos de consumo");
                    System.out.println("4. mostrar factura");
                    System.out.println("5. salir");
                    System.out.println("Ingresa una opcion");
                    opcion= entradaTeclado.nextInt();
                    switch (opcion){
                        case 1:
                            System.out.println("haz seleccionado ver tu tarifa");
                            System.out.println("Tu tarifa actual de energia es: "+tarifaEnergia+" pesos el KWH");
                            break;
                        case 2:
                            System.out.println("Haz seleccionado ver tu consumo promedio");
                            System.out.println("El promedio es: "+(suma/30)+" KWH diarios");
                            break;
                        case 3:
                            System.out.println("Tus picos de consumo fueron en total: "+contadorDePicos+" picos");
                            break;
                        case 4:
                            System.out.println("Tu factura es de: "+suma+" kilowats"+" para un total de "+(suma*tarifaEnergia)+" pesos");
                            break;
                        case 5:
                            System.out.println("vuelva pronto.");
                            break;
                        default:
                            System.out.println("Ingresa una opcion valida prra");
                    }
                }while (opcion!=5);


            }else {
                System.out.println("No eres un administrador, intentas hackearnos hijo de puta?");
            }

        }else {
            //SI LA RESPUESTA ES NO ENTONCES ES UNA EMPRESA
            System.out.println("Eres una empresa");




        }













    }
}