package desafiouno;


import reversa.ReverseBurbuja;

import java.util.ArrayList;
import java.util.List;

public class CodigoDesafioUno {



    public static void main (String[] args) {



        organizarLista(new int[]{1,2,3,4,5,6},6);

    }


    //se crea el metodo el cual recibe el array y el valor de S
    public static void organizarLista (int [] array, int s) {
        List<Integer> totalFinal = new ArrayList<>();

     //creamos la iteration del array
        for(int num: array){
            //usamos el metodo StringBuilder para porder manipular la cadena sin crear nuevos objetos
            StringBuilder action_numero = new StringBuilder();

            //comvertimos el numero a cadena de texto y lo comparamos con el valor de s

            for(char item : String.valueOf(num).toCharArray()){
                if(Character.getNumericValue(item) < s){
                    //append nos ayuda a dar formato al contenido enviado por el StringBuilder
                    //acepta que posiciones numerica sean strings
                    action_numero.append(item);
                }
            }
            if(action_numero.length()>0){

                totalFinal.add(Integer.parseInt(action_numero.toString()));


                ReverseBurbuja reverseBurbuja = new ReverseBurbuja();
                reverseBurbuja.vueltaArray(totalFinal);
            }

        }
        System.out.println("el numero es : "+ totalFinal);

    }
}
