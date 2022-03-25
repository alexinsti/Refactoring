/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring;

/**
 *
 * @author Diurno
 */

public class NoCambiaLongitud extends Vector{

//metodo que modifica el contenido de la posicion p de un array con el valor pasado

void ModificaElemento(int[] vector, int posicion) {
//mostramos su contenido
System.out.println("Elemento a modificar="+vector[posicion]);
vector[posicion]=this.getValor();
}

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    //metodo que modifica el contenido de la posicion p de un array con el valor pasado
    public void modificar(int[] vector, int posicion, CambiaLongitud cambiaLongitud) {
        int longitudActual = 0;
        int longitud = vector.length;
        int i;
        //Mostramos los elementos del array
        System.out.print("v={");
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
        //Modificamos el array
        if (posicion < longitud) {
            cambiaLongitud.ModificaElemento(vector, posicion);
        }
        //Mostramos los elementos del array
        cambiaLongitud.Visualizar(vector, 0);
    }
}

