/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Space
 */
import java.util.Scanner;
import java.math.BigDecimal;
public class PayDemo{
   public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("How many hours did you work this week?");
    Double hours = input.nextDouble();
    
    BigDecimal payRate= new BigDecimal(3.5);
    HazardPay overTime = new HazardPay(payRate);
    RegularPay homeDepot = new RegularPay(payRate);
    
    System.out.println("Your wage this week is: $"+homeDepot.computePay(hours)+ " dollars");
    System.out.println("Did you work overtime?"
            + "If yes please press y, if not please press n followed by enter");
    String choice = input.next();
    if (choice.equalsIgnoreCase("y")){
       System.out.println("How many hours of overtime did you work this week?");
       hours = input.nextDouble();
         System.out.println("Your overtime wage this week is: $"+overTime.computePay(hours)+" dollars");
    }
    else if (choice.equalsIgnoreCase("n")){
   System.exit(0);
    } 
   
   }
    
    
}
