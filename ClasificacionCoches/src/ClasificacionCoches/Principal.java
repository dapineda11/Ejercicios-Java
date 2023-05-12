/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasificacionCoches;

import java.util.Scanner;


public class Principal {
    public static int barato(Vehiculo coches[]){
    double precio;
    int indice =0;
    
    precio=coches[0].getPrecio();
    for(int i=1;i<coches.length;i++){
        
    if (coches[i].getPrecio()<precio){
    precio=coches[i].getPrecio();
    indice=i;
    }
    }
    return indice;
    }
    
public static void main (String[] args){

  
   
 Scanner entrada=new Scanner (System.in);   
 
 String marca, modelo;
 int precio, numvehi,indicebarato;
 
System.out.print("Ingrese la cantidad de vehículos: ");
numvehi=entrada.nextInt();

////Creamos los objetos que el usuario quiera

Vehiculo coches[]=new Vehiculo[numvehi];

for (int i=0; i<coches.length;i++){
    
    entrada.nextLine();
    System.out.println("\n||||CARACTERÍSTICAS COCHE "+(i+1)+" ||||| ");
    System.out.println("\nIntroduzca la marca del coche: ");
    marca=entrada.nextLine();
    System.out.println("\nIntroduzca el modelo del coche: ");
    modelo=entrada.nextLine();
    System.out.println("\nIntroduzca el precio del coche: ");
    precio=entrada.nextInt();
    
    coches[i]=new Vehiculo(marca,modelo,precio);
    
    
}
indicebarato =barato(coches);
    System.out.println("\nEl coche más barato es: ");
    System.out.println(coches[indicebarato].mostrarDatos());
}    
}
