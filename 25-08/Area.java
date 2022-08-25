package Second;

public class Area {
	int length;
	int breadth;
	void setDim(int len,int bread) {
		this.length=len;
		this.breadth=bread;
	}
	int getArea() {
		return length*breadth;
	}
}
