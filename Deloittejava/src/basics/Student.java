package basics;

public class Student {
	
	int rollno;  //partition/ instance variable
	String name;  
	float fee;  
	private String dob;
	
	public Student(int rollno,String name,float fee) { //params
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}
	
	public void display() {
		System.out.println("student details are\n"+rollno+name+fee);
		dob = "1-1-1";
	}
	
	public int getAge() {
		//get the dob and convert it into age and return the no
		return 33;
	}

}
