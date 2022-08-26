package Second;

public class Employe {
int pan_no;
String name;
int income;
double tax;
Employe(String name,int income,int pan){
	this.name=name;
	this.income=income;
	this.pan_no=pan;
//	System.out.println(this.name+this.income+this.pan_no);
}
double getTax() {
	if(income>100000) {
	tax=income-100000*0.1;
	}else if(income>150000) {
		tax=5000+(income-150000)*1/5;
	}else if(income>250000) {
		tax=25000+(income-250000)*3/10;
	}
	else {
		System.out.print("No Tax");
		
	}
	return tax;
}
}
