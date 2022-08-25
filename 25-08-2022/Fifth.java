package Second;
// Create a class called Employee that includes three pieces of information as instance variables—a first name
// (typeString), a last name (typeString) and a monthly salary (double). Your class should have a constructor that
// initializes the three instance variables. If the monthly
// salary is not positive, set it to 0.0. Write a test application named EmployeeTest that demonstrates class
// Employee’s capabilities. Create two Employee objects and display each object’s yearly salary. Then give each
// Employe
// Employee a 10% raise and display each Employee’s yearly salary again.
public class Fifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ob1,ob2;
		ob1=new Employee("Soumya","brata",60000);
		ob2=new Employee("Raja","Das",30000);
		System.out.println(ob1.firstname+" "+ob1.lastname+" Salary="+ob1.salary);
		System.out.println(ob2.firstname+" "+ob2.lastname+" Salary="+ob2.salary);
		ob1.salary+=ob1.salary*0.1;
		ob2.salary+=ob2.salary*0.1;
		System.out.println("After Salary Hike");
		System.out.println(ob1.firstname+" "+ob1.lastname+" Salary="+ob1.salary);
		System.out.println(ob2.firstname+" "+ob2.lastname+" Salary="+ob2.salary);
	}

}
