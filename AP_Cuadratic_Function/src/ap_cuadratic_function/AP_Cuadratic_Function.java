/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap_cuadratic_function;

/**
 *
 * @author eazarateo
 */
public class AP_Cuadratic_Function {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           
    double a = 1;
    double b = 8;
    double c = 16;
    double result1 = (((-b)+(Math.sqrt((Math.pow(b,2))-(4*(a*c)))))/(2*a));    
    double result2 = (((-b)-(Math.sqrt((Math.pow(b,2))-(4*(a*c)))))/(2*a));
    System.out.println ("Resultado 1:" + result1);
    System.out.println ("Resultado 2:" + result2);
    
    }
    
}
