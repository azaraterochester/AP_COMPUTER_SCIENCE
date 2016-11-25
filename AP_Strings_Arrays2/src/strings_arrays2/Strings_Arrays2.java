package strings_arrays2;
public class Strings_Arrays2 {
    public static void main(String[] args) {
        String[] arrayOfMen = {"MATEO","ANDRES","SERGIO","SANTIAGO","CARLOS"};
        String[] arrayOfWomen = {"DANIELA","LAURA","PAULA","STEPHIE","ALEJANDRA"};
        for(int i=0;i<arrayOfMen.length;i++){
            for(int j=0;j<arrayOfWomen.length;j++){
                if((arrayOfWomen[j]=="STEPHIE" && arrayOfMen[i]=="ANDRES")){
                    System.out.println(arrayOfWomen[j]+" and "+arrayOfMen[i]+" They are not meant for each other ");
                }else{
                    System.out.println(arrayOfMen[i]+" may marry "+arrayOfWomen[j]);
                }
            }
        }   
    }   
}
