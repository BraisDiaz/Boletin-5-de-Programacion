/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5boletin5;

/**
 *
 * @author Brais
 */
public class Mayorde3 {
    
    private int num1,num2,num3;
    
    public Mayorde3 (){
        
    }
    public Mayorde3 (int n1, int n2, int n3){
 
    num1 = n1; num2 = n2; num3 = n3;
    }

    public void comparar (int n1, int n2, int n3){
        
        if (n1>n2 && n1>n3){
            System.out.println("O número maior é " + n1);
        }
            else if (n2>n1 && n2>n3){
                    System.out.println("O número maior é " +n2);
            }
            else if (n3>n1 && n3>n2){
                    System.out.println("O número maior é " +n3);
                    }
            else 
                System.out.println("Os tres números son iguais");
           
 }
}

