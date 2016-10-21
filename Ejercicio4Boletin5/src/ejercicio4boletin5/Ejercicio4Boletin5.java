
package ejercicio4boletin5;


public class Ejercicio4Boletin5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        float juan = 67, pablo = 74;
        
        if (pablo>juan){
        
            System.out.println("Pablo pesa " + (pablo - juan) + "kilos más que Juan");
        }
        else if (pablo==juan){
            
            System.out.println("Pablo y Juan tienen el mismo peso");
        }
        else {
            System.out.println("Juan pesa " + (juan - pablo) + "kilos más que Pablo");
        }
}
}
