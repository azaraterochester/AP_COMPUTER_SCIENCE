/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codefights;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author eazarateo
 */
public class CodeFights {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int today =0, upcoming=0, later=0;
        int[] deadlines = {1,2,7,10,4};
        for(int i = 0;i<deadlines.length;i++){
            if(deadlines[i]<=1){
                today+=1;
            }
            else if(deadlines[i]<=7){
                upcoming+=1;
            }
            else{
                later+=1;
            }
        }
        System.out.println(today+","+upcoming+","+later);
    }
    
}
