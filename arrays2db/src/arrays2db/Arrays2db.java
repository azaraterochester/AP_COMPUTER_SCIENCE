package arrays2db;

public class Arrays2db {

    public static void main(String[] args) {
        // TODO code application logic here
         //2D Arrays
        //Grades for 4 students
        double [][] studentGrades = 
        {
            {80.0,100.0,85.0,90.0},
            {80.0,70.0,85.0,90.0},
            {70.0,90.0,85.0,90.0},
            {60.0,90.0,100.0,70.0}
        
        };
        //Show all elements in the 2d Array
        for(int i = 0; i < studentGrades.length; i++){
            for(int j = 0; j< studentGrades[i].length;j++){
                System.out.print("\t"+studentGrades[i][j]);
            }
            System.out.println();
        }
        
        //Calculate average of each row
        for(int i = 0; i < studentGrades.length; i++){
            calculator myCalculator = new calculator();
            double average = myCalculator.average(studentGrades[i]);
            System.out.println(average);
        }
        
 
        
    }
    
}
