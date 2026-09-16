/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_temperatura2;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_11_TEMPERATURA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double far, cel, kelvin; //variable (identificadores validos)
        Scanner captu = new Scanner(System.in);
        //SOLICITAR LOS DATOS AL USUARIO
        System.out.println("Introduccir los grados farenheit: ");
        far = captu.nextDouble();
        //HACER EL CALCULO
        cel = (far - 32) / 1.8;//AQUI DI IMPORTA EL PARENTENSIS
        kelvin = (far - 32) * (5 / 9.0) + 273.15;// ojo 5 / 9 da CERO, 5/9.0 DA 0.5
        //MOSTRAR RESULTADO AL USUARIO
        System.out.println(far + "°F = " + cel + "°C " );
        System.out.println(far + "°F = " + kelvin + "°K " );
    }
    
}
