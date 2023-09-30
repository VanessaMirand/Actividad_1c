package Actividad_1c;

import java.io.PrintStream;
import java.util.Scanner;

public class Ejerc2 {

    public static PrintStream screen = System.out;
    public static Scanner keyboard =new Scanner(System.in);

public static void main(String[]args){

    long celular = 0;
    long res = 0;
    screen.println("Ingrese el numero de celular");

    celular = keyboard.nextLong();
    res = celular / 10000000;

    screen.println("El prefijo del operador es:"+ res);

        }


}
