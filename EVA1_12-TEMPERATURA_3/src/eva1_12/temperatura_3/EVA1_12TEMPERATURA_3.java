/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12.temperatura_3;

import java.util.Scanner;

/**
 *
 * @author Josea
 */
public class EVA1_12TEMPERATURA_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double kelvin, cel, fah; //variable (identificadores validos)
        Scanner captu = new Scanner(System.in);
        //SOLICITAR LOS DATOS AL USUARIO
        System.out.println("Introduccir la Temperatura En Kelvin: ");
        kelvin = captu.nextDouble();
        //HACER EL CALCULO
        cel = kelvin - 273.15;
        fah = 1.8 * (kelvin - 273.15) + 32;
        //MOSTRAR RESULTADO AL USUARIO
        System.out.println(kelvin + "°K = " + cel + "°C " );
        System.out.println(kelvin + "°K = " + fah + "°F " );
    }
    
}
