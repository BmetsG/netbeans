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
public class Fabrica {
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in); 
        
        Pedido nuevopedido=new Pedido();
        
        nuevopedido.pedirProducto(1);
        nuevopedido.pedirProducto(2);
        nuevopedido.pedirProducto(3);
        
        System.out.println(nuevopedido.producto1.iguales(nuevopedido.producto3));
        
        nuevopedido.mostrarPedido();
                
                
        
        
    }
    
}
