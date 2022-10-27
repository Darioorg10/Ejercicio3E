/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package dario;

import javax.swing.JOptionPane;

/**
 *
 * @author dario
 */
public class Ejercicio3E_DarioRicoGarcia {

    public static void main(String[] args) {
        
        
        
        // Creamos el primer bucle, donde si la opcion es diferente a salir
        // se vuelve a pedir
        String opcion;
        do {

            // Creamos el menú de las opciones
        
        String opcionTexto = """
                          ----------------------------------------------------------------
                                                    MENÚ
                          ----------------------------------------------------------------
                          Para realizar los cálculos: calcular
                          Para terminar el programa: terminar
                          ----------------------------------------------------------------""";
                          
        opcion = JOptionPane.showInputDialog(opcionTexto);
        
        if (opcion.equals("calcular"))
            
        String codigo = JOptionPane.showInputDialog("Introduce el código "
                + "del dulce").toUpperCase();
            
        } while (opcion.equalsIgnoreCase("salir"));
            
            
            
        }
        
        
        
    }
}
