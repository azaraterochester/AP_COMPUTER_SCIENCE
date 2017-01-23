package story;
public class Student {   
   
    public String name;
    public String lastName;
    public String course;
    public String sound;
    
    public void sing(int cuantasVeces){
        for(int a = 0; a < cuantasVeces; a++){
            System.out.println(this.sound);
        }
    }
    
    public void sing(){
        String song = "-- I like to sing: "+sound + " " + sound + " " + sound + " ";
        System.out.println(song);
    }
    
    public String sayYourName(){
        String message = "-- My name is "+this.name +" "+ this.lastName;
        return message;
    }

}
