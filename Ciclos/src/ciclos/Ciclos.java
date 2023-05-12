/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ciclos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
    
        /*
        int i=0, cuenta;

        System.out.println("Ingrese hasta cuanto desea que cuente");
        cuenta = entrada.nextInt();
        
        while (i<=cuenta){
        System.out.println(i);
        i=i+5;
    } 
        
      for(int iterador=1; iterador<=50; iterador+=2)
            System.out.println("La cuenta es: "+iterador);
    
       int num, eskuer;
       
        System.out.println("Ingrese un numero ");
        num = entrada.nextInt();
        
        while (num>=0){
        eskuer = (int)Math.pow(num, 2);
        
            System.out.println("El cuadrado del número ingresado ("+num+")es :"+eskuer);
            
            System.out.println("Ingrese otro número: ");
            num= entrada.nextInt();
        }
       */
        int numq, aleat, contador=0;
        
        aleat=(int)(Math.random()*100);
        
        JOptionPane.showMessageDialog(null, "¡Prepárate! Usa el poder de\n"
                + "1000 unicornios y concéntrate,\n"
                + "a ver si adivinas EL NÚMERO SECRETO");
        
        do{
        numq = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número"));
        if(aleat>numq){
        JOptionPane.showMessageDialog(null,"¡ Casi ! Ingresa un número mayor");
        }
        if(aleat<numq){
        JOptionPane.showMessageDialog(null, "¡Estás cerca, \n"
                + "pero te haz pasao chaval!\n"
                + "Ingresa un número menor");
        }
        contador++;
        }
        
        while(numq!=aleat);{
        
        JOptionPane.showMessageDialog(null, "¡Buena mostro, lo ADIVINASTE\n"
                +"en "+ contador+" intentos!");
        }
    }
}


        

    /*
        int edad, estatura, sumedad=0, sumaltura=0, conteoM18=0, conteo175=0,Medad,Mestatura;
        
        for (int i=1; i<=5; i++){
            
           edad= Integer.parseInt(JOptionPane.showInputDialog("Alumno "+i+"\n Digite su edad"));
           estatura= Integer.parseInt(JOptionPane.showInputDialog("Alumno "+i+"\n Digite su estatura en centímetros"));
        
           sumedad+=edad;
           sumaltura+=estatura;
           
           if (edad>18){
           conteoM18++;
           }
            if (estatura>175){
            conteo175++;
            }
           
        }
       Medad=sumedad/5;
       Mestatura=sumaltura/5;
       
       JOptionPane.showMessageDialog(null, "La media de las edades es: "+Medad);
       JOptionPane.showMessageDialog(null, "La media de las estaturas es: "+Mestatura);
       JOptionPane.showMessageDialog(null, "La cantidad de alumnos mayores de 18 años es: \n"
               + conteoM18+"\n La cantidad de alumnos con altura mayor a 175cm es: "+conteo175);
       
        
        /////////PROGRAMA FACTURAS EN UNA EMPRESA////////////
        int codigo, contlitros, precioLitter;
        
        for(int i=1; i<=5; i++){
        System.out.println("Ingrese el código del producto: ");
        codigo= entrada.nextInt();
            System.out.println("Ingrese la cantidad de litros: ");
            contlitros=entrada.nextInt();
            System.out.println("Ingrese el precio por litro: ");
            precioLitter=entrada.nextInt();
        
    }
       
        int numeritee, factorial=1;
        
        System.out.println("Ingrese un número para sacarle factorial: ");
        numeritee=entrada.nextInt();
        for (int i= numeritee; i>0; i--, numeritee--)
        {
         factorial*=numeritee;
        }
        System.out.println("El factorial del numero"+ numeritee + "es: "+factorial);
    
        
      /* int numeritee;
        
        System.out.println("Ingrese un número para sacarle factorial: ");
        numeritee=entrada.nextInt();
        
        for (int i=0; i>0; )
            */
    
    



