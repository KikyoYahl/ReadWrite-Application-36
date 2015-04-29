/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Space
 */
public interface MessageDecoder {
	/**
	 * 
	 * @param plainText - Takes the text to decode. 
	 * @return The decoded text.
	 */
	public String decode( String plainText );
}