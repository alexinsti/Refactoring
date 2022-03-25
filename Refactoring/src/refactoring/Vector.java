/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package refactoring;

/**
 *
 * @author alejandro
 */
public class Vector {
    
    protected int valor;

    public void Visualizar(int[] vector, int posicion) {
        int i = posicion;
        int longitud = vector.length;
        System.out.print("v={");
        for (i = 0; i < longitud; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
    }
    
}
