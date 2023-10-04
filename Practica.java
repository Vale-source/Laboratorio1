import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;
public class Practica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaracion e iniciacion
        //Ejercicio 1
        int[] naturales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Ejercicio 2
        int[] primos = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

        //Ejercicio 3
        int[][] enteros = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {11, 12, 13, 14, 15, 16, 17, 18, 19, 20}};

        //Ejercicio 4
        int[][] reales = {{1, 2, 3, 4}, {-1, -2, -3, -4}, {5, -6, 7, -8}};

        //Lectura y escritura
        //Ejercicio 1
        int[] diez_enteros = new int[10];
        for (int i = 0; i < diez_enteros.length; i++) {
            System.out.print("Ingrese el valor de la posicion " + (i + 1) + ": ");
            diez_enteros[i] = sc.nextInt();
        }

        //Ejercicio 2
        double[] diez_reales = new double[10];
        for (int i = 0; i < diez_reales.length; i++) {
            System.out.print("Ingrese el valor de la posicion " + (i + 1) + ": ");
            diez_reales[i] = sc.nextDouble();
        }

        //Ejercicio 3
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < vocales.length; i++) {
            System.out.println(vocales[i]);
        }

        //Ejercicio 4
        boolean[] booleanos = {true, false, false, true, false};
        for (int i = 0; i < booleanos.length; i++) {
            System.out.println(booleanos[i]);
        }

        //Operaciones aritmeticas
        //Ejercicio 1 y 2
        int[] operaciones = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int suma = 0;
        int multiplicacion = 1;
        for (int i = 0; i < operaciones.length; i++) {
            suma = operaciones[i] + suma;
            multiplicacion = operaciones[i] * multiplicacion;
        }
        System.out.println("La suma de los elementos del array es: " + suma);
        System.out.println("La multiplicacion de los elementos del array es: " + multiplicacion);

        //Ejercicio 3
        int[] menor_mayor = {5, 7, 8, 6, 4, 2, 10, 3, 1, 9};
        Arrays.sort(menor_mayor);
        System.out.println("El arreglo ordenado de menor a mayor: ");
        for (int i : menor_mayor) {
            System.out.print(i + " ");
        }

        //Ejercicio 4
        String[] cadena = {"uno", "dos", "tres", "cuatro", "cinco"};
        Arrays.sort(cadena);
        for (String i : cadena) {
            System.out.println(i);
        }

        //Ejercicios adicionales
        //Ejercicio 1
        int[] pares = new int[6];
        for (int i = 0; i < pares.length; i++) {
            System.out.print("Ingrese el numero de la posicion " + (i + 1) + ": ");
            pares[i] = sc.nextInt();
        }
        int cantidadpares = cantidad_pares(pares);
        System.out.print("cantidad de elementos pares en el arreglo: " + cantidadpares);

        //Ejercicio 2
        double[] mayor_10 = new double[6];
        for (int i = 0; i < mayor_10.length; i++) {
            System.out.print("Ingrese el numero de la posicion " + (i + 1) + ": ");
            mayor_10[i] = sc.nextInt();
        }
        int mayoresadiez = mayores_a_10(mayor_10);
        System.out.print("cantidad de elementos pares en el arreglo: " + mayoresadiez);

        //Ejercicio 3
        int[] multiplo_tres = new int[10];
        for (int i = 0; i < multiplo_tres.length; i++) {
            System.out.print("Ingrese el numero de la posicion " + (i + 1) + ": ");
            multiplo_tres[i] = sc.nextInt();
        }

        int suma_multiplos = suma(multiplo_tres);
        System.out.print("La suma de los numeros multiplos de 3 en el arreglo es: "+suma_multiplos);

        //Ejercicio 4
        int [] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++){
            System.out.print("Ingrese el numero de la posicion " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int numero_mayor = mayor(numeros);
        System.out.print("El numero mas grande del arreglo ingresado es: "+numero_mayor);

        //Ejercicio 5
        String [] arreglo = new String [5];
        for (int i = 0; i < arreglo.length; i++){
            System.out.print("Ingrese la palabra de la posicion " + (i + 1) + ": ");
            arreglo[i] = sc.next();
        }
        String menor = minimo(arreglo);
        System.out.println("El elemento mas pequeño en el arreglo es: "+menor);

        //Ejercicio 6
        int [] arreglo_1 = {5,10,15,20,25,30};
        int [] arreglo_2 = {3,6,9,12,15,18};
        System.out.println("Arreglo 1: ");
        for (int i: arreglo_1){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Arreglo 2: ");
        for (int j : arreglo_2){
            System.out.print(j + " ");
        }

        int [] arreglo_mod = cambio(arreglo_1,arreglo_2);
        System.out.println();
        System.out.println("Arreglo 2 modificado: ");
        for (int j : arreglo_mod){
            System.out.print(j + " ");
        }
    }

    public static int cantidad_pares(int[] arreglo) {
        int cont_pares = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] % 2 == 0) {
                cont_pares++;
            }
        }
        return cont_pares;
    }

    public static int mayores_a_10(double [] arreglo){
        int cont_mayores = 0;
        for (int i = 0; i < arreglo.length; i++){
            if (arreglo[i] > 10){
                cont_mayores++;
            }
        }
        return cont_mayores;
    }

    public static int suma(int [] arreglo){
        int total = 0;
        for (int i = 0; i < arreglo.length; i++){
            if (arreglo[i] % 3 == 0){
                total = arreglo[i] + total;
            }
        }
        return total;
    }

    public static int mayor(int [] arreglo){
        int maxnum = arreglo[0];
        for (int i = 0; i < arreglo.length; i++){
            if (arreglo[i] > maxnum) {
                maxnum = arreglo[i];
            }
        }
        return maxnum;
    }

    public static String minimo(String [] arreglo){
        Arrays.sort(arreglo);
     return arreglo[0];
    }

    public static int [] cambio(int [] arreglo_1, int [] arreglo_2){
        int [] auxiliar = new int[5];
        auxiliar = arreglo_2;
        arreglo_2 = arreglo_1;
        return arreglo_2;
    }
}
