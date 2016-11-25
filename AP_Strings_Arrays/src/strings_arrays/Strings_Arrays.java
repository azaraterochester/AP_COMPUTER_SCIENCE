package strings_arrays;
public class Strings_Arrays {
    public static void main(String[] args) {
        //------------------------- STRINGS ------------------------
        //Create a String
        String myString = "Alejo$";      
        System.out.println("My string is: "+myString);
        
        //replace # for a $
        String modifiedString = myString.replace("$","#");       
        System.out.println("Modified string: "+modifiedString);
        
        //use first 5 letters of the string
        String first5Letters = modifiedString.substring(0,5);
        System.out.println("First four letters: "+first5Letters);
        
        String nicolas = first5Letters.toLowerCase();
        System.out.println(nicolas);

        //-------------------- ARRAYS -----------------------------
        
        //Create a String array 
        String[] RojasMereceElPuntoCompleto = {"Juan","María","Ana","Andres","--"};
        
         //Length of an array
        int rojasEsDOblementeLoca = RojasMereceElPuntoCompleto.length;
        System.out.println("\nNumber of elements in the array: "+rojasEsDOblementeLoca);
        
        //Print out an element of a String Array
        System.out.println("Element 0 of the array: "+RojasMereceElPuntoCompleto[0]);
        
        //Last element of the array
        System.out.println("Last element 0 of the array: "+RojasMereceElPuntoCompleto[rojasEsDOblementeLoca-1]);
        //Change last element
        RojasMereceElPuntoCompleto[rojasEsDOblementeLoca-1] = first5Letters;
        System.out.println("Last element 0 of the array: "+RojasMereceElPuntoCompleto[rojasEsDOblementeLoca-1]);
        
        
                
    }
    
}
