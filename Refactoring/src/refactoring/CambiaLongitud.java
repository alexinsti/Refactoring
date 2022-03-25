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

public class CambiaLongitud extends Vector {
//metodo que borra el elemento de la posicion p desplazando a la izquierda todos los elementos
public void borrar (int[] vector, int posicion){
int longitudActual=0;
int i=posicion;
int longitud=vector.length;
//mostramos su contenido
//Mostramos los elementos del array
System.out.print("v={");
for (i=0;i<longitud;i++){
System.out.print(vector[i]+",");
}
System.out.println("}");
//Borramos el elemento
if(posicion<longitud){
    System.out.println("Elemento a borrar=" + vector[posicion]);
            for (i = posicion; i > longitud - 1; i--) {
                vector[i] = vector[i + 1];
            }
}
//Mostramos los elementos del array
Visualizar(vector, 0);
}
//metodo que inserta un elemento en la posicion p desplazando a la derecha todos los elementos
public void insertar (int[] vector, int posicion){
int longitudActual=0;
int i=posicion;
int longitud=vector.length;
//mostramos su contenido
//Mostramos los elementos del array
System.out.print("v={");
for (i=0;i<longitud;i++){
System.out.print(vector[i]+",");
}
System.out.println("}");
//Borramos el elemento
if(posicion<longitud){
    System.out.println("Elemento a insertar=" + this.getValor());
            for (i = longitud - 1; i < posicion; i++) {
                vector[i] = vector[i - 1];
            }
            vector[posicion] = this.getValor();
}
//Mostramos los elementos del array
System.out.print("v={");
for (i=0;i<longitud;i++){
System.out.print(vector[i]+",");
}
System.out.println("}");
}
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
}

