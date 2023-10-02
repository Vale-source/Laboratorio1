import javax.imageio.stream.FileCacheImageInputStream;
import javax.swing.*;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ejercicio 1
        int numeros_positivo = 0;
        int numeros_negativos = 0;
        int contador_positivo = 0;
        int contador_negativos = 0;
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Ingrese el numero de la vuelta N°" + (i + 1) + ": ");
            nums[i] = sc.nextInt();
            if (nums[i] >= 0) {
                numeros_positivo = numeros_positivo + nums[i];
                contador_positivo++;
            } else {
                numeros_negativos = numeros_negativos + nums[i];
                contador_negativos++;
            }
        }
        int promedio_p = numeros_positivo / contador_positivo;
        int promedio_n = numeros_negativos / contador_negativos;

        System.out.println("La media de numeros positivos ingresados es de: " + promedio_p);
        System.out.println("La media de numeros negativos es de: " + promedio_n);

        //Ejercicio 2
        int posiciones_pares = 0;
        int contador_pares = 0;
        int[] Pares = new int[10];
        for (int i = 0; i < Pares.length; i++) {
            System.out.println("Ingrese el numero de la vuelta N°" + (i + 1) + ": ");
            Pares[i] = sc.nextInt();
            if (i == 0 || i % 2 == 0) {
                posiciones_pares = posiciones_pares + Pares[i];
                contador_pares++;
            }
        }
        int promedio_pares = posiciones_pares / contador_pares;
        System.out.println("La media de los numeros en posiciones pares es de: " + promedio_pares);

        //Ejercicio 3
        System.out.print("Ingrese la cantidad de alumnos de la clase: ");
        int alumnos = sc.nextInt();
        double media = 0;
        int cont = 0;

        double[] notas = new double[alumnos];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota del alumno N°" + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            media = media + notas[i];
            cont++;
        }

        double media_notas = media / cont;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= media_notas) {
                System.out.println("El alumno N°" + (i + 1) + " esta por encima de la media de " + media_notas + " con una nota de " + notas[i]);
            }
        }

        //Ejercicio 4
        int[] Par = new int[20];
        int contador = 0;

        for (int i = 0; i < Par.length; i++) {
            if (contador % 2 == 0) {
                Pares[i] = contador;
                contador++;
            } else {
                contador++;
                i--;
            }
        }

        System.out.println("Los primeros 20 numeros pares son: ");
        for (int j : Par) {
            System.out.print(j + " ");
        }

        //Ejercicio 5
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        int[] enteros = new int[10];
        for (int i = 0; i < enteros.length; i++) {
            System.out.print("Ingrese el numero de la posicion " + i + ": ");
            enteros[i] = sc.nextInt();
            if (enteros[i] > 0) {
                positivos++;
            } else if (enteros[i] < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
        System.out.println("Numeros positivos: " + positivos);
        System.out.println("Numeros negativos: " + negativos);
        System.out.println("Veces que se ingreso el 0: " + ceros);

        //Ejercicio 6 (El ejercicio se repite, es el mismo que el 1)
        int n_positivo = 0;
        int n_negativos = 0;
        int c_positivo = 0;
        int c_negativos = 0;
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero de la vuelta N°" + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            if (numeros[i] >= 0) {
                n_positivo = n_positivo + numeros[i];
                c_positivo++;
            } else {
                n_negativos = n_negativos + numeros[i];
                c_negativos++;
            }
        }
        int total_p = n_positivo / c_positivo;
        int total_n = n_negativos / c_negativos;

        System.out.println("La media de numeros positivos ingresados es de: " + total_p);
        System.out.println("La media de numeros negativos es de: " + total_n);

        //Ejercicio 7
        System.out.println("Ingrese la cantidad de personas: ");
        int N = sc.nextInt();
        double[] personas = new double[N];
        double altura = 0;
        int cont_personas = 0;
        int personas_altas = 0;
        int personas_bajas = 0;

        for (int i = 0; i < personas.length; i++) {
            System.out.print("Altura de la persona " + (i + 1) + ": ");
            personas[i] = sc.nextDouble();
            altura = altura + personas[i];
            cont_personas++;
        }

        double media_altura = altura / cont_personas;

        for (int i = 0; i < personas.length; i++) {
            if (personas[i] >= media_altura) {
                personas_altas++;
            } else {
                personas_bajas++;
            }
        }

        System.out.println("La altura media es de: " + media_altura + " metros");
        System.out.println("Hay un total de " + personas_altas + " personas que son mas altas que la media");
        System.out.println("Hay un total de " + personas_bajas + " personas que son mas bajas que la media");

        //Ejercicio 8
        String[] empleados = new String[20];
        double[] sueldos = new double[20];
        double max = 0;
        String empleado_max = "";

        for (int i = 0; i < empleados.length; i++) {
            System.out.print("Ingrese el nombre del empleado " + (i + 1) + ": ");
            empleados[i] = sc.nextLine();
            String incial_mayuscula = empleados[i].toUpperCase().charAt(0) + empleados[i].substring(1, empleados[i].length()).toLowerCase();
            empleados[i] = incial_mayuscula;
        }

        for (int i = 0; i < sueldos.length; i++) {
            System.out.print("Ingrese el sueldo de " + empleados[i] + ": ");
            sueldos[i] = sc.nextDouble();
            if (sueldos[i] > max) {
                max = sueldos[i];
                empleado_max = empleados[i];
            }
        }

        System.out.println("El empleado con el mayor sueldo es " + empleado_max + " con un sueldo de $" + max);

        //Ejercicio 9
        System.out.print("Ingrese el tamaño del arreglo: ");
        int array = sc.nextInt();
        System.out.print("Ingrese un numero incial: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el numero final: ");
        int num2 = sc.nextInt();
        int[] array_metodo = aleatorio(array, num1, num2);

        for (int i = 0; i < array_metodo.length; i++) {
            System.out.print(array_metodo[i] + ",");
        }

        //Ejercicio 10-A
        int filas, columnas;
        do {
            System.out.print("Introduce número de filas: ");
            filas = sc.nextInt();
            if (filas < 2) {
                System.out.println("Valor no válido");
            }
        } while (filas < 2);

        do {
            System.out.print("Introduce número de columnas: ");
            columnas = sc.nextInt();
            if (columnas < 2) {
                System.out.println("Valor no válido");
            }
        } while (columnas < 2);


        int[][] matriz_A = new int[filas][columnas];
        int[][] matriz_B = new int[filas][columnas];
        int[][] matriz_C = new int[filas][columnas];

        System.out.println("Datos de la matriz A: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor de la fila " + i + ", columna " + j + ": ");
                matriz_A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Datos de la matriz B:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor de la fila " + i + ", columna " + j + ": ");
                matriz_B[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz_C[i][j] = matriz_A[i][j] + matriz_B[i][j];
            }
        }

        System.out.println("Matriz C: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz_C[i][j] + " ");
            }
            System.out.println();
        }

        //Ejercicio 10-B
        int filas_met = ingreso_numeros();
        int columnas_met = ingreso_numeros();
        int [][] Matriz_A = crear_matriz(filas_met,columnas_met);
        int [][] Matriz_B = crear_matriz(filas_met,columnas_met);

        System.out.println("Matriz A: ");
        llenar_Matriz(Matriz_A);
        System.out.println("Matriz B: ");
        llenar_Matriz(Matriz_B);
        System.out.println();

        System.out.println("Matriz A: ");
        mostrar_matriz(Matriz_A);
        System.out.println("Matriz B: ");
        mostrar_matriz(Matriz_B);
        System.out.println("Suma de ambas matrices: ");
        int [][] Matriz_C = sumar_matrices(Matriz_A,Matriz_B);
        mostrar_matriz(Matriz_C);


        //Ejercicio 11
        System.out.print("Ingrese la cantidad de filas de la matriz: ");
        int filas_normales = sc.nextInt();
        System.out.print("Ingrese la cantidad de columnas de la matriz: ");
        int columnas_normales = sc.nextInt();

        int [][] matriz_normal = new int[filas_normales][columnas_normales];

        System.out.println("Ingrese los datos de la matriz: ");
        for (int i = 0; i < filas_normales; i++){
            for (int j = 0; j < columnas_normales; j++){
                System.out.print("Fila "+i+" Columna "+j);
                matriz_normal[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz ingresada: ");
        for (int i = 0; i < matriz_normal.length; i++){
            for (int j = 0; j < matriz_normal.length; j++){
                System.out.print(matriz_normal[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Matriz Traspuesta:");
        for (int i = 0; i < matriz_normal.length; i++){
            for (int j = 0; j < matriz_normal.length; j++){
                System.out.print(matriz_normal[j][i]+" ");
            }
            System.out.println();
        }
    }

    public static int ingreso_numeros (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();
        return numero;
    }

    public static int[][] crear_matriz(int filas, int columnas){
        int [][] matriz = new int [filas][columnas];
        return matriz;
    }

    public static int [][] llenar_Matriz(int [][] matriz){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.print("Fila "+i+" Columna "+j+": ");
                matriz[i][j] = sc.nextInt();
            }
        }
        return matriz;
    }

    public static int [][] mostrar_matriz(int [][] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        return matriz;
    }

    public static int [][] sumar_matrices(int [][] matriz_1, int [][] matriz_2){
        int [][] matriz_3 = crear_matriz(matriz_1.length, matriz_1[0].length);
        for (int i = 0; i < matriz_1.length; i++){
            for (int j = 0; j < matriz_1[i].length; j++){
                matriz_3[i][j] = matriz_1[i][j] + matriz_2[i][j];
            }
        }
        return matriz_3;
    }

    public static int[] aleatorio(int tamanio, int desde, int hasta){
        Random random = new Random();
        int [] arreglo = new int[tamanio];
        for (int i = 0; i < arreglo.length; i++){
            arreglo[i] = random.nextInt(hasta+1) + desde;
        }
        return arreglo;
    }
}
