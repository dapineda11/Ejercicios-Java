/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciovariables;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class EjercicioVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
           String estudiante;
           Float n1;
           Float n2;
           Float n3;
           Float n4;
           Float n5;
           
           estudiante= JOptionPane.showInputDialog("Ingrese su nombre :");
           n1= Float.parseFloat(JOptionPane.showInputDialog("Ingrese la primera nota: "));
           n2= Float.parseFloat(JOptionPane.showInputDialog("Ingrese la segunda nota: "));
           n3= Float.parseFloat(JOptionPane.showInputDialog("Ingrese la tercera nota: "));
           n4= Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cuarta nota: "));
           n5= Float.parseFloat(JOptionPane.showInputDialog("Ingrese la quinta nota: "));
           
           
           float promNot=((n1+n2+n3+n4+n5)/5);
           
           JOptionPane.showMessageDialog(null,"La nota final del estudiante "+estudiante);
           JOptionPane.showMessageDialog(null,"Es "+promNot);
           
           
           
           
    }
    
}
