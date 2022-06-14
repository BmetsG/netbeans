/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

import java.util.Scanner;

/**
 *
 * @author natal
 */
public class Pedido {
     Scanner entrada=new Scanner(System.in); 
    
    Producto producto1;
    Producto producto2;
    Producto producto3;

   
   public void pedirProducto(int numero){
       while(numero!=1&&numero!=2&&numero!=3){
            System.out.println("DIME QUE PRODUCTO VAS A SELECCIONAR 1,2 o 3");
            numero=entrada.nextInt();  
}
       switch (numero){
           case 1:
               
               System.out.println("VÁLIDO");
              
               producto1.pedirNombre();
               producto1.pedirPrecio();
                     
                    
               break;
           case 2:
               
               System.out.println("VÁLIDO");
               
               producto2.pedirNombre();
               producto2.pedirPrecio();
                    
               break;
           case 3:
               
               System.out.println("VÁLIDO");
               
               producto3.pedirNombre();
               producto3.pedirPrecio();  
                    
               break;
               
           default:
               
               break;
           
               
       }
       
           
   
      
       }
   
   
   double total(){
       return (producto1.getPrecio()+producto2.getPrecio()+producto3.getPrecio());
   }
   
   public void mostrarPedido(){
       producto1.resumen();
       producto2.resumen();
       producto3.resumen();
       System.out.println("TOTAL: "+total());
   }
           
           
   public Pedido(){
       producto1=new Producto();
       producto2=new Producto();
       producto3=new Producto();
               
   }
   
 /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }  
   
}
