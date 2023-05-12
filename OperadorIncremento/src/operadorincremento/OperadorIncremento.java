/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorincremento;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class OperadorIncremento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
  
        System.out.println("Ingrese un numero para sacarle raíz cuadrada");
      Scanner entrada = new Scanner(System.in);
        double numerito;
      numerito= entrada.nextDouble();
        
        double raiz;
        raiz = Math.sqrt(numerito);
        System.out.println("La raíz cuadrada del número es: "+raiz);
    /////////////////////////////////////////////////////////////////////////////
        System.out.println("Ingrese una base para elevar a una potencia ");
        Scanner entrada1 = new Scanner(System.in);
      
        double base, exponente, potencia;
        base = entrada1.nextDouble();
        System.out.println("Ingrese el exponente ");
        exponente= entrada1.nextDouble();
        potencia= Math.pow(base, exponente);
        System.out.println("La potencia es igual a : "+potencia);
    ///////////////////////////////////////////////////////////////////////////////////
        System.out.println("/////////////////////////////////////////////////");
        System.out.println("  CALCULO PROMEDIO DE 5 NOTAS  ");
        System.out.println("/////////////////////////////////////////////////");    
        System.out.println("Ingrese la primera nota ");
        Scanner entrada2 = new Scanner(System.in);
        double n1, n2, n3, n4, n5, promNot;
        n1= entrada2.nextDouble();
        System.out.println("Ingrese la segunda nota ");
        n2= entrada2.nextDouble();
        System.out.println("Ingrese la tercera nota ");
        n3= entrada2.nextDouble();
        System.out.println("Ingrese la cuarta nota ");
        n4= entrada2.nextDouble();
        System.out.println("Ingrese la quinta nota ");
        n5= entrada2.nextDouble();
    
           promNot=((n1+n2+n3+n4+n5)/5);
           
           System.out.println("El promedio de las notas ingresadas es: "+promNot);

           /////////////////////////////////////////////////////////////////////////////////////
            System.out.println("/////////////////////////////////////////////////");
        System.out.println("  CALCULO PERÍMETRO Y ÁREA DE FIGURAS GEOMÉTRICAS  ");
        System.out.println("/////////////////////////////////////////////////");    
        System.out.println("\n");
        System.out.println("/////AREA Y PERIMETRO DEL CUADRADO/////");
        System.out.println("Ingrese el lado del cuadrado ");
        Scanner entrada3 = new Scanner(System.in);
        double lCuadrado, bTriangulo, aTriangulo, rCirculo,AreaC,PerimC,AreaT,PerimT,AreaCir,PerimCir;
        
        lCuadrado= entrada3.nextDouble();
        
        AreaC= Math.pow(lCuadrado,2);
        PerimC= lCuadrado*4;
        
        System.out.println("El area del cuadrado es igual a :"+AreaC);
        System.out.println("El perímetro del cuadrado es igual a:"+PerimC);
        System.out.println("//////////////////////////////////////////////");
            
        System.out.println("\n");
        System.out.println("/////AREA Y PERIMETRO DEL TRIANGULO/////");
        System.out.println("Ingrese la base del triángulo ");
        bTriangulo=entrada3.nextDouble();
        
        System.out.println("Ingrese la altura del triángulo ");
        aTriangulo=entrada3.nextDouble();
        AreaT= (bTriangulo*aTriangulo)/2;
        double hipotenusa, resulB, resulA, sumCat;
        
       resulB= Math.pow(bTriangulo, 2);
       resulA= Math.pow(aTriangulo, 2);
       
       sumCat=resulB+resulA;
       hipotenusa= Math.sqrt(sumCat);
       
       PerimT=(hipotenusa*2)+bTriangulo;
       System.out.println("El area del triangulo es igual a :"+AreaT);
        System.out.println("El perímetro del triangulo es igual a:"+PerimT);
        System.out.println("///////////////////////////////////////////////");
            
        System.out.println("\n");
        System.out.println("/////AREA Y PERIMETRO DEL CIRCULO/////");
        
        System.out.println("Ingrese la el radio del círculo ");
        rCirculo=entrada3.nextDouble();
       double rAlCuadrado;
       rAlCuadrado=Math.pow(rCirculo, 2);
       AreaCir=rAlCuadrado*3.141596;
       PerimCir=2*3.141596*rCirculo;
       
       System.out.println("El area del circulo es igual a :"+AreaCir);
        System.out.println("El perímetro del circulo es igual a:"+PerimCir);
    
  
    }
    
}
