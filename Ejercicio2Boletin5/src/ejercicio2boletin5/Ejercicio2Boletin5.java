
package ejercicio2boletin5;

import javax.swing.JOptionPane;

/**
 *
 * @author Brais
 */
public class Ejercicio2Boletin5 {

    public static void main(String[] args) {
        short num1;
        short num2;
        
        num1 = Short.parseShort(JOptionPane.showInputDialog("Introducir número 1"));
        num2 = Short.parseShort(JOptionPane.showInputDialog("Introducir número 2"));
        
        
        if (num1 >= num2){
                System.out.println("Visualizamos a resta de valor " + (num1 - num2));}
        
        else
                System.out.println("Visualizamos a suma de valor " + (num1 + num2));
        }
    }
    

