/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AreaYPerimetro;

import javax.swing.JOptionPane;

/**
 *
 * @d.p_suarez en Igastastran
 */
public class Cuadrilatero {
    /////Atribiuts
    private double l1,l2;
    
    /////
    
    ///Metodo cuadradite
    public Cuadrilatero(double l1, double l2) {
        this.l1 = l1;
        this.l2 = l2;
    }
//// Metodo cuadradite
    public Cuadrilatero(double l1) {
        this.l1 = this.l2=l1;
    }
    public double getPerimetro(){
    
    double Perimetro=2*(l1+l2);
    return Perimetro;
    }
    public double getArea(){
    double Area=l1*l2;
    return Area;
    }
    
    
    ////////Metodo Main
    public static void main(String[] args){
    
    Cuadrilatero c1;
    
    double l1,l2;
    
    l1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del primer lado: "));
    l2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del segundo lado: "));
    
    if (l1==l2){
    c1 = new Cuadrilatero(l1);
    }
    else{
    c1= new Cuadrilatero(l1,l2);
    }
    
    JOptionPane.showMessageDialog(null, "El perimetro es: "+c1.getPerimetro()+
            "\nEl área es: "+c1.getArea());
    
    }
}
