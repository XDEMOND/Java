
import java.util.Scanner;




/**
 *
 * @author R.A.Y.
 */
public class Edificio {
   public static int total_cimentar;
   public static int cimentado;
/*metodo constructor con el mismo nombre de la clase 
    * inicializa el atributo tatal a cimentar
    * 
    */
   public Edificio(int total){
   total_cimentar=total;
   }      
   //método que actualiza Y ACUMULA LOS METROS CIMENTADOS//
  public void cimentado(int metros){
         if(this.cimentado+metros>this.total_cimentar)
             System.out.println("error");
         else
             this.cimentado=this.cimentado+metros;}
  //es un metodo que proporciona lo que falta por cimentar
         public int resta(){
             return this.total_cimentar-this.cimentado;}
         
         //método que detemina si ya se cimento el total contra lo cimentado
         public boolean terminado(){
         if(this.cimentado==this.total_cimentar)
                 return true;
         else
             return false;
         }
         

    public static void main(String[] args) {
     int area,ahora;
     Scanner teclado=new Scanner(System.in);
        System.out.println("Bienvenido al programa edificio");
        System.out.println("favor de proporcional los metros a cimentar");
        area=teclado.nextInt();
        //Se crea una instancia llamada casa atravex de su constructor
        Edificio casa=new Edificio(area);
        do{
        System.out.println("cual es el área que determino a cimentar es:");
        System.out.println(casa.total_cimentar);
        System.out.println("favor de ingresar los metros cimentados en este momento");
        ahora=teclado.nextInt();
        casa.cimentado(ahora);
        casa.resta();
        System.out.println("Quedan estos metros:"+casa.resta());
                if(casa.terminado()==false)
                        System.out.println("la cimentacion aun no ha terminado");
        }while(casa.terminado()==false);
        System.out.println("se ha termido la cimentación");
    }
}
