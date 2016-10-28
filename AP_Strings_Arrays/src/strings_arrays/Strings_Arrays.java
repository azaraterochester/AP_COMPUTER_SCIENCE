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
        
        //------------------------- STRINGS ------------------------

        //Create a String
        String myString = "Alejo$";      
        System.out.println("My string is: "+myString);
        
        //replace # for a $
        String modifiedString = myString.replace("$","#");       
        System.out.println("Modified string: "+modifiedString);
        
        //use first 5 letters of the string
        String first4Letters = modifiedString.substring(0,5);
        System.out.println("First four letters: "+first4Letters);

        //-------------------- ARRYS -----------------------------
        
        //Create a String array 
        String[] arrayOfStrings = {"Juan","María","Ana","Andres","--"};
        
         //Length of an array
        int howManyElementsInTheArray = arrayOfStrings.length;
        System.out.println("\nNumber of elements in the array: "+howManyElementsInTheArray);
        
        //Print out an element of a String Array
        System.out.println("Element 0 of the array: "+arrayOfStrings[0]);
        
        //Last element of the array
        System.out.println("Last element 0 of the array: "+arrayOfStrings[howManyElementsInTheArray-1]);
        //Change last element
        arrayOfStrings[howManyElementsInTheArray-1] = first4Letters;
        System.out.println("Last element 0 of the array: "+arrayOfStrings[howManyElementsInTheArray-1]);
                
    }
    
}
