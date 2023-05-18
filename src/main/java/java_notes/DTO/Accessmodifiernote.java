package java_notes.DTO;

 class Accessmodifiernote extends User { //default access : class can be seen within same package
	
	//	class A has access to class B means : 
	//Create an instance of class B
	//extend class B(become a subclass of class B)
	//access certain method of class B based on the access modifier of methods and variables.
	
	
// you can also use other non access modifier  : final , strictfp or abstract
//for example you can use final with public , you cant use final and abstract together
	
	//FINAL modifier with class ; class cant be subclassed (no other class can ever 
	 // extend it ) method will never be overridden 
	 //final keyword will give you security that nobody can change the implementation or from under you.
	 
	 private String surbhi; // String class is final 
	 User user = new User() {

		@Override
		void getName() {
			// TODO Auto-generated method stub
			
		}

		@Override
		void getid() {
			// TODO Auto-generated method stub
			
		}
	};
	@Override
	void getName() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void getid() {
		// TODO Auto-generated method stub
		
	}
	
}
