
package autolavado;

import java.util.Scanner;

/**
 *
 * @author LAB 314
 */
public class AutoLavado {

  
   public static int total_autos;
   public static int autos_lavados;

   public AutoLavado(int total){
   total_autos=total;
   }      
 
  public void AutosLavado(int carros){
         if(this.autos_lavados+carros>this.total_autos)
             System.out.println("error");
         else
             this.autos_lavados=this.autos_lavados+carros;}
  
         public int resta(){
             return this.total_autos-this.autos_lavados;}
         
        
         public boolean terminado(){
         if(this.autos_lavados==this.total_autos)
                 return true;
         else
             return false;
         }
         

    public static void main(String[] args) {
     int autos,momento;
     Scanner teclado=new Scanner(System.in);
        System.out.println("Bienvenido al programa MICROSOFT ");
            System.out.println("favor de proporcional los aUTOS A LAV AR en esta jornada de hoy");
        autos=teclado.nextInt();
       
        AutoLavado lavado=new AutoLavado(autos);
        do{
        System.out.println("carros a lavar en esta jornada:");
            System.out.println(lavado.total_autos);
                System.out.println("favor de ingresar los autos lavados en este momento");
        momento=teclado.nextInt();
        lavado.AutosLavado(momento);
        lavado.resta();
        System.out.println("Quedan estos autos:"+lavado.resta());
                if(lavado.terminado()==false)
                        System.out.println("la jornada aun no ha terminado");
        }while(lavado.terminado()==false);
        System.out.println("se ha terminado la jornada");
    }
}

