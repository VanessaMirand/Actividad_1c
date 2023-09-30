package Actividad_1c;

import java.io.PrintStream;
import java.util.Scanner;

public class Ejerc1 {


    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args) {
        int num1 = 0;
        int res = 0;
        screen.println("Ingrese un numero entero");
        num1 = keyboard.nextInt();

        res = num1 % 2;

        screen.println("el residuo de la division es:"+ res);

    }


}