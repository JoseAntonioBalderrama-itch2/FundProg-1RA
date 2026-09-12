/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_vehiculo;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_6_VEHICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String marca;
        String modelo;
        int año;
        String color;
        int kilometraje;
        double precio;
        
        Scanner captu = new Scanner(System.in);
        System.out.println("La Marca Del Carro: ");
        marca = captu.nextLine();
        System.out.println("El Modelo Del Carro: ");
        modelo = captu.nextLine();
        System.out.println("Color Del Carro: ");
        color = captu.nextLine();
        System.out.println("El Año Del Carro: ");
        año = captu.nextInt();
        System.out.println("El Kilometraje Del Carro: ");
        kilometraje = captu.nextInt();
        System.out.println("Precio Del Carro: ");
        precio = captu.nextDouble();
        
        System.out.println("++++DATOS CAPTURADOS++++");
        System.out.print("Marca Del Carro: ");
        System.out.println(marca);
        System.out.print("Modelo Del Carro: ");
        System.out.println(modelo);
        System.out.print("Año Del Carro: ");
        System.out.println(año);
        System.out.print("Color Del Carro: ");
        System.out.println(color);
        System.out.print("Kilometraje Del Carro: ");
        System.out.println(kilometraje);
        System.out.print("Precio Del Carro: ");
        System.out.println(precio);
        
    }
    
}
