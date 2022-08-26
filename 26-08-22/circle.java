package Second;

public class circle {
double radius;
String color;
circle(){
	radius=1.0;
	color="red";
}
	circle(String s,double d){
		this.color="red";
		this.radius=d;
	}
	double getArea() {
	return Math.PI*radius*radius;	
	}
	void getRadius(double rad) {
		radius=rad;
	}

}
