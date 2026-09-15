/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_operaciones;

/**
 *
 * @author bisonte
 */
public class EVA1_7_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EL TIPO DE DATO DETERMINA LAS OPERACIONES
        //ENTEROS, REALES, CADENAS, LOGICOS, ETC
        //EXPRESION:
        //VALORES
        //VARIABLES
        //OPERADORES
        //FUNCIONES
        //QUE SE VAN EVALUAN PARA OBTENER UN RESULTADO
        //OPERACIONES CON NUMEROS:
        //ARITMETICAS:
        int suma, val1, val2; //declaro 3 variables del mismo tipo
        //ASIGNACION: PONER UN VALOR EN UNA VARIABLE
        //operador --> simbolo que trabaja SOBRE identificadores.
        //  = --> asignacion --> poner el valor 
        // == --> comparacion
        val1 = 100; //asignar el valor de 100 a la variable vall
        val2 = 50;
        suma = val1 + val2;//expresion, asignar a la variable suma la operacion entre val1 y val2 (+)
        //+ --> esta entre dos enteros, se interpreta como que los debe sumar
        System.out.print("Val1 = ");
        System.out.println(val1);
        System.out.print("Val2 = ");
        System.out.println(val2);
        System.out.print("Suma = ");
        System.out.println(suma);
        //OPERACIONES RESPETAN REGLAS MATEMATICAS
        //MULTIPLICACION
        // *
        int multi;
        multi = val1 * val2;
        System.out.print("Mulplicacion = ");
        System.out.println(multi);
        // divicion
        // / --> operacion de division
        int divi;
        divi = val1 / val2;
        System.out.print("Division = ");
        System.out.println(divi);
        val1 = 10;
        val2 = 3;
        divi = val1 / val2;
        System.out.print("Val1 = ");
        System.out.println(val1);
        System.out.print("Val2 = ");
        System.out.println(val2);
        System.out.print("Division = ");
        System.out.println(divi);
        double resu;
        resu = val1 / val2;
        System.out.print("Resultado = ");
        System.out.println(resu);
        double val2copia;
        val2copia = 3;
        resu = val1 / val2copia;
        System.out.print("Resultado = ");
        System.out.println(resu);
        
    }
}
