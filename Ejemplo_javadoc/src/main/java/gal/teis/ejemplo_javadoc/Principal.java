package gal.teis.ejemplo_javadoc;

import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {

        System.out.println(Libreria.ejer1_Factorial(5));
        System.out.println(Libreria.ejer2_Sumatorio(9));
        System.out.println(Libreria.ejer3_Divisores(10));
        double[] num = {-4,-7, 0};
        System.out.println(Arrays.toString(Libreria.ejer4_MediasVarias(num)));
        System.out.println(Libreria.ejer5_Primos(16));
        System.out.println(Libreria.ejer6_Escalera(6));
        
    }

}
