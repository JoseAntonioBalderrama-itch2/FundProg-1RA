/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_formula_general;

import java.util.Scanner;

/**
 *
 * @author Josea
 */
public class EVA1_14_FORMULA_GENERAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARAR
        //CAPTURAR
        //MOSTRAR RESULTADO
        double a, b, c, x1, x2;
        Scanner captu = new Scanner(System.in);
        System.out.println("CUALES SON LOS VALORES DE A");
        a = captu.nextDouble();
        System.out.println("CUALES SON LOS VALORES DE B");
        b = captu.nextDouble();
        System.out.println("CUALES SON LOS VALORES DE C");
        c = captu.nextDouble();
       //CALCULAR 1 (TODO REVUELTO)
        x1 = (-1 * b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
        x2 = (-1 * b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
        
        //MOSTRAR RESULTADO AL USUARIO
        System.out.println( "Raiz 1 = " + x1 );
        System.out.println( "Raiz 2 = " + x2 );
    }
    
}
