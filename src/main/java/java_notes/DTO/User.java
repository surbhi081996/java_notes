package java_notes.DTO;

abstract  class User implements UserI{ // abstract class user can never be instantiated  , its sole purpose
	// is to be extended
	
	//User user  = new User(); cant instantiate abstarct class User 
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
	
	private String userName;
	private String userId;
	abstract void getName();
	abstract void getid();
	
	// you cant use final and abstract together they have opposite meaning , final class
	//can never be subclassed abstract classes must be subclassed

}
