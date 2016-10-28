/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings_arrays;

/**
 *
 * @author alejandro
 */
public class Strings_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Create a String
        String myString = "Hello";
        
        //Create a String array
        String[] arrayOfStrings = {"Juan","María","Ana","Andres","Juan#"};
        
        //Print out an element of a String Array
        System.out.println(arrayOfStrings[0]);
        
        //Length of an array
        int howManyElementsInTheArray = arrayOfStrings.length;
        System.out.println(howManyElementsInTheArray);
        
        myString = arrayOfStrings[arrayOfStrings.length];
        
        
        
        
    }
    
}
