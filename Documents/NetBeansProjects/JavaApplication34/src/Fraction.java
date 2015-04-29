
/**
 * 
 * @author Jonathan Wiley
 * Unit 8 Fraction 
 * CSC-201 
 * 
 */
import java.io.*;
public class Fraction implements java.io.Serializable {
    private int numerator;
    private int denominator;
    private char slash = '/';
    
    public Fraction(int numerator, int denominator){
        this.denominator=denominator;
        this.numerator=numerator;
    }
  /*Setter for numerator and denominator both have exceptions to throw for 
    valules of zero. Custom Exception is in the package under 
    "InvalidInputException" 
    */
    public void setNumerator(int numerator)
                throws InvalidValueException{
        if (numerator> 0){
               this.numerator=numerator;
             
        }
            else
                throw new InvalidValueException(numerator);
        }

   public void setDenominator(int denominator)
                throws InvalidValueException{
        if (denominator> 0){
               this.denominator=denominator;
             
        }
            else
                throw new InvalidValueException(denominator);
        }
   public int getDenominator(){
       return denominator;
   }
   
   public int getNumerator(){
       return numerator;
   }
   //To String Method 
   public String toString(){
       return ""+numerator+slash+denominator;
   }
public static void main (String[]args) throws IOException, ClassNotFoundException {
    try(//Create an output stream for file SerialF.dat
            ObjectOutputStream output = 
                    new ObjectOutputStream(new FileOutputStream("SerialF.dat"));
            ){
        //Write fraction to the file 
       for(int i=0;i<3;i++){
        output.writeObject(new Fraction(1+i,4+i));
        }
      output.close();
    }
    try(//Create an input stream for file SerialF.dat
            ObjectInputStream input =
                    new ObjectInputStream(new FileInputStream("SerialF.dat"));
            ){
        //Read Fraction from the file 
        for(int i=0;i<3;i++){ 
        
            Fraction test = (Fraction)input.readObject();
             System.out.println(test);
        }   
        input.close();
    } 
}
}


