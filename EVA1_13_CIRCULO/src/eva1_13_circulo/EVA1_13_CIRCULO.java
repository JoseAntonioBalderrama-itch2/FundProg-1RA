/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_circulo;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_13_CIRCULO {
    static final double PI = 3.1416; //CONSTANTE
    static final String MENSAJE = "Radio: ";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radio ,per, are, vol; //variable AREA, VOLUMEN, PERIMETRO
        Scanner captu = new Scanner(System.in);
        //Math es una LIBRERIA de funciones matematicas
        System.out.println(MENSAJE);
        radio = captu.nextDouble();
        per = Math.PI * 2 * radio;
        are = Math.pow(radio, 2) * Math.PI;
        vol = (4 / 3.0) * Math.PI * radio * radio * radio;
        //MOSTRAR RESULTADO AL USUARIO
        System.out.println( "Perimetro = " + per );
        System.out.println("Area = " + are );
        System.out.println("volumen = " + vol );
    }
    
}
