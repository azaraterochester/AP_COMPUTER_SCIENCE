/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings_arrays2;

/**
 *
 * @author alejandro
 */
public class Strings_Arrays2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] arrayOfMen = {"Andres","Juan","Pedro","Mario","Pepe"};
        String[] arrayOfWomen = {"Juana","Laura","Andrea","Erika","Penelope"};
        
        
        for(int i=0;i<arrayOfMen.length;i++){
            
            for(int j=0;j<arrayOfWomen.length;j++){
                
                if((arrayOfWomen[j]=="Erika" && arrayOfMen[i]=="Andres")){
                    System.out.println(arrayOfWomen[j]+" and "+arrayOfMen[i]+" They are not meant for each other ");
                }
                else{
                    System.out.println(arrayOfMen[i]+" may marry "+arrayOfWomen[j]);
                }
            }
        }
        
    }
    
}
