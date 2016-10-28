/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap_computerscience_exam1_guide;
import java.util.Scanner;

public class AP_COMPUTERSCIENCE_EXAM1_GUIDE {
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of times you want to print the charater #");
        int times = input.nextInt();
        
        if(times>=1 || times>=40){
            for(int i = 1; i <= times; i++){
                System.out.print("#");
        }}else{
            System.out.println("The number is not between 1 and 40");
        }
        
    }
    
}
