
package ejercicio3boletin5;

import javax.swing.JOptionPane;

/**
 *
 * @author Brais
 */
public class Ejercicio3Boletin5 {

    public static void main(String[] args) {
        
        int num1;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Introducir valor para número"));
        
        if (num1>0){
            System.out.println("+");
        }
        else if (num1==0){
            System.out.println("0");
        }
        else 
            System.out.println("-");
    
    }
    }

