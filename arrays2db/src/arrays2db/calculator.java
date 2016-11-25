/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays2db;

/**
 *
 * @author eazarateo
 */
public class calculator {
    
    public double average(double [] arrayOfNumbers){
        
        double sum =0.0;
        for(int i=0;i < arrayOfNumbers.length;i++){
            sum = sum + arrayOfNumbers[i];
        }
        //Divide the sum of all elements in the number of elements and store it in the variable "average"
        double average = sum / arrayOfNumbers.length;
        //Print out the average
        System.out.println("The average is: "+average);
        
        return average;
        
    }
    
}
