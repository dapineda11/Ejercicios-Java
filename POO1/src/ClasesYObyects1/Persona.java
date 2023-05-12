/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYObyects1;

import javax.swing.JOptionPane;


public class Persona {
    ////Atributos
    String nombre;
    int edad;
    int cedula;
    
    
    ///Métodos

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(int cedula) {
        this.cedula = cedula;
    }

   
    public void reir (){
    JOptionPane.showMessageDialog(null, "Hola, soy "+nombre+", tengo "+edad+" \naños y me gustareír xd ajsjajjasjajajasja"
    +"\nmi numero de documento es 1026307400");
    }
    
}

