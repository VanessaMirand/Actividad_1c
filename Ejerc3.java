package Actividad_1c;

import java.io.PrintStream;
import java.util.Scanner;

public class Ejerc3 {

    public static PrintStream Screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args) {

        int horas = 0;
        float costohora = 0;
        int retefuente = 0;
        float salariobruto = 0;
        float salarioneto = 0;
        float retefuente2 = 0;

        Screen.println("Ingrese la cantidad de horas trabajadas");
        horas = keyboard.nextInt();

        Screen.println("Ingrese el costo por hora");
        costohora = keyboard.nextFloat();

        Screen.println("Ingrese el porcentaje de retencion de la fuente");
        retefuente = keyboard.nextInt();

        salariobruto = horas*costohora;
        retefuente2 = salariobruto*retefuente/100;
        salarioneto = salariobruto-retefuente2;

        Screen.println("El salario bruto es:"+salariobruto);
        Screen.println("La retencion de la fuente es:"+ retefuente2);
        Screen.println("El salario neto es:"+salarioneto);


    }
}
