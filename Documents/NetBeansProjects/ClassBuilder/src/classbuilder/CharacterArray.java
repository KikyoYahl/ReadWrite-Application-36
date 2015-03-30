
public class CharacterArray {
public static void main(String[] args){
	
	StringBuilder input = new StringBuilder("6901 Sudley Road Manassas VA ");
	
	for(int i=0; i< input.length(); i++){
		System.out.println(input.charAt(i));
		if(Character.isDigit(input.charAt(i))){
			input.replace(i,i+1,"*");
		}
		if(Character.isLowerCase(input.charAt(i))){
			input.setCharAt(i, Character.toUpperCase(input.charAt(i)));
		}
		if(Character.isUpperCase(input.charAt(i))){
			input.setCharAt(i, Character.toLowerCase(input.charAt(i)));
		}
	}

	System.out.print(input);
}
}
