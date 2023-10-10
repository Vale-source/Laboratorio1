import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Ejercicio 1
        int[] arreglo_1 = {2, 4, 1, 3, 6, 5};
        Arrays.sort(arreglo_1);

        System.out.println("Arreglo de menor a mayor: ");
        for (int i : arreglo_1) {
            System.out.print(i + " ");
        }

        System.out.println();

        //Ejercicio 2
        Integer[] arreglo_2 = {2, 4, 1, 3, 6, 5};
        Arrays.sort(arreglo_2, Collections.reverseOrder());

        System.out.println("Arreglo de mayor a menor: ");
        for (int i : arreglo_2) {
            System.out.print(i + " ");
        }

        System.out.println();
        //Ejercicio 3
        double[] arreglo_3 = {2.5, 4.5, 1.3, 3.2, 6.9, 5.7};
        Arrays.sort(arreglo_3);

        System.out.println("Arreglo de flotantes de menor a mayor: ");
        for (double i : arreglo_3) {
            System.out.print(i + " ");
        }

        System.out.println();
        //Ejercicio 4
        Double[] arreglo_4 = {2.5, 4.5, 1.3, 3.2, 6.9, 5.7};
        Arrays.sort(arreglo_4, Collections.reverseOrder());

        System.out.println("Arreglo de flotantes mayor a menor: ");
        for (double i : arreglo_4) {
            System.out.print(i + " ");
        }

        System.out.println();
        //Ejercicio 5
        String[] arreglo_5 = {"java", "python", "ruby", "C"};
        Arrays.sort(arreglo_5);

        System.out.println("Arreglo ordenado alfabeticamente: ");
        for (String i : arreglo_5) {
            System.out.print(i + " ");
        }

        System.out.println();
        //Ejercicio 6
        String[] arreglo_6 = {"java", "python", "ruby", "C"};
        Arrays.sort(arreglo_6, Collections.reverseOrder());

        System.out.println("Arreglo ordenado inversamente: ");
        for (String i : arreglo_6) {
            System.out.print(i + " ");
        }

        System.out.println();
        //Ejercicio 9
        int aux;
        int[] arreglo_9 = {50, 26, 7, 9, 15, 27};
        for (int i = 0; i < arreglo_9.length - 1; i++) {
            for (int j = 0; j < arreglo_9.length - i - 1; j++) {
                if (arreglo_9[j + 1] < arreglo_9[j]) {
                    aux = arreglo_9[j + 1];
                    arreglo_9[j + 1] = arreglo_9[j];
                    arreglo_9[j] = aux;
                }
            }
        }

        for (int x : arreglo_9) {
            System.out.print(x + " ");
        }
        System.out.println();

        //Ejercicio 10
        int aux_1;
        int[] arreglo_10 = {50, 26, 7, 9, 15, 27};
        int i, j, menor, pos, tmp;
        for (i = 0; i < arreglo_10.length - 1; i++) {
            menor = arreglo_10[i];
            pos = i;
            for (j = i + 1; j < arreglo_10.length; j++) {
                if (arreglo_10[j] < menor) {
                    menor = arreglo_10[j];
                    pos = j;
                }
            }
            if (pos != i) {
                tmp = arreglo_10[i];
                arreglo_10[i] = arreglo_10[pos];
                arreglo_10[pos] = tmp;
            }
        }

        System.out.println();
        //Ejercicio 11
        int p, f;
        int aux_2;
        int[] A = {50, 26, 7, 9, 15, 27};
        for (p = 1; p < A.length; p++) {
            aux_2 = A[p];
            f = p - 1;
            while ((f >= 0) && (aux_2 < A[f])) {

                A[f + 1] = A[f];
                f--;
            }
            A[f + 1] = aux_2;
        }

        System.out.println();
        //Ejercicio 12
        int[] arreglo_11 = {50, 26, 7, 9, 15, 27};
        int izq = 0;
        int der = 5;
        quicksort(arreglo_11, izq, der);

        System.out.println();
        //Ejercicio 13

        int salto, aux_3, k;
        boolean cambios;

        for (salto = A.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {
                cambios = false;
                for (k = salto; k < A.length; k++) {
                    if (A[k - salto] > A[k]) {
                        aux_3 = A[k];
                        A[k] = A[k - salto];
                        A[k - salto] = aux_3;
                        cambios = true;
                    }
                }
            }
        }
        int[] array = new int[20];

        System.out.println("Ingrese 20 enteros:");

        for (int o = 0; o < array.length; o++) {
            array[o] = input.nextInt();
        }

        System.out.println("Array original:\n" + Arrays.toString(array));

        System.out.println("Elija la opción de ordenamiento:\n1. Ascendente\n2. Descendente");
        int opcion = input.nextInt();

        if (opcion == 1) {
            bubbleSortAscendente(array);
            System.out.println("Array ordenado ascendente:\n" + Arrays.toString(array));
        } else if (opcion == 2) {
            bubbleSortDescendente(array);
            System.out.println("Array ordenado descendente:\n" + Arrays.toString(array));
        }

        input.close();
    }

    public static void bubbleSortAscendente(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortDescendente(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }



    public static void quicksort(int A[], int izq, int der) {

        int pivote=A[izq];
        int i=izq;
        int j=der;
        int aux;

        while(i < j){
            while(A[i] <= pivote && i < j) i++;
            while(A[j] > pivote) j--;
            if (i < j) {
                aux= A[i];
                A[i]=A[j];
                A[j]=aux;
            }
        }

        A[izq]=A[j];
        A[j]=pivote;

        if(izq < j-1)
            quicksort(A,izq,j-1);
        if(j+1 < der)
            quicksort(A,j+1,der);

    }
}