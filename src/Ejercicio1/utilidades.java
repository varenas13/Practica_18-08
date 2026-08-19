/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author USUARIO
 */
public class utilidades {
    public void imprimir(int []num){
        for (int i = 0; i < num.length; i++) {
            System.out.println("EL valor "+(i+1)+"es: "+num[i]);
        }
    }
     public void pares( int[] par, int cont, int valor){
        par[cont]=valor;
    }
        public void impares( int[] impar, int cont, int valor){
        impar[cont]=valor;
    }
     public int contarMayDiez(int[] mayDies) {
        int cont = 0;
        for (int i = 0; i < mayDies.length; i++) {
            if (mayDies[i] >10) {
                cont++;
            }
        }
        return cont;
    }

    public int contarMenCinco(int[] menCinc) {
        int cont = 0;
        for (int i = 0; i < menCinc.length; i++) {
            if (menCinc[i] <5) {
                cont++;
            }
        }
        return cont;
    }
}
