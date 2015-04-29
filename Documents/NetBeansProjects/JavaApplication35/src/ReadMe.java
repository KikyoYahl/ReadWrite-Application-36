/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Space
 */
import java.io.*;

public class ReadMe {
    public static void main(String [] args) throws IOException{
        
            try(//Create an output stream for file Pledge.txt
            ObjectOutputStream output = 
                    new ObjectOutputStream(new FileOutputStream("Pledge.txt"));
            ){
       
         output.reset();
                
        //Write Pledge to txt file  
     
        output.writeUTF( "I pledge allegiance to the Flag of the United States "
                    + "of America, and to the Republic for which it stands: one "
                    + "Nation under God, indivisible, With Liberty and Justice "
                    + "for all.");
        
      output.close();
    }
        
        try(//Create random access file 
                RandomAccessFile inout = new RandomAccessFile("Pledge.txt","r");
                ){
          inout.seek(124);
          char[] charArray= new char[11];;
          for(int i=0;i<11;i++){
           
           charArray[i]=(char)inout.read();
          
          }
          
          String message= String.valueOf(charArray);
          System.out.println(message);
            
        }
    }
}
