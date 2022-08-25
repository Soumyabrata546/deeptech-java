package Second;

public class Employee {
		String firstname,lastname;
		double salary;
		Employee(String fname,String lname,double salary){
			if(salary<0) {
				this.salary=0.0;
			}
			firstname=fname;
			lastname=lname;
			this.salary=salary;
		}
	}
