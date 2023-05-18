package java_notes.DTO;

public interface UserI { //interface is a contract of what a class can do without saying about
	// how the class can do.
	
	
	//Interfaces can be implememted by any class , from any inheritance trees.This lets
	//you take radically different classes and give them a common characterstics 
	
	
	
	//interface Bounceable
	//void bounce( );     -> methods                  What you declare.
	//void setBounceFactor(int bf); -> methods
	
	
	// The Relationship between interfaces and classes
	
	
	//interface Bounceable
	//public abstract void bounce( );               -> what compiler sees
	//public abstract void setBounceFactor(int bf);
	
	
	
	//class Tire implements Bounceable                -> What the implementing class must do.
	                                 //(All interface methods must be implemented, and must be marked public.)
	//public void bounce( ){...}                     
	//public void setBounceFactor(int bf){ }
	
	
	
	// Interfaces points to be taken care of :
   // 1. all interface methods are implicitly public and abstract
   // 2. all variables defined in interface are public , static,final i.e. constant
	//3.interface methods must not be static.
	
	// A final method can not be overridden.That defies the purpose of 
	//having an interface if you cannot actually implement the method.
	
//static means that it can only be called using the class name. 
	//Since an interface will have multiple implementations, how will you know which 
	//implementation to choose since the interface cannot implement the method itself?
	
	//You can't change the value of a constant! Once the value has been assigned, 
	//the value can never be modified. The assignment happens in the interface itself
	//(where the constant is declared), so the implementing class can access it and use it, but as a read-only value. So the BAR = 27 assignment will not compile.
	
}
