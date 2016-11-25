package story;
import java.util.Date;

public class MainStory {

    public static void main(String[] args) {
    
        System.out.println("Once upon a time there was an empty kingdom");
        System.out.println("In this kingdom there was only one God. Me.");
        System.out.println("One day I decided to create a character. He was going to be a student");
        
        
        //And the gos of the empty kingdom created Neo
        System.out.println("God creates Neo");
        
        //Instantiate a new object of type Student. This instance is called neo
        Student neo = new Student();
        
        //Initialize neo's name and lastname attributes
        neo.name = "Sergio";
        neo.lastname = "Guerra";
        
        //God was good and taught neo to say one word
        System.out.println("God teaches Neo a sound");
        neo.sound = "Pikachu";
        
        
        //And God ordererd neo to sing and say his name
        System.out.println("God orders Neo to sing and say his name");
        
        //And neo sings 
        System.out.println("And Neo says his name and sings");
       
        //neo says his name
        System.out.println(neo.sayYourName());
        //neo sings
        neo.sing();
        
        //And god thinks 
        System.out.println("Mucha aleta");
        
        
        
    
    }
    
}
