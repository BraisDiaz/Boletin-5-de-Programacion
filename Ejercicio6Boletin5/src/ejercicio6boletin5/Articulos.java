
package ejercicio6boletin5;

/**
 *
 * @author Brais
 */
public class Articulos {
    
    private int productos;
    
    public Articulos (){
        
    }
    public Articulos (int prod){
        this.productos = prod;
    }
    public void compararArticulos (int prod){
        
         if (prod>100 && prod<=500){
            System.out.println("É un artigo de consumo medio");
         }
            else if (prod<=1000 && prod>500){
                     System.out.println("É un artigo de consumo alto");
            }
            else if (prod>1000){
                     System.out.println("É un artigo de primeira necesidade");
            }
                     else {
                     System.out.println("É un artigo de consumo baixo");
                     }
     } 
}



