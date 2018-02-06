/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrito;

/**
 *
 * @author HP
 */
public class Carrito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //INSTANCIAR
        Molde carrito1 = new Molde();
        //carrito1.color = "aqua blue";
        carrito1.setColor("Narcotic blue");
        carrito1.setMarca("The best");
        carrito1.setModelo("Estudiantil");
        carrito1.setTransmision("Especial");
        carrito1.setPuertas(24);
        System.out.println("El color es: " + carrito1.color);
        System.out.println("La transmision es: " + carrito1.transmision);
        System.out.println("La marca es: " + carrito1.marca);
        System.out.println("El modelo es: " + carrito1.modelo);
        System.out.println("Las puertas son: " + carrito1.puertas);   
    }
    
}
