package reversa;

import java.util.List;

public class ReverseBurbuja {

    public void vueltaArray(List<Integer> array){
     int n = array.size();
     boolean serealizaCambio;


     //creamos un bucle para pasar todos lo elementos y saber cuantas vueltas tiene que dar
        for (int i = 0; i< n - 1; i++){
            serealizaCambio = false;


            //creamos la comparacion para empezar a mover los elementos
            for (int j = 0; j< n-1-i; j++ ){
                if(array.get(j) < array.get(j+1))  {

                    //intercambiamos los elemento si el elemento actual es menor
                    int posi = array.get(j);
                    array.set(j, array.get(j+1));
                    array.set(j+1,posi);

                    serealizaCambio = true;                }
            }
            if(!serealizaCambio){
                break;
            }

          }
        }
    }


