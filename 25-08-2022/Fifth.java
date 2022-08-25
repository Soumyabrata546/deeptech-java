package Second;

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
