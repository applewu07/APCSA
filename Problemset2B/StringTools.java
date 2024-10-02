public class StringTools {
    //method for problem 1
    public String lastLetter(String str) {
    return str.substring (str.length()-1);
}
   //method for problem 2
   
public String formatPhoneNumber(String str1){
     String firstThree= str1.substring (0,3);
     String nextThree= str1.substring(3,6);
     String nextFour=str1.substring(6,10);
     return ("( "+ firstThree +" )"+ " - " + nextThree + " - " + nextFour);
     

    
    
}
//method for problem 3
public String middleThree(String str){
    int middleLetter= ((str.length())/2);
    return str.substring (middleLetter-1, middleLetter+2);           
    
    
    
}
// method for problem 4
public String swapLastTwo (String str){
    String lastLetter= str.substring(str.length()-1);
    String secondLastLetter= str.substring(str.length()-2,str.length()-1 );
    String restLetters= str.substring(0,str.length()-2 );
    return restLetters+lastLetter+secondLastLetter;
    
    
}
// method for problem 5
public boolean frontAgain (String str, int n){
    String frontLetters= str.substring(0,n);
    String backLetters= str.substring(str.length()-n);
    return frontLetters.equals(backLetters);
    
    
    
    
    
    
    
}
}