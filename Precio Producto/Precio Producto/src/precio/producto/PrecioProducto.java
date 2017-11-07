
package precio.producto;

import java.util.Scanner;

/**
 *
 * @author LAB 314
 */
public class PrecioProducto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       int comision;
       double precio;
       float costo;
               Scanner teclado=new Scanner (System.in);
                       System.out.println("Bienvenido al programa"); 
                       
                       System.out.println("favor de ingresar el costo del producto");
                       costo=teclado.nextFloat();
                       System.out.println("cual es la comision del vendedor?");
                       comision=teclado.nextInt();
                    
                       
                       precio=costo+(costo*0.16)+costo*(float)comision/100;/*se puede forzar a una expresion hacer de un tipo especifico usando la condicion llamada cast*/
                    
                       System.out.println("el precio del producto es de:$"+precio);
                       
                       
                       
    }
}
