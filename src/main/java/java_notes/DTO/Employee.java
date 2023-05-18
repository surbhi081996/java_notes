package java_notes.DTO;
import java_notes.DTO.Accessmodifiernote; 
//default access for class AccessModifierNote. 

public  class Employee extends Accessmodifiernote { // a class should be declared only public or default access.
	
	private String employeeName;
	private Long employeeId;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) { //setter method must be marked public
		//has void return type
		//argument that has property type
		this.employeeName = employeeName;
	}
	public Long getEmployeeId() { //getter method must be marked public 
		//takes no argument
		//return  type matches argument type of setter method. 
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	
	Accessmodifiernote accessmodifiernote = new Accessmodifiernote();
	
	
// access modifiers: how to restrict or allow access to class that you create.
// there are 4 access controls but only 3 access modifiers. The fourth 
	//access modifier i.e default or package 
	
	// Access modifier : public , private , protected
	//non-access modifier : strictfp, final,abstract.
	
}
