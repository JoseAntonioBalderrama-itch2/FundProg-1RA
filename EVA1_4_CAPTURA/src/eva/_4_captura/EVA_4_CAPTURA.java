/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva._4_captura;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA_4_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SI VAMOS A USAR VARIABLES, SE TIENEN QUE "DECLARAR" ANTES DE USA 
        //DECLARAR --> CREAR LA VARIABLE PARA SU USO EN EL PROGRAMA 
        //TIPO_DATO NOMBRE_INDENTIFICADOR;
        //USAR NOMBRES SIGNIFICATIVOS --> DEBE DECIR QUE SE USA 
        String nombre;//declaracion de la variable
        Scanner captu = new Scanner(System.in); //Otra variable --> captu de tipo Scanner
        //Capturar del teclado y ponerlo en la variable nombre
        //escribir en la variable (poner un valor) ASIGNACION
        System.out.println("captura el nombre:"); 
        //ENTRADA DE DATOS DEL TECLADO (JAVA)
        nombre = captu.nextLine();
        System.out.println("El valor capturado es ");
        System.out.println(nombre);//USO DE LA VARIABLE --> LECTURA
        
    }   
    
    
}
