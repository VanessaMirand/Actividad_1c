package Actividad_1c;

import java.io.PrintStream;
import java.util.Scanner;

public class Ejerc5 {

    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args) {

        double pesos = 0;
        double dolares = 0;
        double euros = 0;
        double dolares2 = 0;
        double euros2 = 0;


        screen.println("Ingrese un valor en pesos");
        pesos = keyboard.nextDouble();

        dolares = 4070;
        euros = 4309;

        dolares2 = pesos/dolares;
        euros2 = pesos/euros;

        screen.println("El valor en Dolares es:$"+ Math.round(dolares2*100d)/100d);


        screen.println("El valor en Euros es:€" + Math.round(euros2*100d)/100d);


    }


    }
