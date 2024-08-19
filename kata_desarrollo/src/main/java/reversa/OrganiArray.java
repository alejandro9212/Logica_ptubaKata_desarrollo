package reversa;

import java.util.List;

public class OrganiArray {

    public void OrArray(int [] array){
        int b = array.length;
        boolean cambio;


        //creamos un bucle para pasar todos lo elementos
        for (int i = 0; i< b - 1; i++){
            cambio = false;


            //creamos la comparacion para empezar a mover los elementos
            for (int j = 0; j< b-1-i; j++ ){
                if(array[j] > array[j+1])  {

                    //intercambiamos los elemento si el elemento actual es menor
                    int posi = array[j];
                    array[j]= array[j+1];
                    array[j+1]=posi;

                    cambio = true;                }
            }
            if(!cambio){
                break;
            }

        }
    }
}
