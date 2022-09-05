package Fresh;
//Create two user-defined exceptions named “TooHot” and “TooCold” to check the
//temperature (in Celsius) given by the user passed  is too hot or too cold.
//If temperature > 35, throw exception “TooHot”.
// If temperature <5, throw exception “TooCold”.
//Otherwise, print “Normal” and convert it to Farenheit.
public class second {
	static void checktemp(double temp)throws TooHot,TooCold {
		if(temp>35)
			throw new TooHot("To hot temperataure");
		else
			throw new TooCold("To Cold");
	}
public static void main(String args[]) {
	try {
		second.checktemp(45);
	} catch (TooHot e) {
		System.out.print(e.getMessage());
	} catch (TooCold e) {
		System.out.print(e.getMessage());
	}
}
}
