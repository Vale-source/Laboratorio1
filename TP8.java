import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class TP8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        //Ejercicio 1
        int tamaño = 3;
        int [][] matriz_1 =new int[tamaño][tamaño];
        int [][] matriz_2 = new int[tamaño][tamaño];

        for (int i = 0; i < matriz_1.length; i++){
            for (int j = 0; j < matriz_1[i].length; j++){
                matriz_1[i][j] = ran.nextInt(10);
            }
        }
        System.out.print("Matriz 1:");
        mostrar_matrices(matriz_1);

        for (int i = 0; i < matriz_2.length; i++){
            for (int j = 0; j < matriz_2[i].length; j++){
                matriz_2[i][j] = ran.nextInt(10);
            }
        }
        System.out.print("Matriz 2:");
        mostrar_matrices(matriz_2);

        System.out.println("Matriz sumada:");
        int [][] matriz_3 = new int[tamaño][tamaño];
        matriz_3 = suma_matrices(matriz_1,matriz_2,tamaño);
        mostrar_matrices(matriz_3);

        //Ejercicio 2

        for (int i = 0; i < matriz_1.length; i++){
            for (int j = 0; j < matriz_1[i].length; j++){
                matriz_1[i][j] = ran.nextInt(10);
            }
        }
        System.out.print("Matriz 1:");
        mostrar_matrices(matriz_1);


        for (int i = 0; i < matriz_2.length; i++){
            for (int j = 0; j < matriz_2[i].length; j++){
                matriz_2[i][j] = ran.nextInt(10);
            }
        }
        System.out.print("Matriz 2:");
        mostrar_matrices(matriz_2);


        System.out.println("Matriz multiplicada:");
        int [][] matriz_4 = new int[tamaño][tamaño];
        matriz_4 = multiplicacion_matrices(matriz_1,matriz_2,tamaño);
        mostrar_matrices(matriz_4);

        //Ejercicio 3
        for (int i = 0; i < matriz_1.length; i++){
            for (int j = 0; j < matriz_1[i].length; j++){
                matriz_1[i][j] = ran.nextInt(10);
            }
        }
        System.out.print("Matriz 1:");
        mostrar_matrices(matriz_1);

        System.out.print("Matriz traspuesta:");
        int [][] matriz_5 = new int[tamaño][tamaño];
        matriz_5 = matriz_traspuesta(matriz_1);
        mostrar_matrices(matriz_5);

        //Ejercicio 4
        for (int i = 0; i < matriz_1.length; i++){
            for (int j = 0; j < matriz_1[i].length; j++){
                matriz_1[i][j] = ran.nextInt(10);
            }
        }

        System.out.print("Matriz 1:");
        mostrar_matrices(matriz_1);

        System.out.print("Matriz traspuesta: ");
        int matriz_6[][] = new int[tamaño][tamaño];
         matriz_6 = matriz_traspuesta(matriz_1);
         mostrar_matrices(matriz_6);

         if (simetrica(matriz_1,matriz_6) == true){
             System.out.println("Es una matriz simetrica");
         } else {
             System.out.println("No es una matriz simetrica");
         }

         //Ejercicio 5
        int [] matriz_7 = new int[5];
         for (int i = 0; i < matriz_7.length; i++){
             matriz_7[i] = ran.nextInt(20);
         }
        System.out.println("Matriz: ");
         mostrar_munidimensional(matriz_7);
        System.out.print("Ingrese por cual numero quiere sacar el producto escalar:");
        int producto = sc.nextInt();

        System.out.println("Producto escalar:");
        int [] matriz_producto = producto_escalar(matriz_7, producto);
        mostrar_munidimensional(matriz_producto);

        //Ejercicio 6
        int [][] matriz_8 = new int[3][3];
        for (int i = 0; i < matriz_8.length; i++){
            for (int j = 0; j < matriz_8[i].length; j++){
                matriz_8[i][j] = ran.nextInt(10);
            }
        }
        System.out.println("Matriz: ");
        mostrar_matrices(matriz_8);
        System.out.println("La suma de todos los elementos de la matriz es: ");
        System.out.println(suma_elementos(matriz_8));

        //Ejercicio 7
        int [][] matriz_9 = new int[3][3];
        for (int i = 0; i < matriz_9.length; i++){
            for (int j = 0; j < matriz_9[i].length; j++){
                matriz_9[i][j] = ran.nextInt(10);
            }
        }
        System.out.println("Matriz: ");
        mostrar_matrices(matriz_9);
        elemento_max(matriz_9);

        //Ejercicio 8
        System.out.print("Tamaño de la matriz: ");
        int tam = sc.nextInt();
        System.out.println("Matriz:");
        int [][] matriz_10 = random_matriz(tam);
        mostrar_matrices(matriz_10);
        System.out.print("Ingrese la fila de la matriz que desee sumar: ");
        int fila = sc.nextInt();
        System.out.println("La suma de la fila "+(fila)+" es: "+suma_unidimensional(matriz_10,fila));

        //Ejercicio 9
        int [][] matriz_11 = {{2,0,0},{0,5,0},{0,0,9}};
        mostrar_matrices(matriz_11);

        if (matriz_diagonal(matriz_11) == true){
            System.out.println("Es una matriz diagonal");
        } else {
            System.out.println("No es una matriz diagonal");
        }

        //Ejercicio 10
        int [][] matriz_12 = {{1,0,0},{0,1,0},{0,0,1}};
        mostrar_matrices(matriz_12);

        if (matriz_identidad(matriz_12) == true){
            System.out.println("Es una matriz identidad");
        } else {
            System.out.println("No es una matriz identidad");
        }

        //Ejercicio 11
        int [][] matriz_13 = crear_y_mostrar_matriz();
        pares_impares(matriz_13);

        //Ejercicio 12
        int [][] matriz_14 = crear_y_mostrar_matriz();
        System.out.println("Matriz rotada:");
        mostrar_matrices(rotarMatriz(matriz_14));

        //Ejercicio 13
        int [][] matriz_15 = crear_y_mostrar_matriz();
        System.out.println("Ingrese el numero que desea saber cuantas veces se repite en la matriz: ");
        int num_busqueda = sc.nextInt();
        System.out.println("La cantidad de veces que se repite el numero "+num_busqueda+" es: "+contar_elemento(matriz_15,num_busqueda));

        //Ejercicio 14
        int [][] matriz_16 = crear_y_mostrar_matriz();
        System.out.println("Matriz con filas invertidas:");
        mostrar_matrices(invertir_filas(matriz_16));

        //Ejercicio 15
        int [][] matriz_17 = crear_y_mostrar_matriz();
        suma_diagonales(matriz_17);

        //Ejercicio 16
        double [][] matriz_18 = {
                {1,0},
                {0,-1}
        };

        if (Ortogonal(matriz_18) == true){
            System.out.println("Es una matriz ortogonal");
        } else {
            System.out.println("No es una matriz ortogonal");
        }

        //Ejercicio 17
        int [][] matriz_19 = crear_y_mostrar_matriz();
        System.out.println("Los valores minimos de cada fila: ");
        for (int i : minimo_fila(matriz_19)) {
            System.out.print(i + " ");
        }

        //Ejercicio 18
        double [][] matriz_20 = {
                {1,2,3},
                {4,5,6},
        };

        double [][] matriz_21 = {
                {1,2},
                {3,4},
                {5,6},
        };

        System.out.println("Matriz A:");
        for (int i = 0; i < matriz_20.length; i++){
            for (int j = 0; j < matriz_20[i].length; j++){
                System.out.print(matriz_20[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("Matriz B:");
        for (int i = 0; i < matriz_21.length; i++){
            for (int j = 0; j < matriz_21[i].length; j++){
                System.out.print(matriz_21[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        double [][] matriz_multiplicada = multiplicar_matrices(matriz_20,matriz_21);
        if ( matriz_multiplicada != null){
            System.out.println("Producto de ambas matrices: ");
            for (int i = 0; i < matriz_multiplicada.length; i++){
                for (int j = 0; j < matriz_multiplicada[i].length; j++){
                    System.out.print(matriz_multiplicada[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No se puede realizar la multiplicacion");
        }

    }
    public static double[][] multiplicar_matrices(double[][] matriz_A, double[][] matriz_B){
        int filas_A = matriz_A.length;
        int columnas_A = matriz_A[0].length;
        int filas_B = matriz_B.length;
        int columnas_B = matriz_B[0].length;

        if (columnas_A != filas_B){
            return null;
        }

        double[][] resultado = new double[filas_A][columnas_B];
        for (int i = 0; i < filas_A; i++){
            for (int j = 0; j < columnas_B; j++){
                double sum = 0;
                for (int k = 0; k < columnas_A; k++){
                    sum += matriz_A[i][k] * matriz_B[k][j];
                }
                resultado[i][j] = sum;
            }
        }
        return resultado;
    }
    public static int[] minimo_fila(int [][] matriz){
        int [] arreglo = new int[matriz[0].length];
        for (int i = 0; i < matriz.length; i++){
            int minimo = matriz[i][0];
            for (int j = 0 ; j < matriz.length; j++){
                if (matriz[i][j] < minimo){
                    minimo = matriz[i][j];
                }
            }
            arreglo[i] = minimo;
        }
        return arreglo;
    }
    public static boolean Ortogonal(double [][] matriz){
        if (matriz.length != matriz[0].length) {
            return false;
        }

        int n = matriz.length;

        double[][] transpuesta = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transpuesta[i][j] = matriz[j][i];
            }
        }

        double [][] matriz_inversa = invertirMatriz(matriz);

        return sonMatricesIguales(transpuesta, matriz_inversa);
    }

    private static boolean sonMatricesIguales(double[][] matriz1, double[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz1[i][j] != matriz2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    private static double[][] invertirMatriz(double[][] matriz) {
        int n = matriz.length;
        double[][] identidad = new double[n][n];
        // Inicializar la matriz identidad
        for (int i = 0; i < n; i++) {
            identidad[i][i] = 1;
        }

        // Aplicar eliminación mediante Gauss
        for (int i = 0; i < n; i++) {
            double pivote = matriz[i][i];

            // Dividir la fila por el pivote
            for (int j = 0; j < n; j++) {
                matriz[i][j] /= pivote;
                identidad[i][j] /= pivote;
            }

            // Eliminación hacia abajo y arriba
            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double factor = matriz[k][i];
                    for (int j = 0; j < n; j++) {
                        matriz[k][j] -= factor * matriz[i][j];
                        identidad[k][j] -= factor * identidad[i][j];
                    }
                }
            }
        }
        return identidad;
    }
    public static void suma_diagonales (int [][] matriz) {
        int tamano = matriz.length;

        // Sumar diagonal principal
        int sumaDiagonalPrincipal = 0;
        for (int i = 0; i < tamano; i++) {
            sumaDiagonalPrincipal += matriz[i][i];
        }
        System.out.println("Diagonal principal: " + sumaDiagonalPrincipal);

        // Sumar diagonales superiores
        for (int j = 1; j < tamano; j++) {
            int sumaDiagonalSuperior = 0;
            for (int i = 0; i < tamano - j; i++) {
                sumaDiagonalSuperior += matriz[i][i + j];
            }
            System.out.println("Diagonal superior " + j + ": " + sumaDiagonalSuperior);
        }

        // Sumar diagonales inferiores
        for (int i = 1; i < tamano; i++) {
            int sumaDiagonalInferior = 0;
            for (int j = 0; j < tamano - i; j++) {
                sumaDiagonalInferior += matriz[i + j][j];
            }
            System.out.println("Diagonal inferior " + i + ": " + sumaDiagonalInferior);
        }
    }

    public static int [][] invertir_filas(int [][] mat){
        int filas = mat.length;
        int columnas = mat[0].length;
        int [][] invertido = new int[filas][columnas];

        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                invertido[i][j] = mat[i][columnas - 1 - j];
            }
        }
        return invertido;
    }
    public static int[][] rotarMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[][] matrizRotada = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizRotada[j][filas - 1 - i] = matriz[i][j];
            }
        }

        return matrizRotada;
    }

    public static int contar_elemento(int[][]mat,int num){
        int contador = 0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (mat[i][j] == num){
                    contador++;
                }
            }
        }
        return contador;
    }
    public static void pares_impares(int [][] mat){
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (mat[i][j] % 2 == 0){
                    pares++;
                } else {
                    impares++;
                }
            }
        }

        System.out.print("Cantidad de elementos pares: "+pares);
        System.out.println();
        System.out.print("Cantidad de elementos impares: "+impares);
    }
    public static int[][] crear_y_mostrar_matriz(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamaño de la matriz: ");
        int tam = sc.nextInt();
        System.out.println("Matriz:");
        int [][] matriz = random_matriz(tam);
        mostrar_matrices(matriz);

        return matriz;
    }
    public static boolean matriz_identidad(int[][] mat){
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if ((i == j && mat[i][j] != 1) || (i != j && mat[i][j] != 0)){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean matriz_diagonal(int [][] mat){
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (i != j && mat[i][j] != 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static int suma_unidimensional(int [][] mat, int fila){
        int sumador = 0;
        for (int columna = 0; columna < mat[fila].length; columna++) {
            sumador += mat[fila][columna];
        }
        return sumador;
    }

    public static int[] mostrar_munidimensional(int[]mat){
        System.out.println();
        int [] matriz_3 = new int[3];
        for (int i = 0; i < matriz_3.length; i++){
                System.out.print(mat[i]);
                System.out.print(" ");
            }
            System.out.println();
            return matriz_3;
        }

    public static int[][] suma_matrices(int[][]mat,int[][]mat2, int tamaño){
        int [][] matriz_3 = new int[tamaño][tamaño];
        for (int i = 0; i < matriz_3.length; i++){
            for (int j = 0; j < matriz_3[i].length; j++){
                matriz_3[i][j] = mat[i][j] + mat2[i][j];
            }
        }
        return matriz_3;
    }

    public static int[][] mostrar_matrices(int[][]mat){
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        return mat;
    }

    public static int[][] multiplicacion_matrices(int[][]mat,int[][]mat2, int tamaño){
        int [][] matriz_3 = new int[tamaño][tamaño];
        for (int i = 0; i < matriz_3.length; i++){
            for (int j = 0; j < matriz_3[i].length; j++){
                matriz_3[i][j] = mat[i][j] * mat2[i][j];
            }
        }
        return matriz_3;
    }

    public static int[][] matriz_traspuesta(int [][]mat){
        int n = mat.length;
        int [][] mat_T = new int[n][n];
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                mat_T[i][j] = mat[j][i];
            }
        }
        return mat_T;
    }

    public static boolean simetrica(int[][]mat, int[][] mat2){
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (mat[i][j] != mat2[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] producto_escalar (int[]mat, int mult){
        for (int i = 0; i < mat.length ; i++){
            mat[i] = mat[i] * mult;
        }
        return mat;
    }

    public static int suma_elementos (int [][] mat){
        int sumador = 0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length ; j++){
            sumador = mat[i][j] + sumador;
            }
        }
        return sumador;
    }

    public static void elemento_max(int [][] mat){
        int maximo = mat[0][0];
        int fila_max = 0;
        int columna_max = 0;
        for (int fila = 0; fila < mat.length; fila++){
            for (int columna = 0; columna < mat[fila].length; columna++){
                if (mat[fila][columna] > maximo){
                    maximo = mat[fila][columna];
                    fila_max = fila;
                    columna_max = columna;
                }
            }
        }
        System.out.println("El elemento mas grande en la matriz es: "+(maximo));
        System.out.println("La fila del elemento maximo es "+(fila_max+1)+" y la columna es "+(columna_max+1));
    }

    public static int[][] random_matriz (int tamaño) {
        Random ran = new Random();
        int [][] matriz = new int[tamaño][tamaño];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = ran.nextInt(10);
            }
        }
        return matriz;
    }

}
