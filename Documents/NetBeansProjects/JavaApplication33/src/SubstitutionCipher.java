/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Space
 */
      
       
        public class SubstitutionCipher  implements MessageEncoder {
        private int shift;
        public SubstitutionCipher(int shift) {
        this.shift = shift;
        }
       
        @Override
        public String encode(String plainText) {
            
          String newMessage=plainText;
            for (int i=0;i<newMessage.length();i++){
                System.out.print(shifter(newMessage.charAt(i)));
                }
            System.out.println("");
            return newMessage;
        }

        
        public char shifter(char letter) {
            
            return (char)(letter+this.shift);
        }
        
        public char deShifter(char letter){
            return (char)(letter-this.shift);
        }
        
        
        }
            
            
            
            
            
            
            
            
            
  