package gal.teis.ejemplo_javadoc;

public class Libreria {

    /**
     * Devuelve el factorial del número introducido
     *
     * @param num. Tipo Int. Número del que se quiere calcular el factorial
     * @return Tipo Int. Devuelve el factorial del número introducido
     */
    public static int ejer1_Factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    /**
     * Devuelve el sumatorio del número introducido
     *
     * @param num. Tipo Int. Número del que se quiere calcular el sumatorio
     * @return Tipo Int. Devuelve el sumatorio del número introducido
     */
    public static int ejer2_Sumatorio(int num) {
        int sumatorio = 0;
        for (int i = 1; i <= num; i++) {
            sumatorio += i;
        }
        return sumatorio;
    }

    /**
     * Devuelve los divisores del número introducido
     *
     * @param num. Tipo Int. Número del que se quieren calcular los divisores
     * @return Tipo StringBuilder. Devuelve los divisores del número introducido
     */
    public static StringBuilder ejer3_Divisores(int num) {
        StringBuilder divisores = new StringBuilder("");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisores.append(i + " ");
            }
        }
        return divisores;
    }

    /**
     * Devuelve la media de los valores negativos y el número de ceros del array
     * de números introducido
     *
     * @param num. int[]. Números de los que queremos calcular la media de los
     * negativos y la suma de los ceros
     * @return Tipo int[]. Media de los números negativos introducidos y total
     * de ceros introducidos
     */
    public static double[] ejer4_MediasVarias(double[] num) {
        double media_negativos, cantidad_ceros = 0, suma_negativos = 0, negativos = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0) {
                negativos +=1;
                suma_negativos += num[i];
            } else if (num[i] == 0) {
                cantidad_ceros += 1;
            }
        }
        media_negativos = suma_negativos/negativos;
        double respuesta[] = {media_negativos, cantidad_ceros};
        return respuesta;
    }

    /**
     * Indica si el número introducido es primo o no
     *
     * @param num.Tipo int. Número del que queremos conocer si es primo.
     * @return Tipo boolean. Devuelve true si el número es primo, false si no lo
     * es
     */
    public static boolean ejer5_Primos(int num) {
        boolean primo = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
            }
        }
        return primo;
    }

    
  /**
   * Devuelve una escalera de números que se incrementa desde el uno hasta
   * el número indicado por parámetro
   * 
   * @param tope. Tipo int: Número hasta el que llegará la escalera. 
   * @return Tipo StringBuilder. Devuelve la escalera de números. 
   */  
    
    public static StringBuilder ejer6_Escalera(int tope) {
        StringBuilder escalera = new StringBuilder("");
        StringBuilder peldano = new StringBuilder("");
        for (int i = 0; i <= tope; ++i) {
            for (int j = 1; j <= i; j++) {
                peldano.append(j);
            }
            escalera.append(peldano + "\n");
            peldano.setLength(0);
        }
        return escalera;
    }
}
