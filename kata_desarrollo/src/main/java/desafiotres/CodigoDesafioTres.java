package desafiotres;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CodigoDesafioTres {
    public static void main (String[] args) {

        System.out.println(buscarCantidad(new int[]{5, 7, 1, 1, 2, 3, 22}));
        System.out.println(buscarCantidad(new int[]{1,2,4}));
        System.out.println(buscarCantidad(new int[]{1,5,8}));


    }

    public static int buscarCantidad (int[] monedas){
        Arrays.sort(monedas);

        int minimaCantidad = 1;
     //con este bucle recorre cada moneda del array si la moneda es que la variable minima cantidad
        
        for(int moneda: monedas ){
            if(moneda > minimaCantidad){
                break;
            }

            minimaCantidad += moneda;
        }



        return minimaCantidad;
    }
}
