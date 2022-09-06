package Fresh;

class Result extends Student implements Exam{
	public void Percent_cal() {
		double parcentage;
		parcentage=(marks1+marks2)/2;
		System.out.println("Percentage="+parcentage);
	}
	void perdisplay(){
		System.out.println("Name-"+name);
		System.out.println("Roll No-"+roll_no);
		System.out.println("Math-\t"+marks1+" Science- "+marks2);
		
	}
}