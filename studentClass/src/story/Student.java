package story;

public class Student {
    
    
    //God created a student with
    public String name;
    public String lastname;
    public String course;
    public String sound;
    
    
    //God gave every student the ability to sing by repeating the sound he could do four times
    public void sing(){
        
        String song = "-- I like to sing: "+sound + " " + sound + " " + sound + " " + sound + " ";
        System.out.println(song);
    }
    //God gave every student the ability to say their name
    public String sayYourName(){
        String name = "-- My name is "+this.name +" "+ this.lastname;
        return name;
    }
    
    
}
