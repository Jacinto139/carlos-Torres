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
public class Molde {
    public String color;
    public String modelo;
    public String transmision;
    public int puertas;
    public String marca;
//CONSTRUCTOR    
    public Molde(){
        marca = "Unknow";
        color = "Not Available";
        modelo = "Not Available";
        transmision = "Not Available";
        puertas = 0;
    
    }
                       //parametros lo que esta en el parentesis
    public void setColor(String valor){
        color = valor;
    }
    public void setModelo(String valor){
        modelo = valor;
    }
    public void setTransmision(String valor){
        transmision = valor;
    }
    public void setMarca(String valor){
        marca = valor;
    }
    public void setPuertas(int valor){
        puertas = valor;
    }
}