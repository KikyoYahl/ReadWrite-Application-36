/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Space
 */
public class ShuffleCipher implements MessageDecoder {
 	
    private int numberOfShuffle;
    
    public ShuffleCipher(int numberOfShuffle) {
    
        this.numberOfShuffle = numberOfShuffle;
        
    }
    @Override
    
    public String decode(String plainText){
        String cipherText = "";
        
        for (int i = this.numberOfShuffle; i > 0; i--)
              
            cipherText = singleShuffler(plainText);
            
        return cipherText;
    }

    public String singleShuffler(String message) {
               
        String newMessage;
               
        String temp;
        
      
        
        newMessage = message.replace(""," ");
        
        //change string to array
        
        String[] ary = newMessage.split("");
             //replacement
             //i+3 = start index for first half
             //(newMessage.length()/2)+2 = start index of second half
             //loop count < message.length/2
             //replace newMessage[i+2] = newMessage[(newMessage.length()/2)+2]               //
        
        for(int count=0; count < message.length()/2; count++) {
            temp=ary[count+3];
            ary[count+3] = ary[(ary.length/2)+count+2];
            ary[(ary.length/2)+count+2]=temp;
        } 
        
        
        StringBuilder builder = new StringBuilder();
        
        for (int i=1; i<(ary.length); i++) {
        
            builder.append(ary[i]) ;
            
        }
     System.out.println(builder);
         return builder.toString();
    }
}
