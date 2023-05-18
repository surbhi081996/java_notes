package java_notes.string;

public class Strings {
	
	public static void main(String args[])
	{
		//String declaration
		String fullname = "surbhi";
		
		//String methods
		
		// concatenation
		String name = "tony";
		String lastName = "stark";
		String fullName = name + lastName;
		System.out.println("fullname is :"  +fullName);
		
		 
		//length()
		System.out.println("length of the string is:" +fullName.length());
		
		//charAt(i)
		for(int i=0;i<fullname.length();i++)
		{
			System.out.println("index value of the strings:"+fullname.charAt(i));
		}
		
		//compare
		
		String name1 = "Tony";
		String name2 = "stark";
		//String fullName = name1+name2;
		
		//compareTo checks  3 cases
		//1.s1>s2 -> =Ve value
		//2. s2==s1 -> 0
		//3. s1<s2 -> -ve value
		
		// as the alphabet order increases the value of alphabet also increases
		if(name1.compareTo(name2)==0)
		{
			System.out.println("String are equal");
		}
		else
		{
			System.out.println("String are not equal");
		}
	}
	

}
