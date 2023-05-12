/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Operacion {
/////Atributos DE NUESTRA CLASE
int suma,resta,multiplicar,dividir;
///Metodos    


/////METODOS PARA REALIZAR LAS OPERACIONES///////
public void sumar(int num1, int num2){
    suma = num1+num2;

}

public void restar(int num1, int num2){
resta=num1-num2;
}

public void multiplicar(int num1, int num2){
multiplicar=num1*num2;
}
public void dividir(int num1, int num2){
dividir=num1/num2;
}
public void mostrarResultado(){
JOptionPane.showMessageDialog(null,"El resultado de las operaciones es: "+"\nPara la suma: "+suma+
"\nPara la resta: "+resta+"\nPara la multiplicación: "+multiplicar+"\nPara la división: "+dividir);
}

}
