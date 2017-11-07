
package compañia.de.luz;

import java.util.Scanner;

/**LA COMPAÑIA DE LUZ DESEA IMPRIMIR EL RECIBO DE UN CLIENTE EN EL ULTIMO 
 * PERIODO CONSIDERANDO LOS SIGUIENTES :
 * NOMBRE:
 * DOMICIO:
 * CONSUMO INICIAL:
 * CONSUMO FINAL:
 *
 *
 * RODRIGUEZ APARICIO YAIR Todos los derechos reservados®
 */
public class CompañiaDeLuz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String nombre,dom;
        int ci,cf,total;
        double pago;
         Scanner teclado=new Scanner(System.in);
            System.out.println("Welcome to the Software");
            System.out.println("\tPor favor introdusca su nombre");
         nombre = teclado.nextLine();
         System.out.println("\tPor favor introdusca su domicilio");
            dom=teclado.nextLine();
            System.out.println("\tIngrese su consumo inicial");
            ci=teclado.nextInt();
            System.out.println("\tIngrese su consumo final");
            cf=teclado.nextInt();
        total=cf-ci;
          if(total<=140)
            pago=30;
              else 
                  if(total>141&&total<=310)
                     pago=30+((total-140)*0.15);
                         else
                        pago=30+(170*.15)+((total-310)*.05);
                            System.out.println ("\tNombre: "+nombre+"\tDomicilio:"+dom);
                                System.out.println("\tConsumo Total: "+total+"\tTotal a Pagar:$"+pago+ " Pesos ");
                                        System.out.println("Gracias por utilizar el programa ");
               }
    
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
