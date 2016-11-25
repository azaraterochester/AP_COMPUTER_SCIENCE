package arrays2d;

public class Arrays2D {

    public static void main(String[] args) {

        //Array of grades of one student
        double [] grades = {80.0,90.0,85.0,90.0};
        //Variable to store the sum
        double sum = 0.0;
        //For loop to add all elements in the array of grades
        for(int i=0;i < grades.length;i++){
            sum = sum + grades[i];
        }
        //Divide the sum of all elements in the number of elements and store it in the variable "average"
        double average = sum / grades.length;
        //Print out the average
        System.out.println("The average is: "+average);
        
        
    }
    
}
