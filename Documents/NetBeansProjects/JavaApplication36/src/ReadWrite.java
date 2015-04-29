
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Space
 */
public class ReadWrite implements java.io.Serializable {
       
       static int id;
    public static void main (String[]args) throws IOException{
       Scanner input = new Scanner(System.in); 
       double[] score=new double[5];
   try(//Create an output stream for file Pledge.txt
            ObjectOutputStream output = 
                    new ObjectOutputStream(new FileOutputStream("Stu.dat"));
            ){
       
         output.reset();
                
        //Write Pledge to txt file  
         System.out.println("Please enter five Gpa scores");
         for(int i=0;i<5;i++){
             System.out.println("Gpa :"+(i+1));
                score[i]=input.nextDouble();
             output.writeUTF(" Gpa"+score[i]);
             id=(12345+i);
             System.out.println("Your Student Id is"+id);
         }
      output.close();
    }
        
        try(//Create random access file 
                RandomAccessFile inout = new RandomAccessFile("Stu.dat","rw");
                ){
         System.out.println("Welsome to the Gpa notifer, please enter your student "
                 + "Id and I will tell you your gpa");
         System.out.println("");
         System.out.println("Please enter student id");
         id=input.nextInt();
             switch(id){
                 case 12345: System.out.println(score[0]);
                     break;
                     
                 case 12346: System.out.println(score[1]);
                     break;
                 case 12347: System.out.println(score[2]);
                     break;
                  case 12348: System.out.println(score[3]);
                     break;
                    case 12349: System.out.println(score[4]);
                     break;
                    default:
                        System.out.println("Id does not exist");
                        break;
             }
             }    
            }  
        }
     
   
