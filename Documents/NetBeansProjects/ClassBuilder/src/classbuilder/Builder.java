
public class Builder {
	public static void main(String[]args){
		
		
		String name= "Qinghui Zheng";
		StringBuilder sb= new StringBuilder(name);
		
		System.out.println(name.length());
		System.out.println(sb.capacity());
		sb.append(" Loves Java.");
		sb.insert(name.length(), " Really ");
		System.out.print(sb);
		
	}

}
