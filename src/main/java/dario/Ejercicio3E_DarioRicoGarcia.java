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

        // Creamos el primer bucle, donde si la opcion es diferente a calcular o terminar
        // se vuelve a pedir
        String opcion;
        String codigo;
        do { // Bucle del menú inicial

            // Creamos el menú de las opciones
            String opcionTexto = """
                          ----------------------------------------------------------------
                                                    MENÚ
                          ----------------------------------------------------------------
                          Para realizar los cálculos: calcular
                          Para terminar el programa: terminar
                          ----------------------------------------------------------------""";

            opcion = JOptionPane.showInputDialog(opcionTexto);

            if (opcion.equalsIgnoreCase("calcular")){
            
                do {
                    String opcionCodigo = """
                                          Di el código del producto""";
                    codigo = JOptionPane.showInputDialog(opcionCodigo);
                    System.out.println("cálculos");
                } while (!(codigo.equalsIgnoreCase("M1")));
            
            
            
            
            }

        } while (!opcion.equalsIgnoreCase("terminar"));

    }
}
