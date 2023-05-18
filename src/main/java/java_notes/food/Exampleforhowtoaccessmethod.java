package java_notes.food;

public class Exampleforhowtoaccessmethod extends Fruit {
	

   // package cert;
    //public class Roo {
     /// public String doRooThings() {
        // imagine the fun code that goes here
        //return "fun";
	
	//package notcert;   //Not the package Roo is in
    //import cert.Roo;
    //class Cloo extends Roo {
      //public void testCloo() {
        //System.out.println(doRooThings());   
	
	/*   Directly invoking method of class ROO
	 *  Remember, if you see a method invoked (or a variable accessed) without the dot operator (.), 
	 *  it means the method or variable belongs to the class where you see that code.
	 */
	
	
	/* 
	 * Look at the following source file:
                package book;
                import cert.*;  // Import all classes in the cert package
                class Goo {
                  public static void main(String[] args) {
                    Sludge o = new Sludge();
                    o.testIt();
} }
Now look at the second file:
                package cert;
                public class Sludge {
                  public void testIt() { System.out.println("sludge"); }
                }
As you can see, Goo and Sludge are in different packages. 
However, Goo can invoke the method in Sludge without problems 
because both the Sludge class and its testIt() method are marked public.
	 */
}



