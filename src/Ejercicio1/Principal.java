/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Principal {
    public static void main(String[] args) {
        utilidades util= new utilidades();
        int []pares = new int [5];
        int []impares= new int [5];
        int cont=0;
        int dato=0;
        int contpar=0;
        int contimpar=0;
        Scanner leer = new Scanner (System.in);
        System.out.println("Escria 10 num positivo");
        System.out.println("======================");
        while (cont<10) {            
            System.out.println("Escrba el dato: "+(cont+1)+" : ");
            dato=leer.nextInt();
             if (dato == 0) {
                System.out.println("Escria un num positivo");
               continue;
            }
            if (dato%2==0) {
                util.pares(pares, contpar, dato);
                contpar++;
            }else{
                util.impares(impares, contimpar, dato);
                contimpar++;
            }
            cont++;
        }
        util.imprimir(pares);
        util.imprimir(impares);
        System.out.println("Valores mayores a 10 en pares son: "+util.contarMayDiez(pares));
        System.out.println("Valores mayores a 10 en impares son: "+util.contarMayDiez(impares));
        System.out.println("Valores menores a 5 en pares son: "+util.contarMenCinco(pares));
        System.out.println("Valores menores a 5 en impares son: "+util.contarMenCinco(impares));
        

    }
}
