
package ClasificacionCoches;

import java.util.Scanner;


public class Vehiculo {
    private String marca,modelo;
    private int precio;
    
    
    ////////Constructor

    public Vehiculo(String marca, String modelo, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    ////////Metodo para obtener precio

    public int getPrecio() {
        return precio;
    }
    
    public String mostrarDatos(){
    return "Marca: "+marca+"\nModelo: "+modelo+"\nPrecio(en dolares): "+precio;
    }
    
}