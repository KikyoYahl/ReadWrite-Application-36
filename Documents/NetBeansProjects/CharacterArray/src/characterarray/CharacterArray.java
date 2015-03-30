/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterarray;

/**
 *
 * @author Qinghui
 */
public class CharacterArray {
    public static void main(String [] args){
        StringBuilder input= new StringBuilder("6901 Sudley Road Manassas VA");
        
        for (int i = 0;i<input.length();i++){
            System.out.println(input.charAt(i));
            
            if(Character.isDigit(input.charAt(i))){
                input.replace(i, i+1, "*");
            }
            if(Character.isUpperCase(input.charAt(i))){
                input.setCharAt(i,Character.toLowerCase(input.charAt(i)));
            }
            if(Character.isLowerCase(input.charAt(i))){
                input.setCharAt(i,Character.toUpperCase(input.charAt(i)));
            }
        }
        System.out.println(input);
    }
}