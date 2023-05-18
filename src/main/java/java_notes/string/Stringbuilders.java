package java_notes.string;

public class Stringbuilders {
	
	//why string builder  : when modifiable operations such as add , del , etc are to be used frequently we 
	                              //use string builder
	
	//String builder modify the same string in heap memory hence less time will be taken for the operation to complete
	
	public static void main(String args[]) {
		
		StringBuilder str  = new StringBuilder("Tony");//stringBuilder declaration
		System.out.println(str);
		
		//char at index 0
		System.out.println(str.charAt(0));
		
		//set char at index in stringbuilder
		
		str.setCharAt(0, 'I');
		System.out.println(str);
		
		//Insert
		str.insert(2, 'n');
		System.out.println(str);
		
		//delete
		str.delete(2, 3); //3 is not included
		System.out.println(str);
		
		str.append('u');
		System.out.println(str);
		
		for(int i=0;i<str.length()/2;i++)
		{
			int front =i;
			int back = str.length()-1-i;//4-1-0
			char frontChar = str.charAt(front);
			char backChar = str.charAt(back);
			str.setCharAt(front, backChar);
			str.setCharAt(back, frontChar);
			System.out.println(str);
			
		}
		
		// time complexity - > 0->n/2 bigoh(n)
	}

}
