import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ejercicio 1
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);


        //Ejercicio 2
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Roberto");

        //Ejercicio 3
        for (Integer i: numeros) {
            System.out.print(i+" ");
        }

        System.out.println();

        //Ejercicio 4
        System.out.println("La longitud de la lista nombres es: "+nombres.size());

        //Ejercicio 5
        nombres.remove(1);
        System.out.println(nombres);

        //Ejercicio 6
        System.out.println("¿La lista de numeros esta vacia? "+numeros.isEmpty());

        //Ejercicio 7
        System.out.println("Lista: "+numeros);
        System.out.println("El elemento mas grande de la lista es: "+Collections.max(numeros));

        //Ejercicio 8
        ArrayList<Integer> numeros_2 = new ArrayList<>(numeros);
        System.out.println("Lista original: "+numeros);
        System.out.println("Lista copiada: "+numeros_2);


        //Ejercicio 9
        System.out.println("Lista original: "+numeros);
        ArrayList<Integer> listaInvertida = new ArrayList<>(numeros);
        Collections.reverse(listaInvertida);
        System.out.println("Lista invertida: " + listaInvertida);

        //Ejercicio 10
        ArrayList<Integer> numeros_3 = new ArrayList<>();
        numeros_3.add(6);
        numeros_3.add(7);
        numeros_3.add(8);
        numeros_3.add(9);
        numeros_3.add(10);

        ArrayList<Integer> fusion = new ArrayList<>(numeros);
        fusion.addAll(numeros_3);

        System.out.println(fusion);

        //Ejercicio 11
        ArrayList<Integer> impares = new ArrayList<>(fusion);
        for (int i = 0; i < impares.size(); i++) {
            if (impares.get(i) % 2 == 0) {
                impares.remove(i);
                i--;
            }
        }

        System.out.println(impares);

        //Ejercicio 12
        //Si colocamos otro nombre, dara la posicion actual - 1 debido a que en un ejercicio anterior elimine una posicion
        System.out.println("La posicion donde se encuentra el nombre Juan es en: "+nombres.indexOf("Juan"));

        //Ejercicio 13
        System.out.println("Lista 1: "+numeros);
        System.out.println("Lista 2: "+numeros_2);
        System.out.println("Lista 3: "+numeros_3);
        System.out.println("¿La lista 1 es igual a la lista 2? "+numeros.equals(numeros_2));
        System.out.println("¿La lista 1 es igual a la lista 3? "+numeros.equals(numeros_3));

        //Ejercicio 14
        System.out.println("Lista: "+numeros_3);
        System.out.println("El elemento mas grande de la lista es: "+Collections.min(numeros_3));

        //Ejercicio 15
        System.out.println("Lista: "+numeros_3);
        Integer suma = 0;
        for (Integer i : numeros_3){
            suma += i;
        }
        System.out.println("La suma de todos los elementos de la lista es: "+suma);

        //Ejercicio 16
        ArrayList<String> saludo = new ArrayList<>();
        saludo.add("Hola");
        saludo.add("que");
        saludo.add("tal");

        StringBuilder resultado = new StringBuilder();
        for (String i: saludo){
            resultado.append(i);
        }

        System.out.println(resultado);

        //Ejercicio 17
        ArrayList<String> nombres_repetidos = new ArrayList<>();
        nombres_repetidos.add("Juan");
        nombres_repetidos.add("Lucas");
        nombres_repetidos.add("Adrian");
        nombres_repetidos.add("Juan");

        for (int i = nombres_repetidos.size() - 1; i >= 0; i--) {
            String comparador = nombres_repetidos.get(i);
            for (int j = i - 1; j >= 0; j--) {
                if (comparador.equals(nombres_repetidos.get(j))) {
                    nombres_repetidos.remove(j);
                }
            }
        }
        System.out.println(nombres_repetidos);


        //Ejercicio 18
        ArrayList<Integer> enteros = new ArrayList<>();
        enteros.add(8);
        enteros.add(7);
        enteros.add(6);
        enteros.add(5);
        enteros.add(4);
        enteros.add(3);
        enteros.add(2);

        int suma_1 = 0;
        for (int i = 0; i < enteros.size(); i++){
            if (i % 2 == 0){
                suma_1 += enteros.get(i);
            }
        }

        System.out.println("La suma de los numeros en posiciones pares es: "+suma_1);

        //Ejercicio 19
        System.out.println("Lista: "+enteros);
        System.out.println("¿La lista contiene el numero 6? " + enteros.contains(6));

        //Ejercicio 20
        String longitud = "";
        for (int i = saludo.size() - 1; i >= 0; i--){
            String actual = saludo.get(i);
            for (int j = i - 1; j >= 0; j--) {

                if (saludo.get(j).length() > actual.length()) {
                    actual = saludo.get(j);
                }
            }
            if (actual.length() > longitud.length()) {
                longitud = actual;
            }
        }

        System.out.println("El elemento mas largo en la lista es: "+longitud);

        //Ejercicio 21
        Integer suma_2 = 0;
        Integer contador = 0;
        System.out.println("Lista actual: "+enteros);
        for (Integer i : enteros){
            suma_2 += i;
            contador++;
        }
        System.out.println("Promedio de los numeros de la lista: "+suma_2/contador);

        //Ejercicio 22

        ArrayList<Integer> ascendente = new ArrayList<>();
        ascendente.add(5);
        ascendente.add(10);
        ascendente.add(83);
        ascendente.add(2);
        ascendente.add(4);

        System.out.println("Lista actual: " + ascendente);
        Collections.sort(ascendente);
        System.out.println("Lista ordenada: " + ascendente);

        //Ejercicio 23
        ArrayList<Integer> numeros_4 = new ArrayList<>(ascendente);
        System.out.println("Ingrese un valor de referencia: ");
        Integer referencia = sc.nextInt();

        System.out.println("Lista: "+numeros_4);
        for (int i = numeros_4.size() - 1; i >= 0; i--){
            if (numeros_4.get(i) > referencia){
                numeros_4.remove(i);
            }
        }
        System.out.println("Lista con los valores eliminados"+numeros_4);

        //Ejercicio 24
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("hotel");
        palabras.add("casilla");
        palabras.add("mesero");
        palabras.add("hotel");

        System.out.println("Ingrese la palabra de referencia: ");
        String palabra = sc.next();
        palabra = palabra.toLowerCase();
        int contador_1 = 0;

        if (palabras.contains(palabra)){
            for (String i : palabras) {
                if (i.equals(palabra)){
                    contador_1++;
                    }
                }
            System.out.println("La palabra "+palabra+" aparce "+contador_1+" veces");
            } else {
            System.out.println("La palabra que desea buscar no existe");
        }


        //Ejercicio 25
        ArrayList<String> alfabeticamente = new ArrayList<>();
        alfabeticamente.add("Zorro");
        alfabeticamente.add("Mecanico");
        alfabeticamente.add("Amanecer");
        alfabeticamente.add("Empatia");
        alfabeticamente.add("Protuberancia");

        System.out.println("Lista original: "+alfabeticamente);
        Collections.sort(alfabeticamente);
        System.out.println("Lista ordenada alfabeticamente: "+alfabeticamente);
    }
}