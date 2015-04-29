/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Space
 */ 
public class InvalidValueException extends Exception {
    private int value=0;
   
     public InvalidValueException(){
        System.out.println("Invalid value must be greater than zero "+ value);
        
    }
    public InvalidValueException(int value){
        super("Invalid value must be greater than zero "+ value);
        this.value=value;
    }
    public int getValue(){
        return value;
    }
    
    
}