package java_notes.string;

public class SubStrings {
	
	public static void main(String args[])
	{
		//substring = it takes beginnning index and ending index
		//substring(beg index, end index)
		
		String sentence = "my name is tony";
		String name = sentence.substring(11,sentence.length());
		String name1 = sentence.substring(2,9);
		System.out.println(name);
		System.out.println(name1);
		
		
	}

}
