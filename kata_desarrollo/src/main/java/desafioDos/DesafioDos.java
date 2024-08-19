package desafioDos;

import reversa.OrganiArray;

public class DesafioDos {

    public static void main (String[] args) {

        int[] input1 = {12,13,14,15,16,17,18};

        System.out.println(java.util.Arrays.toString(operarcionArray(input1, 16)));


    }

    public static int[] operarcionArray(int[] array, int s){
        //elevamos al cuadrado cada numero
        int a = array.length;
        int[] totalItems = new int[a];
        int count = 0;

        for (int i=0; i< a; i++){
            int multi = array[i]*array[i];

            if(multi <=s*s){
                totalItems[count++] = multi;
            }

        }
        //nos permite asociar el valor del array
        int[] finalresultado = new int[count];
        System.arraycopy(totalItems,0,finalresultado,0,count);

        OrganiArray organiArray = new OrganiArray();
        organiArray.OrArray(finalresultado);

        return finalresultado;

    }
}
