
package ClasesYObjetos;

/////CREACION DE CLASE: MAIN

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        ///////CREACION OBJETO op E INSTANCIAMIENTO////
        int num1,num2;
   
num1= Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
num2= Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número"));

    Operacion op = new Operacion();
op.sumar(num1, num2);
op.dividir(num1, num2);
op.restar(num1, num2);
op.multiplicar(num1, num2);

op.mostrarResultado();
    
}
}
