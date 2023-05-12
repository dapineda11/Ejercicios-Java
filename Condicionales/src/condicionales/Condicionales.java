/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double numero1, numero2;
      double exponente, potencia;
      Scanner entrada = new Scanner (System.in);
        System.out.println("/////ESTE PROGRAMA EVALÚA DOS NÚMEROS Y ENCUENTRA EL MENOR/////");
        System.out.println("/////POSTERIORMENTE ELEVA EL MENOR A UNA POTENCIA CUALQUIERA///");
        System.out.println("\n");
        System.out.println("Ingrese el primer número ");
        numero1= entrada.nextDouble();
        System.out.println("Ingrese el segundo número ");
        numero2= entrada.nextDouble();
        
        if (numero1>numero2)
        {
            System.out.println("El número menor es "+numero2);
            System.out.println("\n");
            Scanner entrada1 = new Scanner (System.in);
            System.out.println("Ingrese un exponente ");
            exponente= entrada.nextDouble();
            potencia= Math.pow(numero2, exponente);
            System.out.println("El resultado es: "+potencia);
        }
         if (numero2>numero1)
        {
            System.out.println("El número menor es "+numero1);
            System.out.println("\n");
            Scanner entrada1 = new Scanner (System.in);
            System.out.println("Ingrese un exponente ");
            exponente= entrada.nextDouble();
            potencia= Math.pow(numero1,exponente);
            System.out.println("El resultado es: "+potencia);
        }   
         if(numero1==numero2)
                 {
             System.out.println("Los números son iguales"); 
         }
    
        System.out.println("///PROGRAMA QUE CALCULA UNA CATEGORÍA DE ACUERDO///");
        System.out.println("////         A LA EDAD INGRESADA              /////");
      double edad;
          Scanner entrada2 = new Scanner (System.in);
          System.out.println("\n");
          System.out.println("Ingrese la edad: ");
          edad=entrada2.nextDouble();
          
          if ((edad>=0)&&(edad<=5))
                  {
                      System.out.println("La edad ingresada pertenece al grupo: Infante");
                  }
          if((edad>=6)&&(edad<=10))
          {
                      System.out.println("La edad ingresada pertenece al grupo: Niño");
          }
          if((edad>=11)&&(edad<=15)){
                      System.out.println("La edad ingresada pertenece al grupo: Pre Adolecente");  
          }
          if((edad>=16)&&(edad<=18)){
                      System.out.println("La edad ingresada pertenece al grupo: Adolecente");
          }
          if((edad>=19)&&(edad<=25)){
                      System.out.println("La edad ingresada pertenece al grupo: Adulto Joven");
          }
          if((edad>=26)&&(edad<=40)){
                      System.out.println("La edad ingresada pertenece al grupo: Adulto");
          }
          if((edad>=41)&&(edad<=55)){
                      System.out.println("La edad ingresada pertenece al grupo: El cuarto piso y más allá mi prro");
          }
          if ((edad>=56)&&(edad<=100)){
                      System.out.println("La edad ingresada pertenece al grupo: Tercera edad");
          }
          if(edad>101){
                      System.out.println("La edad ingresada pertenece al grupo: Date por bien servido, estás a punto de colgar los guayos");
          }       
    
      
      ////////////////////////////////
    char letra;
    
    letra= JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
    if(Character.isUpperCase(letra)){
    
      JOptionPane.showMessageDialog(null, "Es una letra mayúscula");
      }
    else{
    JOptionPane.showMessageDialog(null, "La letra es minúscula. ");
    }

      double num1, num2, suma, resta, multi, division, raiz, pote ;
      char opereitor;
      opereitor = JOptionPane.showInputDialog("Ingrese la operación a realizar: \n "
              + "Letra 's' para hacer una suma \n"
              + "Letra 'r' para hacer una resta\n"
              + "Letra 'm' para hacer una multiplicacion\n"
              + "Letra 'd' para hacer una division\n"
              + "Letra 'p' para hacer una potencia\n"
              + "(En el caso de raiz cuadrada usar 'x')").charAt(0);
      
      num1= Double.parseDouble(JOptionPane.showInputDialog("Digite el primer número a operar: "));
      num2= Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo número a operar: "));
      
      switch(opereitor){
      
          case 's':
          case 'S': suma= num1+num2;
          JOptionPane.showMessageDialog(null, "El resultado de la suma es: "+suma);
          break;
          
          case 'r':
          case 'R': resta= num1+num2;
          JOptionPane.showMessageDialog(null,"El resultado de la resta "+resta);
          break;
          
          case 'm':
          case 'M': multi=num1*num2;
          JOptionPane.showMessageDialog(null, "El resultado de la multriplicación es :"+multi);
          break;
          
          case 'd':
          case 'D': division=(num1/num2);
          JOptionPane.showMessageDialog(null, "El resultado de la división es: "+division);
          
          case 'p':
          case 'P': pote= Math.pow(num1, num2);
          JOptionPane.showMessageDialog(null, "El resultado de la potencia es:"+ pote);
          break;
          
          
          case 'x':
          case 'X':raiz= Math.sqrt(num1);
          JOptionPane.showMessageDialog(null, "El resultado de la raíz es: "+raiz);
          break;
          
          default: JOptionPane.showMessageDialog(null, "Ingresó una operación no válida");
          
          
      }

      
    }
}
