package jhkwon.java.string;

public class StringPractice{
	public static void main(String[] args){
		
		String s = "hahaha";
		char c = 'S';
		int i = 255;
	
		System.out.println(String.format("$s %d %c %f %X %x %02X%n",s,i,c,(float)i,i,i,10));
		//Expected result
		//hahaha 255 S 255.0000 FF ff 0A
	}
}

