package basics;

public class Student {
	
	int rollno;  //partition/ instance variable
	String name;  
	float fee;  
	
	public Student(int rollno,String name,float fee) { //params
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}
	
	public void display() {
		System.out.println("student details are\n"+rollno+name+fee);
	}

}
