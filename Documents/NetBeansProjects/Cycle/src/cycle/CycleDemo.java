import java.util.Scanner;
public class CycleDemo {
    public static void main (String []agrs){
       
    
    Scanner kbd = new Scanner(System.in);
    Cycle test = new Cycle();    
    double weight; 
    int wheel;
           
             System.out.println("Please enter the weight");
             weight= kbd.nextDouble();
             System.out.println("Please enter the number of wheels");  
             wheel = kbd.nextInt();
             
               test.setWheel(wheel);
               test.setWeight(weight);
               
               System.out.print(test.toString());

    }
}