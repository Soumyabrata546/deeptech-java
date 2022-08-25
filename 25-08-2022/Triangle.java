package Second;

public class Triangle{
	int a,b,c;
	Triangle(){
		a=3;
		b=4;
		c=5;
	}
	float area() {
		return (b*c)/2;
	}
	int peri() {
		int p=a+b+c;
		return p;
	}
}
