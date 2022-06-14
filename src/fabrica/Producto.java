/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

/**
 *
 * @author natal
 */

import java.util.Scanner;

public class Producto {
    Scanner entrada=new Scanner(System.in); 
    
    String nombre;
    int serie;
    double precio;
    
    private int generar(){
        int aleatorio = 1+(int)(Math.random()*100000);
        return aleatorio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSerie() {
        return serie;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nuevonombre) {
        while(nombre.length()==0){
        System.out.println("INTRODUZCA UN NOMBRE VÁLIDO");
        nuevonombre=entrada.nextLine();
        }

        nombre=nuevonombre;
    }

    public void setPrecio(double nuevoprecio) {
        while(precio<0){
        System.out.println("INTRODUZCA UN PRECIO VÁLIDO");
        nuevoprecio=entrada.nextDouble();
        }
        precio=nuevoprecio;
    }
    
    public void pedirNombre(){
         System.out.println("INTRODUZCA UN NOMBRE VÁLIDO");
         setNombre( entrada.nextLine());
    }
    
    public void pedirPrecio(){
        System.out.println("INTRODUZCA UN PRECIO VÁLIDO");
        setPrecio( entrada.nextDouble());
    }
    
boolean iguales(Producto nuevoproducto){
        if (nombre.equals(nuevoproducto.getNombre())){
            if(serie==nuevoproducto.getSerie()){
                return true;
            }
    }
        return false;
}
    
    public void resumen(){
        System.out.println("INFORME DE PRODUCTO\n----------------\n<nombre:> "+getNombre()+"\n<serie:> "+getSerie()+"\n<precio:> "+getPrecio());
    }
    
    
    
    Producto(){
        nombre="chocokrispis";
        serie = generar();
        precio = 9.99;
    }
    Producto(String nombre, double precio){
        setNombre(nombre);
        setPrecio(precio);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto miProducto= new Producto();
        Producto miProducto2= new Producto();
        
        miProducto2.getNombre();
        
    }
    
    
}
